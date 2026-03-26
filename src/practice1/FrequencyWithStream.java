package practice1;

import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class FrequencyWithStream {

	public static void main(String[] args) {
		String str = " My name is Khan";
		
		Map<Character,Long> frequency = getFrequency(str);
		System.out.println(frequency);
	}

	public static Map<Character, Long> getFrequency(String str) {
		return str.chars().mapToObj(c -> (char) c)
				.collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));

	}
}
