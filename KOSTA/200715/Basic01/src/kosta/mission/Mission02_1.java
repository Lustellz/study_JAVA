package kosta.mission;

import java.util.Scanner;

public class Mission02_1 {

	public static void main(String[] args) {
		// Misson02의 변수들을 배열로 바꿔서 작성하세요.
		
		int grade[]=new int[5];
		String titles[]= {"국어", "영어","수학","총점","평균"};

		Scanner input = new Scanner(System.in);
		for(int i=0;i<3;i++) {
			System.out.println(titles[i]+" 점수를 입력하세요: ");
			grade[i]=input.nextInt();
			grade[3]+=grade[i];
		}
		
		grade[4]= grade[3] / 3;

		System.out.println(titles[3] + ": "+grade[3]);
		System.out.println(titles[4]+ ": "+grade[4]);

	}

}
