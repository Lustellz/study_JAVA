package kosta.shop;

public class Phone implements Product {

	private String name;
	private int price;
	private double dc;

	Phone() {
	}

	Phone(String name, int price, double dc) {
		this.name=name;
		this.price=price;
		this.dc=dc;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Override
	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	@Override
	public double getDc() {
		return dc;
	}

	public void setDc(double dc) {
		this.dc = dc;
	}

	@Override
	public void show() {
		System.out.println("상품 이름: "+this.name+" 상품 가격: "+this.price+" 상품 할인율: "+this.dc);

	}

}
