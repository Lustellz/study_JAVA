package kosta.alogo;

/*
				4
		    /    \  
		  2        6
		/  \    /  \
		1    3  5    7
*/
public class BSTSearch {
	
	class Node{
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
		if(root == null) {
			root = new Node(data);
			return root;
		}
		
		if(data < root.data) {
		    root.left  = insert(root.left, data);
		}else if(data > root.data) {
			root.right = insert(root.right, data);
		}
		
		return root;
	}
	
	public void inorder() {
		inorder(root);
		System.out.println();
	}
	
	public void inorder(Node root) {
		if(root != null) {
			inorder(root.left);
			System.out.print(root.data + " ");
			inorder(root.right);
		}
	}
	
	public Node search(Node root, int key){
		if(root ==null ||root.data == key) return root;
		if(root.data > key) {
			return search(root.left, key);
		}else {
			return search(root.right, key);
		}		
	}
	
	//삭제
	//1. no child : 부모의 링크를 끊는다.
	//2. one child : 부모의 링크를 조정
	//3. two child : 해당노드 삭제, 왼쪽(max), 오른쪽(min)으로 수정
	public Node delete(Node root, int data) {
		if(root == null) return root;
		if(data < root.data) {
			root.left = delete(root.left, data);
		}else if(data > root.data) {
			root.right = delete(root.right, data);
		}else {
			if(root.left == null && root.right == null) return null;
			else if(root.left == null) return root.right;
			else if(root.right == null)return root.left;
			else {
				root.data = findMin(root.right);
				root.right = delete(root.right, root.data);
			}			
		}
		
		return root;
	}
	
	public int findMin(Node root) {
		int min = root.data;
		while(root.left != null) {
			min = root.left.data;
			root = root.left;
		}
		
		return min;
	}
	
	
	public static void main(String[] args) {
		BSTSearch tree = new BSTSearch();
		
		tree.insert(4);
		tree.insert(2);
		tree.insert(1);
		tree.insert(3);
		tree.insert(6);
		tree.insert(5);
		tree.insert(7);
		
		tree.inorder();
		
		tree.delete(tree.root, 7);
		tree.delete(tree.root, 6);
		tree.delete(tree.root, 2);
		tree.inorder();
		
//		Node node = tree.search(tree.root, 5);
//		if(node == null) {
//			System.out.println("찾을 수 없습니다.");
//		}else {
//			System.out.println(node.data);
//		}
		

	}

}









