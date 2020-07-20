package kosta.mission;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Random;

public class Lotto {
//로또 프로그램을 구현하여 1에서 45까지의 숫자 중 중복되지 않는 6개의 숫자를 추출하세요.
	// 1. 배열을 이용
	// 2. List를 이용

	public static boolean compare(int depth, int now, int arr[]) {
		if (depth >= arr.length)
			return true;
		if (arr[depth] != arr[now])
			compare(depth + 1, now, arr);
		return false;
	}

	public static void main(String[] args) {
		Random rand = new Random();
		int list[] = new int[6];
		boolean done = false;
		ArrayList<Integer> arraylist = new ArrayList<Integer>();

		do {
			for (int i = 0; i < list.length; i++)
				list[i] = rand.nextInt(44) + 1;
			for (int i = 0; i < list.length; i++)
				done = compare(i + 1, i, list);

		} while (done != true);

		for (int i = 0; i < list.length; i++)
			System.out.print(list[i] + " ");

		System.out.println();

		while (arraylist.size() < 6) {
			int this_num = rand.nextInt(44) + 1;
			if (!arraylist.contains(this_num))
				arraylist.add(this_num);
		}

		Iterator<Integer> iter = arraylist.iterator();

		while (iter.hasNext())
			System.out.print(iter.next() + " ");

	}

}
