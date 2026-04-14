package practice2;

import java.util.*;
import java.util.stream.Stream;

public class FlatmapInAction {

	public static void main(String[] args) {
		List<List<String>> listOfLists = new ArrayList<>();

		listOfLists.add(Arrays.asList("A", "B", "C"));
		listOfLists.add(Arrays.asList("D", "E"));
		listOfLists.add(Arrays.asList("F", "G", "H"));
		Stream<String> flatStream = listOfLists.stream().flatMap(s -> s.stream());
		System.out.println(listOfLists);
		flatStream.forEach(System.out::print);

	}

}
