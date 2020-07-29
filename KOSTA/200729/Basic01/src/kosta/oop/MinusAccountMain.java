package kosta.oop;

import kosta.oop2.MinusAccount;

public class MinusAccountMain {

	public static void main(String[] args) {
		MinusAccount ma= new MinusAccount("1111,","홍길동",10000,10000);

		try {
			ma.withdraw(15000);
		}catch(Exception e) {
			e.printStackTrace();
		}
		ma.print();
	}

}
