package kosta.hotel;

public class Room {
	private String roomID;
	private String roomType;
	private int price;

	public Room() {
	}

	public Room(String roomID, String roomType, int price) {
		super();
		this.roomID = roomID;
		this.roomType = roomType;
		this.price = price;
	}

	public String getRoomID() {
		return roomID;
	}

	public void setRoomID(String roomID) {
		this.roomID = roomID;
	}

	public String getRoomType() {
		return roomType;
	}

	public void setRoomType(String roomType) {
		this.roomType = roomType;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

}
