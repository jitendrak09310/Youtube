package practice1;

import java.util.*;

public class FrequencyOfCharacters {

	public static void main(String[] args) {

		String str = "India is my Country";
		Map<Character, Integer> frequency = getFrequency(str);
		System.out.println(frequency);
	}

	public static Map<Character, Integer> getFrequency(String str) {

		HashMap<Character, Integer> map = new HashMap<>();
		for (char c : str.toCharArray()) {
			map.put(c, map.getOrDefault(c, 0) + 1);
		}
		return map;

	}
}
