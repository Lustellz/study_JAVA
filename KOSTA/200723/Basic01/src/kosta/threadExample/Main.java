package kosta.thread;

public class Main {

	public static void main(String[] args) {
		Manager m = new Manager();
		
		Baker b1 = new Baker("김탁구", m);
		Baker b2 = new Baker("박탁구", m);
		Baker b3 = new Baker("조탁구", m);
		
		Customer c1 = new Customer("김소비", m);
		Customer c2 = new Customer("성소비", m);
		Customer c3 = new Customer("정소비", m);
		
		b1.start();
		b2.start();
		b3.start();
		
		c1.start();
		c2.start();
		c3.start();
	}

}














