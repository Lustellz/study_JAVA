package kosta.shop;

public class NoteBook implements Product {

	String name;
	int price;
	double dc;
	
	NoteBook(){}
	
	public NoteBook(String name, int price, double dc) {
		this.name=name;
		this.price=price;
		this.dc=dc;
	}
	
	@Override
	public int getPrice() {
		return price;
	}

	@Override
	public double getDc() {
		return dc;
	}

	@Override
	public void show() {
		System.out.println("상품 이름: "+this.name+" 상품 가격: "+this.price+" 상품 할인율: "+this.dc);	
	}

}
