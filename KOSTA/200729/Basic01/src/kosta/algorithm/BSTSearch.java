package kosta.algorithm;

public class BSTSearch {

	class Node {
		int data;
		Node left, right;

		public Node(int data) {
			this.data = data;
		}
	}

	Node root;

	public void insert(int data) {
		root = insert(root, data);
	}

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

	public void inorder() {
		inorder(root);
	}

	public void inorder(Node root) {
		if (root != null) {
			inorder(root.left);
			System.out.print(root.data + " ");
			inorder(root.right);
		}

	}

	public Node search(Node root, int target) {
		if (root != null) {
			if (root.data == target)
				return root;
			if (root.data > target)
				return search(root.left, target);
			else if (root.data < target)
				return search(root.right, target);
		}
		return null;
	}

	// 삭제
	// case 1. no child: 부모의 링크를 끊는다.
	// case 2. one child: 부모의 링크를 조정
	// case 3. two child: 왼쪽 max나 오른쪽 min을 부모로 조정

	public Node delete(Node root, int target) {
		if (root == null)
			return root;
		if (root.data > target)
			root.left = delete(root.left, target);
		else if (root.data < target)
			root.right = delete(root.right, target);
		else {
			if (root.left == null && root.right == null)
				return null;
			else if (root.left == null)
				return root.right;
			else if (root.right == null)
				return root.left;
			else {
				root.data = findMin(root.right);
				root.right = delete(root.right, root.data);
			}
		}
		return root;
	}

	public int findMin(Node node) {
		int min = node.data;
		while (node.left != null) {
			min = node.left.data;
			node = node.left;
		}
		return min;
	}

	public static void main(String[] args) {
		BSTSearch tree = new BSTSearch();
		tree.insert(1);
		tree.insert(2);
		tree.insert(3);
		tree.insert(4);
		tree.insert(5);
		tree.insert(6);
		tree.insert(7);
		tree.insert(8);

		tree.inorder();

		System.out.println();
		Node node = tree.search(tree.root, 10);
		if (node == null)
			System.out.println("찾을 수 없습니다.");
		else
			System.out.println(node.data);

		tree.delete(tree.root, 2);
		tree.inorder();
	}
}
