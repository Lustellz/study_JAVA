package kosta.basic;

import java.util.Scanner;

public class LoopExample01 {

	public static void main(String[] args) {
		// while: 초기식 -> 조건식 -> 명령문 -> 증감식:수직구조
		int sum=0;
		int i = 1;
		while(i <=10) {
			sum+=i;
			i++;
		}

		System.out.println(sum);
		
		//구구단 7단 출력
		int num=7;
		int mul=1;
		
		while(mul<=9) {
//			System.out.println(num+"X"+mul+"= "+num*mul);
			mul++;
		}
		//do-while: 명령을 먼저 실행한 후 조건을 비교. 적어도 1번은 무조건 실행이 필요한 경우.
		
		//키보드로부터 입력받은 숫자까지의 합을 구하세요. 단, 음수를 입력받으면 다시 입력받으세요.
		
		Scanner input = new Scanner(System.in);

		int in_sum = 0;
		int in_num;
		int result = 0;
		
		do {
			System.out.println("The number is: ");
			in_num=input.nextInt();
		}while (in_num<10||in_num>99);
		
		while(in_sum <in_num) {
			in_sum++;
			result+=in_sum;
		}System.out.println(result);
	
		int sum2=0;
		for (int i2=0;i<10;i++) {
			sum2+=i;
		}
		System.out.println(sum2);
		
		for (int mul2=1;mul2<10;mul2++) {
			System.out.println(num+"X"+mul2+"= "+num*mul2);
		}
		
		for(int index=1;index<100;index++) {
			System.out.print(!(index%2==0||index%3==0)?index+" ":"");
		}
	}

}
