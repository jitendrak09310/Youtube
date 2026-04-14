package practice2;

import java.util.Arrays;

public class CalculateSum {

	public static void main(String[] args) {
		int arr[] = { 1, 2, 2 };

		int sum = calSum(arr);
		System.out.println(sum);

	}

	public static int calSum(int arr[]) {

		int sum = Arrays.stream(arr).sum();

		return sum;
	}

}
