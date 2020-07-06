package kosta.basic;

import java.util.Arrays;

public class ArrayExample02 {

	public static void main(String[] args) {
		int arr[][];// 2차원 배열 선언
		arr = new int[3][2];// 2차원 배열 생성

		// 2차원 배열의 크기를 상이하게 생성
		int arr2[][] = new int[3][];
		arr2[0] = new int[2];
		arr2[0] = new int[3];
		arr2[0] = new int[4];

		// 2차원 배열 선언, 생성, 초기화
		int arr3[][] = { { 1, 2 }, { 3, 4, 5 }, { 6, 7, 8 } };

		// 중첩 for문을 이용하여 2차원 배열 내용 전체를 출력하세요.

		for (int i = 0; i < arr3.length; i++) {
			for (int j = 0; j < arr3[i].length; j++)
				System.out.print(arr3[i][j] + " ");
			System.out.println();
		}
		
		String oldArr [] =new String[3];
		oldArr[0]="10";
		oldArr[1]="20";
		String newArr[]=new String[2];
		
		System.arraycopy(oldArr,0,newArr,0,newArr.length);
		System.out.println(Arrays.toString(newArr));
	}

}
