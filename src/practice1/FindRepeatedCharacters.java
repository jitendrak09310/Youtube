package practice1;

import java.util.Arrays;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.stream.Collectors;

public class FindRepeatedCharacters {

	public static void main(String[] args) {

		String str = "jitendafdljkshre";
		HashMap<Character,Long> findRepeated = findRepeated(str);
		System.out.println(findRepeated);
		

	}

	public static HashMap<Character, Long> findRepeated(String str) {

		char[] charArray = str.toCharArray();

		LinkedHashMap<Character, Long> collect = str.chars().mapToObj(c -> (char) c)
				.collect(Collectors.groupingBy(s -> s, LinkedHashMap::new, Collectors.counting()));
		return collect;
	}

}
