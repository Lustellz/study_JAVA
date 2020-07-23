package kosta.sort;

import java.util.Random;
import java.util.TreeSet;

public class SortExample {

	public static void main(String[] args) {
		//최초의 정렬 Case: Comparable(Interface) implement-> compareTo() (override)
		//정렬기준 변경: Comparator->compare()
		Random r = new Random();
		TreeSet<Integer> set = new TreeSet<Integer>();//원래 정렬을 해주는 자료구조
		TreeSet<Integer> set2 = new TreeSet<Integer>(new Descending());
		for(int i=0;set.size()<6;i++) {
			int num = r.nextInt(45)+1;
			int num2 = r.nextInt(45)+1;
			set.add(num);
			set2.add(num2);
		}
		System.out.println(set);
		System.out.println(set2);
	}

}
