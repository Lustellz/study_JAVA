package kosta.mission;

import java.util.Scanner;

public class Mission06 {

	public static void main(String[] args) {
		// 2개의 정수를 입력받아 b-a의 결과를 출력하세요.
		//단, b는 a보다 큽니다.
		
		//1. do~while로 
		int a;
		int b;
		Scanner input = new Scanner(System.in);
		do {
			System.out.println("큰 수를 입력하세요: ");
			b=input.nextInt();
			System.out.println("작은 수를 입력하세요: ");
			a=input.nextInt();
		}while(b<a);
		
		System.out.println(b-a);
		
		int c=0;
		int d=c+1;
		//2. while(true) break;로
		while(c<d){
			System.out.println("큰 수를 입력하세요: ");
			c=input.nextInt();
			System.out.println("작은 수를 입력하세요: ");
			d=input.nextInt();
		}
		
		System.out.println(c-d);
	}

}
