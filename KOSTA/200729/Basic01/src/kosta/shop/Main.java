package kosta.shop;

import java.util.Scanner;

import kosta.phone.Manager;

public class Main {

	public static void main(String[] args) {

		Product arr[] = { new Phone("phone", 10000000, 0.3), new NoteBook("notebook", 9999999, 0.1), new Phone("phone2",10000,0.5),new NoteBook("notebook2",1000000,0.1) };
		Cart cart = new Cart();

		Scanner input = new Scanner(System.in);
		boolean flag = false;
		while (flag != true) {
			System.out.println("1. 제품 구매 2. 구매 목록 3. 종료");
			System.out.println("메뉴를 선택하세요: ");
			String menu = input.nextLine();

			switch (menu) {
			case "1":
				if (cart.getCount() >= 4) {
					System.out.println("목록이 가득 찼습니다.");
					break;
				} else {
					
					System.out.println("구매할 상품을 선택해 주세요.");
					for(int i=0;i<arr.length;i++) {
						System.out.print(i+1 + ". ");
						arr[i].show();
					}
					int pick = input.nextInt();
					Product picked = arr[pick-1];
					cart.getpArr()[cart.getCount()]=picked;
					cart.setCount();
					cart.setTotal(picked.getPrice());
					input.nextLine();
					break;
				}

			case "2":
				if (cart.getCount() == 0) {
					System.out.println("읽어 올 정보가 없습니다.");
					break;
				} else
					cart.orderList();
				break;

			case "3":
				System.out.println("프로그램을 종료합니다.");
				flag = true;
				return;
			}// end switch

		} // end while
	}

}
