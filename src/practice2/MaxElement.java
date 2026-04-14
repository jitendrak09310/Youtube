package practice2;

import java.util.Arrays;
import java.util.Comparator;

public class MaxElement {

	public static void main(String[] args) {

		int arr[] = { 1, 2, 2, 3, 4, 5, 6, 90, 6, 3, 3, 4, 9, 8, 8, 8, 7, 87, 78, 75, 4 };
		int max = getMax(arr);
		System.out.println(max);

		int maxByStream = getMaxByStream(arr, 2);
		System.out.println(maxByStream);
	}

	public static int getMaxByStream(int arr[], int n) {

		Integer max = Arrays.stream(arr).boxed().distinct().sorted(Comparator.reverseOrder()).skip(n - 1).findFirst()
				.get();

		return max;
	}

	public static int getMax(int arr[]) {

		int max = Integer.MIN_VALUE;
		int sexMax = Integer.MIN_VALUE;

		for (int i = 0; i < arr.length; i++) {

			if (arr[i] > max) {
				sexMax = max;
				max = arr[i];
			} else if (arr[i] > sexMax && arr[i] != max) {
				sexMax = arr[i];
			}

		}

		return max;

	}
}
