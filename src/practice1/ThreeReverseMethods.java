package practice1;

import java.util.Arrays;

public class ThreeReverseMethods {
	public static void main(String[] args) {
		String str = "Jitendra";
		int k = 3;

		String rotateLeft = rotateLeft(str, k);
		System.out.println(rotateLeft);

	}

	public static String rotateLeft(String str, int k) {
		char[] charArray = str.toCharArray();

		if (str.length() == 0 || str == null) {
			return str;

		}
		int n = str.length();
		k = k % n;
		reverse(charArray, 0, k - 1);
		reverse(charArray, k, n - 1);
		reverse(charArray, 0, n - 1);

		return Arrays.toString(charArray);
	}

	public static void reverse(char[] arr, int start, int end) {

		while (start < end) {
			char temp = arr[start];
			arr[start] = arr[end];
			arr[end] = temp;
			start++;
			end--;

		}
	}

}
