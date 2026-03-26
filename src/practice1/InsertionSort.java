package practice1;

import java.util.Arrays;

public class InsertionSort {

	public static void main(String[] args) {
		int[] arr = { 2, 3, 7, 1, 9, 0 };
		int[] insertionSort = insertionSort(arr);
		System.out.println(Arrays.toString(insertionSort));
	}

	public static int[] insertionSort(int[] arr) {

		int n = arr.length;

		for (int i = 1; i < n; i++) {
			int curr = arr[i];
			int prev = i - 1;

			// finding position..
			while (prev >= 0 && arr[prev] > curr) {
				arr[prev + 1] = arr[prev];
				prev--;
			}
//Insert
			arr[prev + 1] = curr;

		}
		return arr;

	}
}
