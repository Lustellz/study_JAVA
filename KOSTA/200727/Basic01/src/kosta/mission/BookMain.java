package kosta.mission;

public class BookMain {

	public static void main(String[] args) {
		int total = 0;
		Book arr[] = {new Book("JAVA", 30000),new Book("JSP",25000), new Book("Oracle",15000)};
		
		for(int i =0;i<arr.length;i++) {
			arr[i].print();
			total += arr[i].cal(arr[i].price);
		}
		System.out.println("총 금액은 "+total+"원 입니다.");
	}

}
