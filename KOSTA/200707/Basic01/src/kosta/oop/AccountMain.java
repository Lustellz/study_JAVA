package kosta.oop;

public class AccountMain {

	public static void main(String[] args) {
		Account account = new Account();//객체 생성, 인스턴스화
		account.accountNo="1111111111";
		account.ownerName="me";
		account.balance=10000000;
		
		account.print();
		
		Account account2 = new Account();
		account2.accountNo = "2222222";
		account2.ownerName="park";
		account2.balance=1000;	
		Account arr[] = {new Account("111-1111","기호 1번",10000), new Account("222-2222", "기호 2번", 20000)};
		for(int i=0;i<arr.length;i++)
			arr[i].print();
	}

		
}
