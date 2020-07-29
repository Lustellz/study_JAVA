package kosta.baseball;

import java.util.Scanner;

public class Runner {
	public static void main(String[] args) {
		int cnt = 0;
		boolean flag = false;

		System.out.println("야구 게임 시작");
		Answer answer = new Answer();
		Scanner input = new Scanner(System.in);
		do {
			System.out.println("당신의 추측은? ");
			String guess = input.nextLine();
			Reader entered = new Reader(guess);
			Checker check = new Checker(entered, answer);
			if (check.getS() == 3) {
				System.out.println("정답입니다.");
				flag = true;
				cnt++;
				System.out.println(cnt+"번 째에 성공");
			}

			else {
				System.out.println("틀렸습니다.");
				System.out.println(check.getS()+"S" +check.getB()+"B");
				cnt++;
			}
		} while (flag != true);

	}

}
