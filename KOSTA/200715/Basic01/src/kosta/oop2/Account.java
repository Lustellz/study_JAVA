package kosta.oop2;

public class Account {
	// 공통된 데이터 구조
	// 계좌번호, 계좌주, 잔액->상태(특성)->멤버변수=필드

	String accountNo;
	String ownerName;
	int balance;

	Account() {
	};

	public Account(String accountNo, String OwnerName, int balance) {
		super();
		this.accountNo = accountNo;
		this.ownerName = OwnerName;
		this.balance = balance;
	}

	// 공통된 기능->행동(기능)=멤버메서드(오퍼레이션)
	// 입금/출금

	public void deposit(int amount) {
		balance += amount;
	}

	@SuppressWarnings("finally")
	public int withdraw(int amount) throws Exception {
		try {
			if(balance<amount)
				throw new Exception("잔액 부족");
			balance -=amount;
		}catch(Exception e) {
			System.out.println(e);
		}
		finally {
			return balance;	
		}
//		if (balance > amount)
//			return balance -= amount;
//		return 0;
	}

	public void print() {
		System.out.println("계좌번호: " + accountNo);
		System.out.println("계좌주: " + ownerName);
		System.out.println("잔액: " + balance);

	}
}
