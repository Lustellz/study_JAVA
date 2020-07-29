package kosta.sort;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class SortExample2 {

	public static void main(String[] args) {
		List<Person> list = new ArrayList<Person>();
		list.add(new Person("김jv", 23));
		list.add(new Person("하jv", 99));
		list.add(new Person("노jv", 54));
		list.add(new Person("도jv", 65));
		list.add(new Person("장jv", 88));

		Collections.sort(list);
		// 정렬기준을 이름으로 바꾸기 위해 익명 내부 클래스를 선언합니다.

		Collections.sort(list, new Comparator<Person>() {

			@Override
			public int compare(Person o1, Person o2) {
				if (o1.getName().compareTo(o2.getName()) > 0)
					return 1;
				else if (o1.getName().compareTo(o2.getName()) < 0)
					return -1;
				else
					return 0;
			}
		});
		System.out.println(list);

	}

}
