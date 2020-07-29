package kosta.data;

import java.util.LinkedList;
import java.util.Scanner;

public class QueueMission {
	static Scanner sc = new Scanner(System.in);
	static Scanner choice = new Scanner(System.in);
	static int totalSales = 0;

	public static void main(String[] args) {
		LinkedList<Order> list = new LinkedList<Order>();
		int idx = -1;
		Food foods[] = { new Food("짜장면", 5000), new Food("짬뽕", 5000), new Food("탕수육", 10000) };

		while (true) {
			System.out.println("1. 주문요청  2. 주문처리 3. 매출액 총액 4. 종료");
			System.out.print("선택: ");
			String menu = sc.nextLine();

			switch (menu) {
			case "1":

				System.out.println("주문하실 음식 번호를 입력해 주세요.");

				for (int i = 0; i < foods.length; i++)
					System.out.println(i + 1 + ". " + foods[i].getName() + " " + foods[i].getPrice());
				int food = choice.nextInt();
				System.out.println("수량을 입력해 주세요.");
				int amount = choice.nextInt();
				list.add(new Order(foods[food - 1], amount));
				System.out.println("주문이 추가 되었습니다.");
				idx++;
				break;
			case "2":
				if (idx != -1) {
					Order now = list.poll();
					System.out.println(now.getOrdered().keySet().iterator().next().getName() + " " + now.getOrdered().values().iterator().next());
					totalSales+=now.getOrdered().keySet().iterator().next().getPrice();
					idx--;
				} else
					System.out.println("주문 내역이 없습니다.");

				break;
			case "3":
				System.out.println("총매출액: " + totalSales);

				break;
			case "4":
				System.out.println("종료");
				return;
			}
		}

	}

}
