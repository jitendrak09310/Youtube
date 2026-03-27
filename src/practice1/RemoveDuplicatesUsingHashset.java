package practice1;

import java.util.Arrays;
import java.util.LinkedHashSet;

public class RemoveDuplicatesUsingHashset {

	public static void main(String[] args) {

		int arr[] = { 1, 2, 2, 3, 3, 4, 4, 6, 6, 7, 7 };
		int[] unique = removeDuplicates(arr);
		System.out.println(Arrays.toString(unique));

	}

	public static int[] removeDuplicates(int arr[]) {

		LinkedHashSet<Integer> set = new LinkedHashSet<>();
		System.out.println("Size of original array : " + arr.length);

		for (int num : arr) {
			set.add(num);
		}

		int size = set.size();
		System.out.println("Size of set : " + size);

		int result[] = new int[size];

		int i = 0;
		for (int num : set) {
			result[i++] = num;
		}

		return result;
	}

}
