package kosta.threadExample;

import java.util.ArrayList;
import java.util.List;

public class Stest {
	static int answer = 0;
	
//	int brr[] = list.get(i);
//	if(brr[0] == 0) {
//		int ac = (10 - brr[1]) * 8;//48
//		int bc = brr[1] * 8;
//		
//		int cc = (ac > bc) ? ac : bc;
//		if(answer < cc) {
//			answer = cc;
//		}
	
	public static void dfs(int[][] arr, List<int[]> list, int idx) {
		
		if(idx == 3) {
			answer = (arr[0][0] + arr[0][1]) * (arr[1][0]+arr[1][1]);
			System.out.println(answer);
		}else {
			int brr[] = list.get(idx);
			if(brr[0] == 0) {
				if(arr[0][0] < brr[1] & arr[0][1] > brr[1]) {
					if((brr[1] -  arr[0][0] > arr[0][1] - brr[1])) {
						arr[0][1] = brr[1];
					}else {
						arr[0][0] = brr[1];
					}
				}
			}else {
				if(arr[1][0] < brr[1] & arr[1][1] > brr[1]) {
					if((brr[1] -  arr[1][0] > arr[1][1] - brr[1])) {
						arr[1][0] = brr[1];
					}else {
						arr[1][1] = brr[1];
					}
				}		
			}		
			idx++;				
			dfs(arr, list, idx);
		}		
	}

	public static void main(String[] args) {		
		int arr[][] = {{0,10},{0,8}};
		int t_area = 0;
		int idx = 0;
		
		ArrayList<int[]> list = new ArrayList<int[]>();
		list.add(new int[] {0,4});
		list.add(new int[] {1,2});
		list.add(new int[] {1,4});
		
		dfs(arr, list, idx);
		
		
	}

}
