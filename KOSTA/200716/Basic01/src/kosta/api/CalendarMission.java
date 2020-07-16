package kosta.api;

import java.util.Calendar;
import java.util.Scanner;

public class CalendarMission {

	public static void main(String[] args) {
		// 2020년 7월 캘린더를 만드세요.
		// ex) 월 입력 시
		// <2020 7월>
		// 일 월 화 수 목 금 토
		// 1 2 3 4
		// 5 6 7 8 9 10 11
		System.out.println("월을 입력하세요.");
		Scanner input = new Scanner(System.in);
		int month = input.nextInt();
		char[] week = { '일', '월', '화', '수', '목', '금', '토' };
		Calendar gc = Calendar.getInstance();
		gc.set(2020, month - 1, 1);
		char first_day = week[gc.get(Calendar.DAY_OF_WEEK) - 1];
		int left_day = 7 - gc.get(Calendar.DAY_OF_WEEK) + 1;
		String space = "";
		switch (first_day) {

		case '일':

			break;

		case '월':
			space = "  ";
			break;
		case '화':
			space = "    ";
			break;

		case '수':
			space = "      ";
			break;

		case '목':
			space = "        ";
			break;

		case '금':
			space = "          ";
			break;

		case '토':
			space = "            ";
			break;
		}

		int n = gc.getActualMaximum(Calendar.DATE);
		System.out.println(first_day);

		System.out.println("<" + month + "월>");
		for (int i = 0; i < 7; i++)
			System.out.print(week[i] + " ");
		System.out.println();
		System.out.print(space);
		for (int i = 1; i < left_day + 1; i++)
			System.out.print(i + " ");

		for (int i = left_day + 1; i < n + 1; i++) {
			if ((i-left_day-1) % 7 == 0)
				System.out.println();
			System.out.print(i + " ");

		}

	}

}
