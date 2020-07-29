package kosta.data;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

public class ListMission01 {

	public static void show(List<String> list) {
//		for(int i =0;i<list.size();i++)
//			System.out.println(list.get(i)+", ");
		
		Iterator<String> iter = list.iterator();
		while(iter.hasNext())
			System.out.print(iter.next()+",");
		
	}
	
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		boolean flag = false;

		ArrayList<String> list = new ArrayList<String>();
		// 해당하는 List자료구조를 활용하여 키보드로 입력받은 데이터를 추가하고 입력받은 데이터를 삭제하세요.
		// 데이터가 수정되면 전체 내용을 출력하세요.
		while (flag != true) {
			System.out.println("1. 추가 2. 삭제 3. 종료");
			System.out.print("선택: ");
			String menu = sc.nextLine();
			switch (menu) {
			case "1":
				System.out.println("추가할 데이터를 입력하세요.");
				String e = sc.nextLine();
				list.add(e);
				for (int i = 0; i < list.size(); i++)
					System.out.println(list.get(i));
				break;

			case "2":
				if (list.size() != 0) {
					System.out.println("삭제할 데이터를 입력하세요.");
					String r = sc.nextLine();
					list.remove(r);
					for (int i = 0; i < list.size(); i++)
						System.out.println(list.get(i));
				} else
					System.out.println("삭제할 데이터가 없습니다.");

				break;

			case "3":
				System.out.println("프로그램 종료.");
				flag = true;
				return;
			}
		}
	}

}
