package kosta.algorithm;

public class BubbleSort {

	public static void bubbleSort(int a[]) {
		int i, j, temp, size;
		size = a.length;
		for (i = size - 1; i > 0; i--) {
			System.out.printf("\n버블 정렬 %d 단계: ", size - i);
			for (j = 0; j < i; j++) {
				if (a[j] > a[j + 1]) {
					temp = a[j];
					a[j] = a[j + 1];
					a[j + 1] = temp;
				}
				System.out.printf("\n\t");
				for (int k = 0; k < size; k++)
					System.out.printf("%3d", a[k]);
			}
		}
	}

	public static void bubble(int arr[], int n, int limit) {
		if (n +1>= limit)
			return;

		if (arr[n] > arr[n + 1]) {
			int tmp = arr[n];
			arr[n] = arr[n + 1];
			arr[n + 1] = tmp;

		}
		for (int j = 0; j < arr.length; j++)
			System.out.print(arr[j] + " ");
		System.out.println();
		bubble(arr, n + 1,limit);

	};

	public static void main(String[] args) {
		int arr[] = { 10, 9, 8, 7, 6, 5, 4,3,2,1 };
//		bubbleSort(arr);

		for (int i = 0; i < arr.length; i++) {
			bubble(arr, 0, arr.length - i);
			System.out.println();
		}


	}

}
