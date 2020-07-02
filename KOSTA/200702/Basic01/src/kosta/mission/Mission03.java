package kosta.mission;

import java.util.Scanner;

public class Mission03 {

	static int div_result(int num) {
		return num%2;
	}
	
	static int each_num(int num, int cnt) {
		return num/cnt;
	}
	
	public static void main(String[] args) {
		// 5자리인 임의의 정수값에 대해서 전체 자리 수 중 짝수 및 홀수의 갯수를 구하세요.
		
		Scanner sc = new Scanner(System.in);
		System.out.println("5자리 정수 입력: ");
		
		int input=sc.nextInt();
		int divider = 10000;
		int even=0;
		int odd=0;
		
		odd+=div_result(each_num(input,divider));
		input%=10000;
		divider/=10;
		
		odd+=div_result(each_num(input,divider));
		input%=1000;
		divider/=10;
		
		odd+=div_result(each_num(input,divider));
		input%=100;
		divider/=10;
		
		odd+=div_result(each_num(input,divider));
		input%=10;
		divider/=10;
		
		odd+=div_result(each_num(input,divider));

		even = 5-odd;
	
		System.out.println("홀수: "+odd+" 짝수: "+even);
		
		String n1="123";
		int n2=Integer.parseInt(n1);
		
		even+=(input/10000%2==0)?1:0;
		even+=(input/1000%10%2==0)?1:0;
		even+=(input/100%10%2==0)?1:0;
		even+=(input/10%10%2==0)?1:0;
		even+=(input%2==0)?1:0;
		odd = 5-even;
		
		sc.nextLine();
		System.out.println("You are: ");
		String mid="lustellz";
		String id=sc.nextLine();
		
		if(id.equals(mid.trim())) {
			System.out.println("Accepted");
		}else System.out.println("Who are you?");
	}

}
