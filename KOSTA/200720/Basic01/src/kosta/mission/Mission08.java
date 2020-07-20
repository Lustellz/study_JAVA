package kosta.mission;

import java.util.Scanner;

public class Mission08 {

	public static void main(String[] args) {
		// 메뉴를 선택해서 해당 메뉴의 명령을 실행하세요.

		// String 배열을 생성해서 그 요소에 대한 작업을 합니다.
		// 1. 추가 2. 출력 3. 검색(해당 인덱스의 배열 값 출력) 4. 종료
		String arr[] = new String[10];

		Scanner choice = new Scanner(System.in);
		Scanner strings = new Scanner(System.in);
		boolean flag = false;
		do {
			System.out.println("메뉴를 선택하세요.");
			System.out.println("1. 추가 \t 2. 출력 \t 3. 검색 \t 4. 종료");
			String menu = choice.nextLine();
			switch (menu) {
			case "1":
				for (int i = 0; i < arr.length; i++) {

					System.out.println("추가 할 문자열을 입력하세요(" + arr.length + "개): ");
					System.out.println(i + "번: ");
					arr[i] = strings.nextLine();
					System.out.println();
				}
				break;
			case "2":
				for(int i =0;i<arr.length;i++)
					System.out.print(arr[i]+" ");
				break;
			case "3":
				System.out.println("검색할 인덱스의 번호를 입력하세요.(0번~" + arr.length + "번 사이): ");
				int index = strings.nextInt();
				System.out.println(arr[index]);
				System.out.println();
				break;
			case "4":
				flag=true;
				break;
			}
		} while (flag!=true);

	}
}
