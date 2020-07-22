package kosta.data;

import java.util.LinkedList;

public class QueExample {

	public static void main(String[] args) {
		LinkedList<String> queue = new LinkedList<String>();
		queue.offer("토끼");
		queue.offer("사슴");
		queue.offer("호랑이");
		while (!queue.isEmpty()) {
			String str = queue.poll();
			System.out.println(str);
		}
	}

}
