package kosta.algorithm;

import java.util.NoSuchElementException;

public class Queue<T> {
	class Node<T> {
		private T data;
		private Node<T> next;

		public Node(T data) {
			this.data = data;
		}
	}

	private Node<T> front;
	private Node<T> rear;

	public void enque(T item) {

		Node<T> t = new Node<T>(item);
		if (rear != null)
			rear.next = t;
		rear = t;
		if (front == null)
			front = rear;
	}

	public T deque() {
		if (isEmpty() == false) {
			T item = front.data;
			front = front.next;
			return item;
		}
		return null;
	}

	public T peek() {
		if (front == null) {
			throw new NoSuchElementException();
		} else
			return front.data;
	}

	public boolean isEmpty() {
		return front == null;
	}
}
