package kosta.algorithm;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class MapExample {

	public static void main(String[] args) {

		Map<String, String> map = new HashMap<String, String>();
		// Map 전체 목록 출력
		// Map -> Set->Iterator
		map.put("프람", "귀여워");
		map.put("헬가", "사랑해");
		map.put("루실리카", "최고야");
		Set set = map.entrySet();
		Iterator iter = set.iterator();

		while (iter.hasNext()) {
			Map.Entry <String, String> e = (Map.Entry <String, String>) iter.next();
			System.out.println("key: " + e.getKey() + ", value: " + e.getValue());
		}
	}

}
