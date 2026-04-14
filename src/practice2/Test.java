package practice2;

import java.util.Arrays;
import java.util.Comparator;

public class Test {

	public static void main(String[] args) {

		int arr[] = { 1, 2, 34, 5, 6, 9, 7, 8, 8, 5, 3, 22, 3 };
		int n = 3;

		int max = getMax(arr, 2);
		System.out.println(max);

	}

	public static int getMax(int[] arr, int n) {

		Integer integer = Arrays.stream(arr).boxed().distinct().sorted(Comparator.reverseOrder()).skip(n - 1)
				.findFirst().get();

		return integer;
	}

}
