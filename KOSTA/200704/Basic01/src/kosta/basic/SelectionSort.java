package kosta.basic;

public class SelectionSort {

	public static int s_Sort(int a[], int index, int min) {
		
		if (index >= a.length - 1) {			
			System.out.print(a[index] + " ");
			return min;
		} else {
			if (a[index+1] < a[min]) 
				min = index+1;
			return s_Sort(a, index + 1,min);
		}
	}

	public static void swap(int a[], int i, int j) {
		int tmp = a[i];
		a[i] = a[j];
		a[j] = tmp;
	}

	public static void main(String[] args) {
		int a[] = { 69, 10, 30, 2, 16, 8, 31, 22 };
		Sort S = new Sort();
		System.out.printf("\n 정렬할 원소: ");
		for (int i = 0; i < a.length; i++)
			System.out.printf(" %d", a[i]);
		System.out.println();
//		S.selectionSort(a);
		System.out.println();

		for (int i = 0; i < a.length; i++) {
			int min =s_Sort(a, i,i);
			swap(a, min, i);
			System.out.print(a[min]+" ");
		}
		System.out.println();
		for(int i=0;i<a.length;i++)
			System.out.print(a[i]+" ");

	}

}
