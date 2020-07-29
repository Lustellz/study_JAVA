
package kosta.hotel;

public class Reservation {
	private String reservationID;
	private String roomID;
	private String date;
	private boolean checkIn;
	private boolean checkOut;
	private int price;
	private Customer customer;
	private Room room;

	public Reservation() {
		this.reservationID = null;
		this.roomID = null;
		this.date = null;
		this.checkIn = false;
		this.checkOut = false;
		this.price = 0;
		this.customer = null;
		this.room = null;
	}

	public Reservation(Room room, String r_date) {
		this.roomID = null;
		this.room = room;
		this.date = r_date;
	}

	public Reservation(String roomID, String date, boolean checkIn, boolean checkOut, int price, Customer customer,
			Room room) {
		super();
		this.reservationID = roomID + date + customer;
		this.roomID = roomID;
		this.date = date;
		this.checkIn = checkIn;
		this.checkOut = checkOut;
		this.price = price;
		this.customer = customer;
		this.room = room;
	}

	public String getRoomID() {
		return roomID;
	}

	public void setRoomID(String roomID) {
		this.roomID = roomID;
	}

	public String getDate() {
		return date;
	}

	public void setDate(String date) {
		this.date = date;
	}

	public boolean isCheckIn() {
		return checkIn;
	}

	public void setCheckIn(boolean checkIn) {
		this.checkIn = checkIn;
	}

	public boolean isCheckOut() {
		return checkOut;
	}

	public void setCheckOut(boolean checkOut) {
		this.checkOut = checkOut;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	public Customer getCustomer() {
		return customer;
	}

	public void setCustomer(Customer customer) {
		this.customer = customer;
	}

	public Room getRoom() {
		return room;
	}

	public void setRoom(Room room) {
		this.room = room;
	}

	public String getReservationID() {
		return reservationID;
	}

	public void setReservationID(String reservationID) {
		this.reservationID = reservationID;
	}

}
