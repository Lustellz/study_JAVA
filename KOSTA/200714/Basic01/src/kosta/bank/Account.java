package kosta.bank;

public class Account {
	private String ID;
	private long balance;

	public String getId() {
		return this.ID;
	}

	public long getBalance() {
		return this.balance;
	}

	Account() {
	};

	Account(String ID, long balance) {
		this.ID = ID;
		this.balance = balance;
	};

	public boolean withdraw(long amt) {
		if (this.balance > amt) {
			this.balance -= amt;
			return true;
		} else
			return false;
	}

	public long deposit(long amt) {
		return this.balance += amt;
	}

}
