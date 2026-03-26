package practice1;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class ArraySorting {

	public static void main(String[] args) {
		Integer[] arr = { 4, 2, 6, 8, 11, 2, 1, 90 };
		Arrays.sort(arr);
//		System.out.println(Arrays.toString(arr));
//		Arrays.sort(arr, Collections.reverseOrder());
//		System.out.println(Arrays.toString(arr));

		// Collections class -- As a list array..
		List<Integer> list = Arrays.asList(arr);

		Collections.sort(list);
		System.out.println(list);
		Collections.reverse(list);
		System.out.println(list);
	}

}
