package kosta.phone;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		//CRUD
		//1. 추가 2, 출력 4. 종료
		Scanner input = new Scanner(System.in);
		boolean flag = false;
		Manager m = new Manager();
		while(flag !=true) {
			System.out.println("1. 추가 2. 출력 3. 검색 4. 종료");
			System.out.println("메뉴를 선택하세요: ");
			String menu =input.nextLine();
			
			switch(menu) {
			case "1":
				if(m.index>=10) {
					System.out.println("목록이 가득 찼습니다.");
					break;
				}
				else				
					m.createPhoneInfo();
				break;
				
			case "2":
				if(m.index==0) {
					System.out.println("읽어 올 정보가 없습니다.");
					break;
				}
				else
					m.listPhoneInfo();
				break;
				
			case "3":
				if(m.index==0) {
					System.out.println("읽어 올 정보가 없습니다.");
					break;
				}
				else
					System.out.println("검색할 이름을 입력하세요.");
					String name= input.nextLine();
					m.searchPhoneInfo(name);
					break;
			case "4":
				System.out.println("프로그램을 종료합니다.");
				flag = true;
				return;
			}//end switch
			
		}//end while
	}//end main()

}//end class
