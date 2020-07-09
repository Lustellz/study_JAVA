package kosta.basic;

import java.util.Scanner;

public class LoopExample02 {

	public static void main(String[] args) {
		// 구구단 2~9단을 출력하세요.
		for (int i = 2; i < 9; i++) {
			System.out.println("*" + i + "단");
			for (int j = 1; j < 10; j++)
				System.out.println(i + "X" + j + "=" + i * j);

			System.out.println();
		}

		for (int x = 0; x <= 60; x++) {
			for (int y = 0; y <= 60; y++) {
				if (4 * x + 5 * y == 60)
					System.out.println("4X" + x + "+" + "5X" + y + "=" + (4 * x + 5 * y));
			}
		}

		for (int i = 0; i < 6; i++) {
			for (int j = 0; j < i; j++)
				System.out.print("*");
				System.out.println();
		}
		System.out.println();

		for (int i = 5; i > 0; i--) {
			for (int j = i; j >0; j--)
				System.out.print("*");
			System.out.println();
		}

		// 입력한 정수를 이용하여 산을 구현해 보세요.

		Scanner input = new Scanner(System.in);
		System.out.println("숫자를 입력하세요.");
		int num = input.nextInt();

		for (int i = 0; i < num; i++) {
			for (int j =num-i; j > 0; j--)
				System.out.print("  ");

			for (int k = 0; k < i * 2 + 1; k++)
				System.out.print("*");

			System.out.println();
		}
	}
}
