package kosta.mission;

import java.util.Scanner;

public class Mission02 {

	public static void main(String[] args) {
		// 국어, 영어, 수학 점수를 입력받아 총점과 평균을 출력하세요.

		int ko = 0;
		int eng = 0;
		int math = 0;

		Scanner input = new Scanner(System.in);
		System.out.println("국어 점수를 입력하세요: ");
		ko = input.nextInt();
		System.out.println("영어 점수를 입력하세요: ");
		eng = input.nextInt();
		System.out.println("수학 점수를 입력하세요: ");
		math = input.nextInt();

		int score_sum = ko + eng + math;
		double score_avg = (ko + eng + math) / 3.0;

		System.out.println("총점: " + score_sum);
		System.out.println("평균: " + score_avg);

//		int sum=0;
//		int aver = 0;
//		sum=ko+eng+math;
//		aver=(int)(sum/3.0);

//		if (score_avg >= 90)
//			System.out.println("A");
//		else if (score_avg >= 80)
//			System.out.println("B");
//		else if (score_avg >= 70)
//			System.out.println("C");
//		else if (score_avg >= 60)
//			System.out.println("D");
//		else
//			System.out.println("E");

		int score_case = (int) (score_avg / 10);

		switch (score_case) {
		case 0:
		case 1:
		case 2:
		case 3:
		case 4:
		case 5:
			System.out.println("E");
			break;
		case 6:
			System.out.println("D");
			break;
		case 7:
			System.out.println("C");
			break;
		case 8:
			System.out.println("B");
			break;
		case 9:
		case 10:
			System.out.println("A");
			break;
		}
	}

}
