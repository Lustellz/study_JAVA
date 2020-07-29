package kosta.alog;

import java.util.Scanner;

public class CardSolution {
	static int t;
	static int N, K, P;//N:영미 구매날짜수, K:현준이 희망개수, P:1일 최대지급수
	static int A[] = new int[101];

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		t = sc.nextInt();			
		
		for (int test_case = 1; test_case <= t; test_case++) {
			N = sc.nextInt();
			K = sc.nextInt();
			P = sc.nextInt();
			for(int i=1;i<=N;i++) {
				A[i] = sc.nextInt();
			}
			
			int Answer = -1;
			//연산을 수행
			int rem = 0;
			for(int i=1;i<=N;i++) {
				rem = rem + A[i];
				int m = Math.min(P, rem);
				K = K - m;
				if(K <= 0) {
					Answer = i;
					break;
				}
			}
			
			System.out.println("#" + test_case + "  " + Answer);
			
		}
	}

}







