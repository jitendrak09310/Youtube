package practice1;

import java.util.Arrays;

public class SelectionSort {

	public static void main(String[] args) {
		int[] arr = { 2, 5, 8, 1, 3, 0, 6 };
		int[] selectionSort = selectionSort(arr);
		System.out.println(Arrays.toString(selectionSort));

	}

	public static int[] selectionSort(int[] arr) {

		int n = arr.length;

		for (int i = 0; i < n; i++) {
			int minIndex = i;
			for (int j = i + 1; j < n; j++) {
				if (arr[j] < arr[minIndex]) {
					minIndex = j;
				}

			}
			int temp = arr[minIndex];
			arr[minIndex] = arr[i];
			arr[i] = temp;
		}
		return arr;
	}
}
