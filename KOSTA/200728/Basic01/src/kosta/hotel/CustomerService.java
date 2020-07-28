package kosta.hotel;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import kosta.phone.Manager;

public class CustomerService {
	// 디폴트
	public CustomerService() {
	}

	List<Customer> cus_list = new ArrayList<Customer>();
	List<Manager> m_list = new ArrayList<Manager>();
	List<Room> room_list = new ArrayList<Room>();
	List<Reservation> res_list = new ArrayList<Reservation>();

	Scanner sc = new Scanner(System.in);

	public void addCustomerInfo() { // 고객서비스 : 고객정보등록
		System.out.println("id를 입력하세요. : ");
		String c_id = sc.nextLine();
		System.out.println("고객의 이름을 입력하세요. :");
		String c_name = sc.nextLine();
		System.out.println("고객의 연락처를 입력하세요. :");
		String c_phoneNo = sc.nextLine();

		this.cus_list.add(new Customer(c_id, c_name, c_phoneNo));
	}

	public Reservation cusReservation() { // 고객서비스 : 고객이 룸 타입을 선택한다.
		System.out.println("객실유형을 고르세요. 1.싱글룸\t|\t2.트윈룸\t|\t3.스위트룸");
		String r_type = sc.nextLine();
		System.out.println("사용하실 날짜를 입력하세요.(6글자 ex:200728");
		String r_date = sc.nextLine();

		return new Reservation(r_type, r_date);
	}

	public String cusPayment(Customer c) { // 고객서비스 : 결제시스템
		System.out.println("결제방식을 고르세요. 1.현금\t|\t2.카드\t|\t3.수표");
		String p_type = sc.nextLine();
		c.setPay_method(p_type);

		return c.getPay_method();
	}

	public Reservation totalSave(Reservation r) { // 고객서비스 : 예약취소(삭제)
		System.out.println("예약취소할 예약번호(id)를 입력하세요");
		String cancle = sc.nextLine();
		r.setReservationID(cancle);
		return r;
	}
}
