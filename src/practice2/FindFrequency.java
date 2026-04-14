package practice2;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.stream.Collectors;

public class FindFrequency {

	public static void main(String[] args) {
		String str = "Jitendraaa";
		HashMap<Character, Long> frequency = getFrequency(str);
		System.out.println(frequency);
		HashMap<Character, Integer> frequencyUsingMap = getFrequencyUsingMap(str);
		System.out.println(frequencyUsingMap);
	}

	public static HashMap<Character, Integer> getFrequencyUsingMap(String str) {
		HashMap<Character, Integer> map = new HashMap<>();

		for (int i = 0; i < str.length(); i++) {
			char ch = str.charAt(i);

			map.put(ch, map.getOrDefault(ch, 0) + 1);
		}

		return map;
	}

	public static HashMap<Character, Long> getFrequency(String str) {

		LinkedHashMap<Character, Long> collect = str.chars().mapToObj(c -> (char) c)
				.collect(Collectors.groupingBy(s -> s, LinkedHashMap::new, Collectors.counting()));

		return collect;

	}

}
