package kosta.hotel;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.Iterator;
import java.util.List;
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

			Iterator no_shows = manager.getReservation_list().iterator();
			List<Reservation> invalid = new ArrayList<Reservation>();
			while (no_shows.hasNext()) {
				Reservation ul_res = (Reservation) no_shows.next();
				if (ul_res.getDate() != Calendar.getInstance().toString()) {
					if (!ul_res.isCheckIn() && !ul_res.isCheckOut()) {
						System.out.println(ul_res);
						invalid.add(ul_res);
					}
				}
				;
			}
			if (invalid.get(0) != null) {
				System.out.println("삭제할 예약 번호를 입력하세요: ");
				String target = input.nextLine();
				for (int i = 0; i < invalid.size(); i++) {
					if (invalid.get(i).getReservationID().equals(target))
						ms.deleteReservation(manager, invalid.get(i));
				}
			} else
				System.out.println("존재하지 않는 예약입니다.");

			break;

		case "3":
			Iterator reserved = manager.getReservation_list().iterator();
			while (reserved.hasNext()) {
				Reservation now = (Reservation) reserved.next();
				System.out.println(now.getReservationID());
			}
			break;

		case "4":
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
			customer.setName(c_name);
			customer.setPhone_no(c_phone_no);
			ms.createCustomer(manager, customer);
			input.nextLine();

			break;

		case "2":

			if (customer.getName() != null) {
				Room reserving = null;
				while (reserving == null) {
					System.out.println("예약할 방 타입을 선택하세요: ");
					Iterator iter = manager.getRoom_list().iterator();
					while (iter.hasNext()) {
						Room room = (Room) iter.next();
						System.out.println("방 타입: " + room.getRoomType() + " 가격: " + room.getPrice());
					}

					String target = input.nextLine();

					for (int i = 0; i < manager.getRoom_list().size(); i++) {
						if (manager.getRoom_list().get(i).getRoomType().equals(target)) {
							reserving = manager.getRoom_list().get(i);
						}
					}
					if (reserving == null)
						System.out.println("존재하지 않는 방 타입입니다.");

				}
				System.out.println(reserving.getRoomID());
				System.out.println("숙박일자를 입력하세요.");
				String days = input.nextLine();
				Reservation r = new Reservation(reserving, days);
				r.setCustomer(customer);
				System.out.println(customer.getName() + "님의 예약 번호는 " + ms.createReservation(manager, r) + "입니다.");

			}

			else
				System.out.println("고객 정보 등록을 먼저 해주세요.");
			break;

		case "3":
			System.out.println("취소할 예약 번호를 입력하세요: ");
			String to_delete = input.nextLine();
			Reservation to_deleted = null;
			for (int i = 0; i < manager.getReservation_list().size(); i++) {
				if (manager.getReservation_list().get(i).getReservationID().equals(to_delete))
					to_deleted = manager.getReservation_list().get(i);
				ms.deleteReservation(manager, to_deleted);
			}
			if (to_deleted == null)
				System.out.println("존재하지 않는 예약입니다.");
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

				System.out.println("1. 방 추가 2. 예약 삭제 3. 예약 목록 출력 4. 나가기");
				System.out.println("메뉴를 선택하세요: ");
				String menu = input.nextLine();
				Manager_(menu);
				break;

			case "2":
				System.out.println("1. 고객 정보 등록  2. 예약 3. 예약 취소  4. 나가기");
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
