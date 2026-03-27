package practice1;

import java.util.Arrays;

public class CalculateArraySumUsingStream {

	public static void main(String[] args) {
		int arr[] = { 3, 2, 4, 1, 7 };
		System.out.println(calSum(arr));
	}

	public static int calSum(int arr[]) {

		int sum = Arrays.stream(arr).sum();
//		int sum = Arrays.stream(arr).mapToInt(c -> (int) c).sum();
		return sum;
	}

}
