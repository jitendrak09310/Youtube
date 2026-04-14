package practice2;

import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;

public class FrequencyOfListElements {

	public static void main(String[] args) {
		List<Integer> list = Arrays.asList(1, 2, 3, 4, 5, 3, 2, 6, 7, 8, 9, 10, 5, 6, 11, 12, 13, 1, 14, 15);
		HashMap<Integer, Integer> frequencyByHashmap = getFrequencyByHashmap(list);

		System.out.println(frequencyByHashmap);

		HashMap<Integer, Integer> frequencyByHashmap2 = getFrequencyByHashmap(list);
		System.out.println(frequencyByHashmap2);

	}

	public static HashMap<Integer, Integer> getFrequencyByHashmap(List<Integer> list) {

		HashMap<Integer, Integer> map = new HashMap<>();

		for (Integer num : list) {
			map.put(num, map.getOrDefault(num, 0) + 1);
		}

		return map;

	}

	public Map<Integer, Long> getFrequency(List<Integer> list) {
		Map<Integer, Long> collect = list.stream()
				.collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));

		return collect;
	}
}
