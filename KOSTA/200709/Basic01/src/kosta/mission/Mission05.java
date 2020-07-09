package kosta.mission;

import java.util.Scanner;

public class Mission05 {

	public static void main(String[] args) {
		// 국어, 영어, 수학, 점수를 입력받아 총점과 평균을 계산합니다.
		// 단, 2명 이상의 성적을 입력받습니다(2차원 배열을 구현하세요.)
		// 과목명에 대한 1차원 배열을 생성하고 각 학생에 대한 총점, 배열을 출력하세요.

		String titles[] = { "이름", "국어 ", "영어 ", "수학 ", "총점", "평균" };

		Scanner input = new Scanner(System.in);

		Scanner name = new Scanner(System.in);
		System.out.println("학생의 수는?");
		int entered = input.nextInt();
		int scores[][] = new int[entered][5];
		String names[] = new String[entered];

		for (int i = 0; i < entered; i++) {
			System.out.println(titles[0] + "을 입력하세요: ");
			names[i] = name.nextLine();

			for (int j = 1; j < 4; j++) {
				System.out.println(titles[j] + "성적을 입력하세요: ");
				scores[i][j - 1] = input.nextInt();
				scores[i][3] += scores[i][j - 1];
			}
			scores[i][4] = scores[i][3] / 3;
		}

		for (int cnt = 0; cnt < titles.length; cnt++)
			System.out.print(titles[cnt] + "\t \t");
		System.out.println();
		for (int cnt = 0; cnt < entered; cnt++) {
			System.out.print(names[cnt] + "\t");
			for (int cnt_ = 0; cnt_ < 5; cnt_++)
				System.out.print(scores[cnt][cnt_] + "점\t");
			System.out.println();
		}

	}

}
