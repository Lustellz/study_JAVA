package kosta.oop2;

public class MinusAccount extends Account {

	int creditLine;
	public MinusAccount() {}
	
	public MinusAccount(String accountNo, String ownerName, int balance, int creditLine) {
		super(accountNo, ownerName, balance);
		this.creditLine = creditLine;
	}
	
	@Override
	public int withdraw(int amount) throws Exception{
		if(balance+creditLine<amount) {
			throw new Exception("잔액 부족");
		}
			
		balance-=amount;
		return amount;
	}

}
