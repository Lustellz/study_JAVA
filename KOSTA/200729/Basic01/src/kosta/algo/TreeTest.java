package kosta.alogo;

import kosta.alogo.BSTSearch.Node;

/*
 *     			 4 
 *              /      \
 *             1         7  
 *            / \      /  \ 
 *           0   2    5    8
 *                  \           \         
 *                    3           9
 */   


class Tree{
	class Node{
		int data;
		Node left, right;
		
		public Node(int data) {
			this.data = data;
		}		
	}
	
	Node root;
	
	public void makeTree(int arr[]){
		root = makeThreeR(arr, 0, arr.length-1);
	}
	
	public Node makeThreeR(int arr[], int start, int end){
		if(start > end) return null;
		int mid = (start + end)/2;
		Node node = new Node(arr[mid]);
		node.left = makeThreeR(arr, start, mid-1);
		node.right = makeThreeR(arr, mid+1, end);
		
		return node;
	}
	
	public void searchBTree(Node n, int find){
		if(find < n.data){
			System.out.println("Data is smaller than " + n.data);
			searchBTree(n.left, find);
		}else if(find > n.data){
			System.out.println("Data is bigger than "  + n.data);
			searchBTree(n.right, find);
		}else{
			System.out.println("Data found");
		}
	}	
}


public class TreeTest {

	public static void main(String[] args) {
		int arr[] = new int[10];
		for(int i=0;i<arr.length;i++) {
			arr[i] = i;
		}
		
		Tree  t = new Tree();
		t.makeTree(arr);
		t.searchBTree(t.root, 3);
	}

}












