package kosta.hotel;

import java.util.ArrayList;
import java.util.List;

public class Manager {
	private String managerID;
	private int totalPrice;
	public List<Customer> cus_list;
	public List<Reservation> reservation_list;
	public List<Room> room_list;

	public Manager() {
		this.managerID = "";
		this.totalPrice = 0;
		this.cus_list = new ArrayList<Customer>();
		this.reservation_list = new ArrayList<Reservation>();
		this.room_list = new ArrayList<Room>();
	}

	public Manager(String managerID, int totalPrice, List<Customer> cus_list, List<Reservation> reservation_list,
			List<Room> room_list) {
		super();
		this.managerID = managerID;
		this.totalPrice = totalPrice;
		this.cus_list = cus_list;
		this.reservation_list = reservation_list;
		this.room_list = room_list;
	}

	public String getManagerID() {
		return managerID;
	}

	public void setManagerID(String managerID) {
		this.managerID = managerID;
	}

	public int getTotalPrice() {
		return totalPrice;
	}

	public void setTotalPrice(int totalPrice) {
		this.totalPrice = totalPrice;
	}

	public List<Customer> getCus_list() {
		return cus_list;
	}

	public void setCus_list(List<Customer> cus_list) {
		this.cus_list = cus_list;
	}

	public List<Reservation> getReservation_list() {
		return reservation_list;
	}

	public void setReservation_list(List<Reservation> reservation_list) {
		this.reservation_list = reservation_list;
	}

	public List<Room> getRoom_list() {
		return room_list;
	}

	public void setRoom_list(List<Room> room_list) {
		this.room_list = room_list;
	}

}
