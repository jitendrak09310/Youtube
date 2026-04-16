package practice3;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;

public class FindDuplicates {

	public static void main(String[] args) {
		int arr[] = { 1, 2, 2, 3, 4, 5, 5, 5, 5, 5, 5, 5, 55, 5, 5, 5, 6, 1, 7, 1, 7, 6, 5, 4, 4, 3, 2, 2, 3, 1, 7, 88,
				9 };

		int[] findDuplicates = findDuplicates(arr);
		System.out.println(Arrays.toString(findDuplicates));

		int[] array = Arrays.stream(arr).distinct().toArray();
		System.out.println(Arrays.toString(array));
	}

	public static int[] findDuplicates(int arr[]) {

		ArrayList<Integer> duplicateArray = new ArrayList<>();

		HashSet<Integer> hashSet = new HashSet<>();

		for (int num : arr) {
			if (!hashSet.add(num)) {
				duplicateArray.add(num);
			}
		}

		return arr;
	}
}
