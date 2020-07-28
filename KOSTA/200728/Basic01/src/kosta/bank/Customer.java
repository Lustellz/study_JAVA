package kosta.bank;

public class Customer {

	private String ID;
	private String name;
	private Account account;
	
	Customer(){
		
	};
	
	Customer(String ID, String name, long balance){
		this.account = new Account(ID,balance);
		this.ID= ID;
		this.name = name;
	}
	
	public String getId() {
		return this.ID;
	}

	public String getName() {
		return this.name;
	}
	
	public void setName(String name) {
		this.name = name;
	}

	public Account getAccount() {
		return this.account;
	}
	
	public void setAccount(Account account) {
		this.account = account;
	}

}
