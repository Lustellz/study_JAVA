package kosta.basic;

import java.util.Scanner;

public class RecursiveExample {

	public static int recursive_sum(int num) {
		if (num != 0) {
			return num+ recursive_sum(num-1);
		}
		return 0;
	}
	
	public static int recursive_sum2(int[] num,int cnt) {
		if (cnt!= 0) {
			return num[cnt]+ recursive_sum2(num,cnt-1);
		}
		return 10;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("n(1<=n<=4): ");
		int n = sc.nextInt();
		
//		System.out.println("Result is: "+recursive_sum(n));
	
		int arr[]= {10,20,30,40};
		//arr[0]에서 arr[n-1]까지의 합을 재귀함수를 사용하여 구해 보세요.
	System.out.println("Result is: "+recursive_sum2(arr,n-1));
	}

}
