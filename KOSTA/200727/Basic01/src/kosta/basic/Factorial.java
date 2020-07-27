package kosta.basic;

import java.util.Scanner;

public class Factorial {
		static int f(int n) {
			if(n>0) {
				return n*f(n-1);
			}else {
				return 1;
			}
		}
	public static void main(String[] args) {
		//5!=>5*4*3*2*1
		Scanner sc = new Scanner(System.in);
		
		System.out.print("정수 입력: ");
		int x = sc.nextInt();
		
		System.out.println(x+"!="+f(x)+" 입니다.");
	}

}
