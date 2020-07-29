package kosta.hotel;

import java.util.Iterator;
import java.util.List;

public class ManagerService {

	private List<Room> r_list;
	private List<Customer> c_list;

	public void createRoom(Manager m, Room r) {
		this.r_list = m.getRoom_list();
		r_list.add(r);
		m.setRoom_list(r_list);
	}

	public void createCustomer(Manager m, Customer c) {
		this.c_list = m.getCus_list();
		c_list.add(c);
		m.setCus_list(c_list);
	}

	public String createReservation(Manager m, Reservation r) {
		List<Reservation> res_list = m.getReservation_list();

		if (r.getRoomID() != null) {
			Reservation reservation = new Reservation(r.getRoomID(), r.getDate(), false, false, r.getPrice(),
					r.getCustomer(), r.getRoom());
			res_list.add(reservation);
			return reservation.getReservationID();
		} else {

			Iterator iter_res = res_list.iterator();
			String room_type = "";
			String room_no = "";
			int room_price = 0;
			while (iter_res.hasNext()) {
				Reservation res = (Reservation) iter_res.next();
				if (res.getRoom().getRoomType().equals(r.getRoom().getRoomType()))
					;
				room_type = res.getRoom().getRoomType();
				room_price = res.getRoom().getPrice();
			}
			Iterator iter = res_list.iterator();
			int tmp = (int) (Math.random() * 1000 + 1);
			while (iter.hasNext()) {
				Reservation reservation = (Reservation) iter.next();
				if (!reservation.getRoomID().equals(Integer.toString(tmp)))
					room_no = Integer.toString(tmp);
			}
			r.setRoomID(room_no);
			return createReservation(m, r);
		}

	}

	public void deleteCustomer(Manager m, Customer c) {
		this.c_list = m.getCus_list();
		c_list.remove(c);
		m.setCus_list(c_list);
	}

	public void deleteReservation(Manager m, Reservation r) {
		List<Reservation> r_list = m.getReservation_list();
		r_list.remove(r);
		System.out.println("예약이 삭제되었습니다.");
	}

	public Receipt pay(Manager m, String c, String reservID) {
		List<Reservation> r_list = m.getReservation_list();
		Iterator iter = r_list.iterator();
		while (iter.hasNext()) {
			Reservation target = (Reservation) iter.next();
			if (target.getReservationID().equals(reservID)) {
				m.setTotalPrice(m.getTotalPrice() + target.getPrice());
				r_list.remove(target);
				System.out.println("정상적으로 처리되었습니다.");
				return new Receipt(c);
			}
			System.out.println("존재하지 않는 예약입니다.");
		}
		return null;
	}
}
