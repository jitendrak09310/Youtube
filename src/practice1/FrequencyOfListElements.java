package practice1;

import java.util.Arrays;
import java.util.*;
import java.util.List;

public class FrequencyOfListElements {

	public static void main(String[] args) {
		List<Integer> list = Arrays.asList(1, 2, 1, 1, 2, 3, 4, 5, 6, 7, 8, 99, 2, 0);
		findFrequency(list);
	}

	public static void findFrequency(List<Integer> list) {

		Map<Integer, Integer> map = new HashMap<>();

		for (int num : list) {
			map.put(num, map.getOrDefault(num, 0) + 1);
		}
		
		System.out.println(map);

	}

}
