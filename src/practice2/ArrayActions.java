package practice2;

import java.util.Arrays;

public class ArrayActions {

	public static void main(String[] args) {
		int arr[] = { 1, 2, 2, 3, 4, 5, 6, 90, 6, 3, 3, 4, 9, 8, 8, 8, 7, 87, 78, 75, 4 };

//		System.out.println(Arrays.toString(sortByStream(arr)));
//		System.out.println(Arrays.toString(bubbleSort(arr)));
//		System.out.println(Arrays.toString(selectionSort(arr)));
		System.out.println(Arrays.toString(insertionSort(arr)));
	}

	public static int[] insertionSort(int arr[]) {

		int n = arr.length;

		for (int i = 1; i < n; i++) {
			int curr = arr[i];
			int prev = i - 1;
//finding position

			while (prev >= 0 && arr[prev] > curr) {
				arr[prev + 1] = arr[prev];
				prev--;
			}

			arr[prev + 1] = curr;

		}

		return arr;

	}

	public static int[] selectionSort(int arr[]) {

		int n = arr.length;

		for (int i = 0; i < n; i++) {
			int minindex = i;
			for (int j = i + 1; j < n; j++) {
				if (arr[j] < arr[minindex]) {
					minindex = j;
				}
			}
			int temp = arr[minindex];
			arr[minindex] = arr[i];
			arr[i] = temp;
		}

		return arr;

	}

	public static int[] bubbleSort(int arr[]) {
		int n = arr.length;

		for (int i = 0; i < n; i++) {
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

	public static int[] sortByStream(int arr[]) {

		int[] array = Arrays.stream(arr).sorted().toArray();

		return array;
	}

}
