package practice3;

import java.util.Arrays;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.stream.Collectors;

public class MostFrequentElementInArray {

	public static void main(String[] args) {

		int arr[] = { 1, 2, 2, 3, 4, 5, 5, 5, 5, 5, 5, 5, 55, 5, 5, 5, 6, 1, 7, 1, 7, 6, 5, 4, 4, 3, 2, 2, 3, 1, 7, 88,
				9 };

		int mostFrequentElement = mostFrequentElement(arr);
		System.out.println(mostFrequentElement);

		int mostfrequentElementUsingMap = mostfrequentElementUsingMap(arr);
		System.out.println(mostfrequentElementUsingMap);

	}

	public static int mostfrequentElementUsingMap(int arr[]) {

		HashMap<Integer, Integer> hm = new HashMap<>();
		for (int num : arr) {
			hm.put(num, hm.getOrDefault(num, 0) + 1);
		}

		int max = 0;
		int result = -1;
		for (Map.Entry<Integer, Integer> entry : hm.entrySet()) {
			if (entry.getValue() > max) {
				max = entry.getValue();
				result = entry.getKey();
			}
		}

		return result;

	}

	public static int mostFrequentElement(int arr[]) {
		Integer key = Arrays.stream(arr).boxed()
				.collect(Collectors.groupingBy(s -> s, LinkedHashMap::new, Collectors.counting())).entrySet().stream()
				.max(Map.Entry.comparingByValue()).get().getKey();

		return key;
	}
}
