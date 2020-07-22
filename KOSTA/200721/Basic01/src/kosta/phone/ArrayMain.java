package kosta.phone;

import java.util.Scanner;

public class ArrayMain {

	public static void main(String[] args) {
		// CRUD
		// 1. 추가 2. 출력 3. 검색 4. 수정 5. 삭제 6. 종료
		Scanner input = new Scanner(System.in);
		boolean flag = false;
		ArrayManager m = new ArrayManager();
		while (flag != true) {
			System.out.println("1. 추가 2. 출력 3. 검색 4. 수정 5. 삭제 6. 정렬 7. 종료");
			System.out.println("메뉴를 선택하세요: ");
			String menu = input.nextLine();

			switch (menu) {
			case "1":
				m.createPhoneInfo();
				break;

			case "2":
				if (m.index == 0) {
					System.out.println("읽어 올 정보가 없습니다.");
					break;
				} else
					m.listPhoneInfo();
				break;

			case "3":
				if (m.index == 0) {
					System.out.println("읽어 올 정보가 없습니다.");
					break;
				} else
					System.out.println("검색할 이름을 입력하세요.");
				String name = input.nextLine();
				m.searchPhoneInfo(name);
				break;

			case "4":
				if (m.index == 0) {
					System.out.println("읽어 올 정보가 없습니다.");
					break;
				} else
					System.out.println("수정할 이름을 입력하세요.");
				name = input.nextLine();
				m.updatePhoneInfo(name);
				break;

			case "5":
				if (m.index == 0) {
					System.out.println("읽어 올 정보가 없습니다.");
					break;
				} else
					System.out.println("삭제할 이름을 입력하세요.");
				name = input.nextLine();
				m.deletePhoneInfo(name);
				break;

			case "6": // 정렬하세요.

				System.out.println("정렬 기준을 선택하세요.");
				System.out.println("1. 이름 오름차순");
				System.out.println("2. 이름 내림차순");
				String choice = input.nextLine();
				switch (choice) {
				case "1":
					m.sortPhoneInfo(1);
					break;

				case "2":
					m.sortPhoneInfo(2);
					break;
				}
				break;

			case "7":
				System.out.println("프로그램을 종료합니다.");
				flag = true;
				return;
			}// end switch

		} // end while
	}

}
