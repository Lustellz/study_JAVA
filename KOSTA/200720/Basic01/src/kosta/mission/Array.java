package kosta.mission;

import java.util.Scanner;

public class Array {
	// 구구단 7단의 결과를 배열 안에 초기화 후 출력
	public static void main(String[] args) {

		int arr[] = new int[9];

		for (int i = 0; i < arr.length; i++) {
			arr[i] = 7 * (i + 1);
//			System.out.println(7 + "X" + (i + 1) + "=" + arr[i]);
		}

		// 문자열 배열을 생성 후 키보드로부터 데이터를 초기화 받고 배열 전체 내용을 출력하세요.
		// 'q'를 입력받으면 입력을 그만 받습니다.

		String arr_s[] = new String[10];

		Scanner input = new Scanner(System.in);
		boolean bp = false;
		int i = 0;
		do {
			if (i >= arr_s.length) {
				System.out.println("배열의 길이를 초과하였습니다.");
				break;
			} else {

				System.out.println("입력: ");
				String content = input.nextLine();
				if (content.equals("q"))
					bp = true;
				else {
					arr_s[i] = content;
					i++;
				}
			}
		} while (bp != true);
		
		for(int j=0;j<i;j++)
		System.out.print (arr_s[j]+" ");
	}
}
