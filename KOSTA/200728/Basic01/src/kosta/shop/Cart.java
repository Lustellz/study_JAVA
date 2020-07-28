package kosta.shop;

public class Cart {

	private Product[] pArr;
	private int total;
	private int count;
	
	Cart(){
		this.pArr= new Product[4];
	}
	
	public Product[] getpArr() {
		return pArr;
	}
	
	public void addCart(Product p) {
		this.pArr[this.getCount()+1]=p;
		this.setCount();
	}
	
	public void orderList() {
		for(int i=0;i<this.getCount();i++) {
			this.pArr[i].show();
			this.total += (int) (this.pArr[i].getPrice()*(1-this.pArr[i].getDc()));
		}
		System.out.println("제품 갯수: "+this.count);
		System.out.println("총 구매 가격: "+this.total);
	}
	
	public void setpArr(Product[] pArr) {
		this.pArr = pArr;
	}
	public int getTotal() {
		return total;
	}
	public void setTotal(int total) {
		this.total = total;
	}
	public int getCount() {
		return count;
	}
	public void setCount() {
		this.count++;
	}
}
