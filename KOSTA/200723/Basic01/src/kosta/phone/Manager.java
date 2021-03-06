package kosta.phone;

import java.util.Scanner;

//perform CRUD
public class Manager {
	// 상태: Board[] arr
	// 행동: 추가, 전체 출력 기능(CRUD)
	PhoneInfo list[];
	static int index = 0;

	Manager() {
		list = new PhoneInfo[10];
	}

	Scanner input = new Scanner(System.in);

	public void createPhoneInfo() {
		// 정보를 입력 받으세요.
		// 생성되는 Board 객체의 인덱스는 변수입니다.
		// 1. 일반 2. 동창(major, year) 3. 직장(dept, pos)
		System.out.println("이름을 입력하세요.");
		String name = input.nextLine();
		System.out.println("전화번호를 입력하세요.");
		String phoneNo = input.nextLine();
		System.out.println("생년월일을 입력하세요.");
		String birthday = input.nextLine();
		System.out.println("그룹을 선택하세요. ");
		System.out.println("1. 미지정 2. 동창 3. 직장");
		String group = input.nextLine();
		
		if(group.equals("1")) {

			list[index] = new General(name, phoneNo, birthday,1);
			index++;
		}
		
		else if(group.equals("2")) {
			
			System.out.println("전공: ");
			String major = input.nextLine();
			System.out.println("학번: ");
			int year = input.nextInt();			
			list[index] = new SchoolMates(name, phoneNo, birthday,major,year);
			index++;
		}
		
		else if(group.equals("3")) {
			
			System.out.println("부서: ");
			String dept = input.nextLine();
			System.out.println("직위: ");
			String pos = input.nextLine();		
			list[index] = new Colleagues(name, phoneNo, birthday,dept,pos);
			index++;
		}

	}

	public void listPhoneInfo() {
		// 배열에 존재하는 모든 PhoneInfo를 출력하세요.
		for (int i = 0; i < index; i++)
			list[i].show();
	}

	public void searchPhoneInfo(String name) {
		for (int i = 0; i < index; i++) {
			if (name.equals(list[i].getName())) {
				list[i].show();
				return;
			} else {
				System.out.println("존재하지 않는 정보입니다.");
				return;
			}
		}

	}

	public void updatePhoneInfo(String name) {
		for (int i = 0; i < index; i++) {
			if (name.equals(list[i].getName())) {
				System.out.println("수정할 번호를 입력하세요.");
				String phoneNo = input.nextLine();
				list[i].setPhoneNo(phoneNo);
				return;
			} else {
				System.out.println("존재하지 않는 정보입니다.");
				return;
			}
		}

	}

	public void deletePhoneInfo(String name) {
		for (int i = 0; i < index - 1; i++) {
			if (name.equals(list[i].getName())) {
				list[i] = list[i + 1];
				list[index - 1] = null;
				return;
			} else
				System.out.println("존재하지 않는 정보입니다.");
			return;
		}
	}
}
