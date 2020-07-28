package kosta.hotel;

import java.util.Iterator;
import java.util.Scanner;

public class HotelMain {

	static ManagerService ms = new ManagerService();
	static Manager manager = new Manager();
	static Customer customer = new Customer();
	static Scanner input = new Scanner(System.in);
	static CustomerService cs = new CustomerService();

	public static void Manager_(String menu) {

		switch (menu) {
		case "1":
			System.out.println("방 번호를 입력하세요: ");
			String r_no = input.nextLine();
			System.out.println("방 타입을 입력하세요: ");
			String r_type = input.nextLine();
			System.out.println("방 가격을 입력하세요: ");
			int r_price = input.nextInt();

			Room room = new Room(r_no, r_type, r_price);
			ms.createRoom(manager, room);
			input.nextLine();
			break;

		case "2":
			System.out.println("삭제할 예약 번호를 입력하세요: ");

			String target = input.nextLine();
			ms.deleteReservation(manager, customer, target);
			break;

		case "3":

			break;

		case "4":

			break;

		case "5":

			break;

		}
	}

	public static void Customer_(String menu) {
		switch (menu) {
		case "1":
			System.out.println("이름을 입력하세요: ");
			String c_name = input.nextLine();
			System.out.println("전화 번호를 입력하세요: ");
			String c_phone_no = input.nextLine();
			customer.setName(c_phone_no);
			ms.createCustomer(manager, customer);
			input.nextLine();
			break;

		case "2":
			System.out.println("예약할 방 타입을 선택하세요: ");
			Iterator iter = manager.getRoom_list().iterator();
			while (iter.hasNext()) {
				System.out.println(iter.next());
			}
			String target = input.nextLine();

			System.out.println("숙박일자를 입력하세요.");

			String days = input.nextLine();
			Reservation r = new Reservation(target, days);
			ms.createReservation(manager, r);
			break;

		case "3":
			System.out.println("취소할 예약 번호를 입력하세요: ");

			break;

		case "4":

			break;

		}
	}

	public static void main(String[] args) {

		boolean flag = false;
		while (flag != true) {
			System.out.println("=====호텔 예약 시스템=====");
			System.out.println("역할을 선택하세요.");
			System.out.println("1. 예약담당자 \t2. 고객(투숙객) \t3. 프로그램 종료");
			String role = input.nextLine();

			switch (role) {
			case "1":

				System.out.println("1. 방 추가 2. 예약 삭제 3. 저장 4. 불러오기 5. 나가기");
				System.out.println("메뉴를 선택하세요: ");
				String menu = input.nextLine();
				Manager_(menu);
				break;

			case "2":
				System.out.println("1. 고객 정보 등록 2. 예약 3. 예약 취소 4. 나가기");
				System.out.println("메뉴를 선택하세요: ");
				menu = input.nextLine();
				Customer_(menu);
				break;

			case "3":
				return;
			}
		} // end while
	}

}
