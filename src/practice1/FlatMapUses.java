package practice1;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class FlatMapUses {

	public static void main(String[] args) {

		List<List<String>> list = Arrays.asList(Arrays.asList("Monu", "Rohit"), Arrays.asList("Akshay", "Pritam"));

		System.out.println(list);

		List<String> flattenedList = list.stream().flatMap(l -> l.stream()).collect(Collectors.toList());

		System.out.println(flattenedList);

	}

}
