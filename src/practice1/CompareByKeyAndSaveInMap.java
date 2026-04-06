package practice1;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.stream.Collectors;

public class CompareByKeyAndSaveInMap {

	public static void main(String[] args) {

		HashMap<Integer, String> map = new HashMap<>();
		map.put(3, "Rakesh");
		map.put(12, "Rohit");
		map.put(9, "Sonam");
		map.put(36, "Bittu");
		map.put(13, "keshav");
		map.put(3, "Jordan");
		Map<Integer, String> result = compare(map);
		System.out.println(result);

	}

	public static Map<Integer, String> compare(HashMap<Integer, String> map) {
		LinkedHashMap<Integer, String> linkedHashMap = map.entrySet().stream().sorted(Map.Entry.comparingByKey())
				.collect(Collectors.toMap(Map.Entry::getKey, Map.Entry::getValue, (e1, e2) -> e2, LinkedHashMap::new));

		return linkedHashMap;
	}
}
