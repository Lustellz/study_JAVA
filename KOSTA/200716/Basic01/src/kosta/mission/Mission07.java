package kosta.mission;

import java.util.Random;
import java.util.Scanner;

public class Mission07 {

	public static void main(String[] args) {
		// Up_Down Game을 구현하세요.
		//1에서 100 사이의 숫자 중 임의의 숫자로 입력숫자와 비교해 UP/DOWN으로 정답을 맞추도록 하는 게임
		Random r = new Random();
		int answer = r.nextInt(100);
		
		Scanner choice = new Scanner(System.in);

		System.out.println("Guess the number: ");
		int picked;
		
		do {
			picked = choice.nextInt();
			if(picked>answer) System.out.println("DOWN");
			else if(picked<answer) System.out.println("UP");
		}while(picked!=answer);
		
			
		
		System.out.println("You got the answer. "+answer);
	}

}
