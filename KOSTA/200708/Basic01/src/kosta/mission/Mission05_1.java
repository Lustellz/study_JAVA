package kosta.mission;

import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

public class Mission05_1 {

	public static void main(String[] args) {
		// 평균을 기준으로 오름/내림차순 정렬을 시행하세요.
		String titles[] = { "국어 ", "영어 ", "수학 ", "총점", "평균" };

		Scanner input = new Scanner(System.in);

		System.out.println("학생의 수는?");
		int entered = input.nextInt();
		int scores[][] = new int[entered][5];

		for (int i = 0; i < entered; i++) {

			for (int j = 0; j < 3; j++) {
				System.out.println(titles[j] + "성적을 입력하세요: ");
				scores[i][j] = input.nextInt();
				scores[i][3] += scores[i][j];
			}
			scores[i][4] = scores[i][3] / 3;
		}

		Arrays.sort(scores, new Comparator<int[]>() {

			@Override
			public int compare(int[] o1, int[] o2) {
				if (o1[4] < o2[4])
					return -1;
				else if (o1[4] > o2[4])
					return 1;
				else
					return 0;
			}
		});

		for (int cnt = 0; cnt < titles.length; cnt++)
			System.out.print(titles[cnt] + "\t \t");
		System.out.println();
		for (int cnt = 0; cnt < entered; cnt++) {
			for (int cnt_ = 0; cnt_ < 5; cnt_++)
				System.out.print(scores[cnt][cnt_] + "점\t \t");
			System.out.println();
		}

		System.out.println();
		Arrays.sort(scores, new Comparator<int[]>() {

			@Override
			public int compare(int[] o1, int[] o2) {
				if (o1[4] < o2[4])
					return 1;
				else if (o1[4] > o2[4])
					return -1;
				else
					return 0;
			}
		});

		for (int cnt = 0; cnt < titles.length; cnt++)
			System.out.print(titles[cnt] + "\t \t");
		System.out.println();
		for (int cnt = 0; cnt < entered; cnt++) {
			for (int cnt_ = 0; cnt_ < 5; cnt_++)
				System.out.print(scores[cnt][cnt_] + "점\t \t");
			System.out.println();
		}

		//정렬(평균을 기준으로 오름차순, 내림차순)
		for(int i=0;i<scores.length;i++) {
			for(int j=0;j<scores.length;j++) {
				if(scores[i][4]<scores[j][4]) {
					int temp[];
					temp = scores[i];
					scores[i]=scores[j];
					scores[j]=temp;
				};
			}
		}
		
	}

}
