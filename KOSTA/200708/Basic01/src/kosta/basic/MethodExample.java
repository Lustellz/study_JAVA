package kosta.basic;

import java.util.Scanner;

public class MethodExample {
	static String titles[] = {"국어", "영어", "수학","총점","평균"};
	static int scores[]=new int[5];
	static int result = 0;
	public static void main(String[] args) {
		printCharacter('*', 30);
		System.out.println("Hello, Java");
		printCharacter('-', 30);
		Scanner input = new Scanner(System.in);
		for(int i=0;i<3;i++) {
			System.out.println(titles[i]+" 성적을 입력하세요");
			scores[i]=input.nextInt();
			scores[3]=total(scores[i]);
			scores[4]=avg(scores[3]);
		}
		
		for(int i=0;i<titles.length;i++) {
			System.out.print(titles[i]+"\t");
			System.out.println(scores[i]);
		}
	}
	
	static int total(int num) {
		return result+=num;
	}
	
	static int avg(int num) {
		return num/3;
	}
	
	
	static void printCharacter(char ch, int num) {
		for (int cnt = 0; cnt < num; cnt++)
			System.out.print(ch);
		System.out.println();
	}
	
	
	
	
	
}
