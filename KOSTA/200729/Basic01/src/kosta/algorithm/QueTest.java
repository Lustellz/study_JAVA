package kosta.algorithm;

public class QueTest {

	public static void main(String[] args) {
		Queue<Integer> s = new Queue<Integer>();

		s.enque(1);
		s.enque(2);
		s.enque(3);
		s.enque(4);
		s.enque(5);

		System.out.println(s.deque());
		System.out.println(s.deque());
		System.out.println(s.isEmpty());
		System.out.println(s.peek());

	}

}
