package kosta.phone;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

//perform CRUD
public class ArrayManager {
	// 상태: Board[] arr
	// 행동: 추가, 전체 출력 기능(CRUD)
	private List<PhoneInfo> list;
	private PhoneInfo target;
	Iterator<PhoneInfo> now;
	static int index = 0;

	ArrayManager() {
		this.list = new ArrayList<PhoneInfo>();
		this.setTarget(new PhoneInfo());
		this.now = this.list.iterator();
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

		if (group.equals("1")) {

			this.list.add(new General(name, phoneNo, birthday, 1));
			index++;
		}

		else if (group.equals("2")) {

			System.out.println("전공: ");
			String major = input.nextLine();
			System.out.println("학번: ");
			int year = input.nextInt();
			this.list.add(new SchoolMates(name, phoneNo, birthday, major, year));
			index++;
		}

		else if (group.equals("3")) {

			System.out.println("부서: ");
			String dept = input.nextLine();
			System.out.println("직위: ");
			String pos = input.nextLine();
			this.list.add(new Colleagues(name, phoneNo, birthday, dept, pos));
			index++;
		}
		System.out.println();
		System.out.println(name + " 정보가 생성되었습니다.");
	}

	public void listPhoneInfo() {
		this.now = this.list.iterator();
		// 배열에 존재하는 모든 PhoneInfo를 출력하세요.
		while (this.now.hasNext())
			this.now.next().show();
	}

	public void searchPhoneInfo(String name) {
		this.now = this.list.iterator();
		while (this.now.hasNext()) {
			this.target = this.now.next();
			if (name.equals(this.target.getName())) {
				this.target.show();
				return;
			}
		}
		System.out.println("존재하지 않는 정보입니다.");
	}

	public void updatePhoneInfo(String name) {
		this.now = this.list.iterator();
		while (this.now.hasNext()) {
			this.target = this.now.next();
			if (name.equals(this.target.getName())) {
				System.out.println("수정할 번호를 입력하세요.");
				String phoneNo = input.nextLine();
				this.target.setPhoneNo(phoneNo);
				return;
			}
		}
		System.out.println("존재하지 않는 정보입니다.");
	}

	public void deletePhoneInfo(String name) {
		this.now = this.list.iterator();
		while (this.now.hasNext()) {
			this.target = this.now.next();
			if (this.target.getName().equals(name)) {
				this.list.remove(this.target);
				index--;
				return;
			}
		}
		System.out.println("존재하지 않는 정보입니다.");
	}

	public void sortPhoneInfo(int choice) {

		if (choice == 1) {
			Collections.sort(this.list, new Comparator<PhoneInfo>() {

				@Override
				public int compare(PhoneInfo o1, PhoneInfo o2) {
					if (o1.getName().compareTo(o2.getName()) > 0)
						return 1;
					else if (o1.getName().compareTo(o2.getName()) < 0)
						return -1;
					else
						return 0;
				}

			});

		} else {
			Collections.sort(this.list, new Comparator<PhoneInfo>() {

				@Override
				public int compare(PhoneInfo o1, PhoneInfo o2) {
					if (o1.getName().compareTo(o2.getName()) < 0)
						return 1;
					else if (o1.getName().compareTo(o2.getName()) > 0)
						return -1;
					else
						return 0;
				}

			});
		}
		listPhoneInfo();
	}

	public PhoneInfo getTarget() {
		return target;
	}

	public void setTarget(PhoneInfo target) {
		this.target = target;
	}
}
