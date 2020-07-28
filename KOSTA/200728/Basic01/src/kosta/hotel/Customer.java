package kosta.hotel;

public class Customer {
	private String customerID;
	private String name;
	private String phone_no;
	private String details = null;
	private String pay_method;

	Customer() {
		this.customerID = "";
		this.name = "";
		this.phone_no = "";
		this.details = "";
		this.pay_method = "";
	}

	Customer(String name, String phone_no, String details) {
		this.name = name;
		this.phone_no = phone_no;
		this.details = details;
	}

	public boolean CheckIn(String roomID) {
		return true;
	}

	public boolean CheckOut(String roomID) {
		return true;
	}

	public String getCustomerID() {
		return customerID;
	}

	public void setCustomerID(String customerID) {
		this.customerID = customerID;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getPhone_no() {
		return phone_no;
	}

	public void setPhone_no(String phone_no) {
		this.phone_no = phone_no;
	}

	public String getDetails() {
		return details;
	}

	public void setDetails(String details) {
		this.details = details;
	}

	public String getPay_method() {
		return pay_method;
	}

	public void setPay_method(String p_type) {
		this.pay_method = p_type;
	}

}
