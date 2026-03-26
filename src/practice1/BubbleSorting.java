package practice1;

import java.util.Arrays;

public class BubbleSorting {

	public static void main(String[] args) {
		int arr[] = { 6, 5, 3, 7, 8, 3, 1, 2, 0, 4 };
		int[] bubbleSort = bubbleSort(arr);
		System.out.println(Arrays.toString(arr));

	}

	public static int[] bubbleSort(int arr[]) {
		int n = arr.length;

		// nested
		for (int i = 0; i < n - 1; i++) {
			for (int j = 0; j < n - i - 1; j++) {
				if (arr[j] > arr[j + 1]) {
					int temp = arr[j];
					arr[j] = arr[j + 1];
					arr[j + 1] = temp;
				}
			}
		}
		return arr;
	}
}
