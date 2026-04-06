package practice1;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class FindMostFrequentElement {

	public static void main(String[] args) {

		List<Integer> list = Arrays.asList(1, 2, 3, 2, 42, 2, 2, 3, 4, 5, 6, 4);
		mostFrequentElement(list);

	}

	public static void mostFrequentElement(List<Integer> list) {

		Map<Integer, Long> map = list.stream()
				.collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));
		map.entrySet().stream().max(Map.Entry.comparingByValue()).ifPresent(System.out::println);

	}

}
