package kosta.hotel;

public class Receipt extends Reservation {

	private String pay_type;

	Receipt() {
		super();
	};

	Receipt(String pay_type) {
		super();
		this.pay_type = pay_type;
		System.out.println(super.getCustomer().getName() + "님의 " + super.getRoomID() + "방 숙박 계산이 처리되었습니다.");
		System.out.println("지불 유형: " + pay_type);
		System.out.println("지불 금액: " + super.getPrice());
	}

	public String getPay_type() {
		return pay_type;
	}

	public void setPay_type(String pay_type) {
		this.pay_type = pay_type;
	};
}
