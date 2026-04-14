package practice2;

import java.util.*;

public class SortByKeyToMap {

	public static void main(String[] args) {
		Map<String, Integer> map = new HashMap<>();

		map.put("A", 10);
		map.put("B", 20);
		map.put("C", 30);
		map.put("D", 40);
		map.put("E", 50);
		map.put("F", 60);
		map.put("G", 70);
		map.put("H", 80);
		map.put("I", 90);
		map.put("J", 100);

		LinkedHashMap<String, Integer> collect = map.entrySet().stream()
				.sorted(Map.Entry.<String, Integer>comparingByKey().reversed()).collect(LinkedHashMap::new,
						(m, entry) -> m.put(entry.getKey(), entry.getValue()), LinkedHashMap::putAll);
		System.out.println(collect);
	}
}
