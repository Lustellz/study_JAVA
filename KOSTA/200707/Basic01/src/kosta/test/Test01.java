package kosta.test;

import java.util.Random;

public class Test01 {

	public static void main(String[] args) {
		// 최대값, 최소값 구하기

		int score[] = { 23, 63, 12, 99, 34, 87, 22 };
		int max = score[0];
		int min = score[0];

		for (int i = 0; i < score.length; i++) {
			if (score[i] > max)
				max = score[i];
			if (score[i] < min)
				min = score[i];

		}
		System.out.println("최대: " + max);
		System.out.println("최소: " + min);

		// swap 구현(12와 34의 자리를 바꾸자)

		int tmp;

		for (int i = 0; i < score.length; i++)
			System.out.print(score[i] + ", ");

		System.out.println();

		tmp = score[2];
		score[2] = score[4];
		score[4] = tmp;

//		for (int i = 0; i < score.length; i++)
//			System.out.print(score[i] + ", ");

		// 난수 구하기(Math.random()이 0.0부터 0.9까지 double형)
		int n = (int) (Math.random() * 6) + 1;
//		System.out.println(n);

		Random r = new Random();
		int n2 = r.nextInt(6) ;// 0부터 범위의 값을 정해 줌
		System.out.println(n2);

		for (int i = 0; i < score.length; i++) {
			tmp = score[n2];
			score[n2] = score[i];
			score[i] = tmp;
		}

		for (int i = 0; i < score.length; i++)
			System.out.print(score[i] + ", ");
	}

}
