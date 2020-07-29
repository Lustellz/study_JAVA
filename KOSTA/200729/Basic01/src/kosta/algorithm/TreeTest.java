package kosta.algorithm;

public class TreeTest {

	class Node {
		int data;
		Node left, right;

		public Node(int data) {
			this.data = data;
		}
	}

	Node root;

	public Node insert(Node root, int data) {
		if (root == null) {
			root = new Node(data);
			return root;
		}
		if (data < root.data)
			root.left = insert(root.left, data);
		else if (data > root.data)
			root.right = insert(root.right, data);

		return root;
	}

	public void binarySearch(int[] arr, int low, int high, int key) {
		int middle = (low + high) / 2;
		root = insert(root, middle);
		if (key == arr[middle]) {
			return;
		} else if (key < arr[middle]) {
			insert(root.left, key);
			binarySearch(arr, low, middle - 1, key);
		} else if (key > arr[middle]) {

			insert(root.right, key);
			binarySearch(arr, middle + 1, high, key);
		}
	}

	public void makeTree(int[] arr) {
		for (int i = 0; i < arr.length; i++)
			binarySearch(arr, i, arr.length, arr[i]);
		print(root);
	}

	public void print(Node root) {
		if (root != null) {
			System.out.println("root.data: " + root.data);
			if (root.right != null) {
				print(root.right);
			}
			if (root.left != null) {
				print(root.left);
			}
		}
	}

	public static void main(String[] args) {
		int arr[] = new int[10];
		for (int i = 0; i < arr.length; i++) {
			arr[i] = i;
		}

		TreeTest t = new TreeTest();
		t.makeTree(arr);
	}

}
