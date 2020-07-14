package kosta.mission;

public class Book {
	String title;
	int price;
	
	public Book() {}
	
	public Book(String title, int price) {
		this.title=title;
		this.price=price;
	}
	
	public void print() {
		int price_offed = this.cal(this.price);
		System.out.println(this.title+" 교재의 정가는" +this.price+"원, 할인된 가격은"+price_offed+"원 입니다.");
	}
	
	public int cal(int price) {
		if(price>=30000)
			return price*=0.75;
		else if(price>=20000)
			return price*=0.8;
		else if(price>=15000)
			return price *=0.85;
		return price;
	}
}
