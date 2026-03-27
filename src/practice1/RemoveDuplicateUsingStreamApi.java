package practice1;

import java.util.Arrays;

public class RemoveDuplicateUsingStreamApi {

	public static void main(String[] args) {

		int[] arr = { 1, 1, 2, 2, 3, 3, 4, 5, 5 };
		int[] unique = removeDuplicates(arr);
		System.out.println(Arrays.toString(unique));
	}

	public static int[] removeDuplicates(int arr[]) {
		int[] array = Arrays.stream(arr).distinct().toArray();

		return array;
	}

}
