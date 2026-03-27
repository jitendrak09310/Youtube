package practice1;

import java.util.HashMap;
import java.util.Map;

public class FindDuplicatesUsingMap {

	public static void main(String[] args) {
		int arr[] = { 1, 1, 1, 2, 2, 3, 4, 4, 4, 4, 5, 5 };
		Map<Integer, Integer> duplicates = findDuplicates(arr);
//		System.out.println(duplicates);

		for (Map.Entry<Integer, Integer> entry : duplicates.entrySet()) {
			if (entry.getValue() > 1) {
				System.out.println("Key : " + entry.getKey() + " Value : " + entry.getValue());
			}
		}

	}

	public static Map<Integer, Integer> findDuplicates(int arr[]) {

		Map<Integer, Integer> map = new HashMap<>();

		for (int num : arr) {
			map.put(num, map.getOrDefault(num, 0) + 1);
		}
		return map;
	}
}
