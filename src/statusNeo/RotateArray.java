package statusNeo;

import java.util.Arrays;

public class RotateArray {

	public static void main(String[] args) {

		int arr[] = { 2, 3, 4, 6, 7 };// 7 6 4 3 2 -- 4 6 7 3 2 -- 4 6 7 2 3
		int k = 3;

		rotateArray(arr, k);
	}

	public static void rotateArray(int[] arr, int k) {

		int n = arr.length;

		k = k % n;

		reverse(arr, 0, n - 1);
		reverse(arr, 0, k - 1);
		reverse(arr, k, n - 1);

		System.out.println(Arrays.toString(arr));

	}

	public static void reverse(int arr[], int start, int end) {

		while (start < end) {

			int temp = arr[start];
			arr[start] = arr[end];
			arr[end] = temp;
			start++;
			end--;
		}

	}

}
