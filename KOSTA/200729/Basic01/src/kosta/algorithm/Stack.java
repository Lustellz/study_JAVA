package kosta.algorithm;

public class Stack<T> {
	class Node<T> {
		private T data;
		private Node<T> next;

		public Node(T data) {
			this.data = data;
		}
	}

	private Node<T> top;

	public void push(T item) {
		Node<T> t = new Node<T>(item);
		t.next = top;
		top = t;
	}

	public T pop() {
		if (top() != null) {
			T item = top.data;
			top = top.next;
			return item;
		}
		return top();
	}

	public T top() {
		if (top == null)
			System.out.println("emtpy");

		return top.data;
	}

	public boolean isEmpty() {
		return top == null;
	}

}
