package practice1;

import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.stream.Collectors;

public class FindDuplicatesUsingStream {

	public static void main(String[] args) {
		int arr[] = { 1, 1, 1, 2, 2, 3, 4, 4, 4, 4, 5, 5 };
		Map<Integer, Long> duplicatesCount = findDuplicates(arr);
		System.out.println(duplicatesCount);
	}

	public static Map<Integer, Long> findDuplicates(int arr[]) {

		Map<Integer, Long> map = Arrays.stream(arr).boxed()
				.collect(Collectors.groupingBy(s -> s, LinkedHashMap::new, Collectors.counting())).entrySet().stream()
				.filter(s -> s.getValue() > 1).collect(Collectors.toMap(Map.Entry::getKey, Map.Entry::getValue));
		return map;
	}

}
