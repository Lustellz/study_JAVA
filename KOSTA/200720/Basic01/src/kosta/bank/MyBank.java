package kosta.bank;

public class MyBank {
	
	private int customersNum=0;
	private Customer customers[];
	
	MyBank() {
		customers = new Customer[5];
	};
	
	public void addCustomer(String ID, String name, long balance) {
		
		Customer customer = new Customer(ID, name, balance);
		customers[this.customersNum]=customer;
		this.customersNum++;
	}
	
	public int getCustomersNum() {
		return customersNum;
	}

	public Customer getCustomer(String ID) {
		Customer cust = new Customer();
		for(int i=0;i<this.customersNum;i++)
		{
			if(this.customers[i].getId().equals(ID))
				cust = customers[i];
			else
				return null;
		}
		
		return cust;
	}

	public Customer[] getAllCustomers() {
		Customer newcus[] = new Customer[customersNum];
		System.arraycopy(customers, 0, newcus, 0, customersNum);
		return newcus;
	}



}
