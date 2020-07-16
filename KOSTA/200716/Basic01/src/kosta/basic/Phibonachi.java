package kosta.basic;

import java.util.Scanner;

public class Phibonachi {

	static int phibo(int num) {
		
		if(num<=1)
		     return 0;
		
		if (num==2)
			return 1;

		else return phibo(num-1)+phibo(num-2);
	};
	
	public static void main(String[] args) {
		
		Scanner input =new Scanner(System.in);
		System.out.println("Phibonachi를 구할 항의 번호: ");
		int n = input.nextInt();

		System.out.println(phibo(n));

	}

}
