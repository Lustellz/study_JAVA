package kosta.oop2;

public class CheckingMain {

	public static void main(String[] args) {
		CheckingAccount ca = new CheckingAccount("111-111","1번",10000,"111-112");
		CheckingAccount ca2 = new CheckingAccount("111-111","1번",10000,"111-112");
		try {
			ca.pay("111-112", 45);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		ca.print();
		
		System.out.println((ca.accountNo).equals(ca2.accountNo));
		
	}

}
