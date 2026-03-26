package practice1;

public class SecMax {

	public static void main(String[] args) {
		int arr[] = { 2, 3, 5, 1, 7, 85, 85 };
		int secMax = secMax(arr);
		System.out.println(secMax);
	}

	public static int secMax(int[] arr) {

		int max = Integer.MIN_VALUE;
		int secMax = Integer.MIN_VALUE;

		int n = arr.length;

		for (int i = 0; i < n; i++) {
			if (arr[i] > max) {
				secMax = max;
				max = arr[i];
			} else if (arr[i] > secMax && arr[i] != max) {
				secMax = arr[i];
			}
		}
		return secMax;
	}
}
