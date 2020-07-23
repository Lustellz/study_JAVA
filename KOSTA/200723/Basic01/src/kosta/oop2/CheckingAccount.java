package kosta.oop2;

import kosta.oop2.Account;

public class CheckingAccount extends Account {
	private String cardNo;
	public int pay(String carNo, int amount) throws Exception{
		if(!carNo.equals(this.cardNo)||balance<amount)
			throw new Exception("결제 불가");
		else
			return withdraw(amount);
	}
	public CheckingAccount(String accountNo, String ownerName, int balance, String cardNo) {
		super(accountNo, ownerName,balance);
		this.cardNo = cardNo;
	}
}
