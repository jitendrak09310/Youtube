package statusNeo;

import java.util.Comparator;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Optional;
import java.util.function.Function;
import java.util.stream.Collectors;

public class FirstNonRepeatingCharacterInString {

	public static void main(String[] args) {

		String str = "aabdbrtcsc";

		char firtNonRepeatingCharacter = firtNonRepeatingCharacter(str);
		System.out.println(firtNonRepeatingCharacter);

		char firtNonRepeatingCharacterUsingStream = firtNonRepeatingCharacterUsingStream(str);
		System.out.println(firtNonRepeatingCharacterUsingStream);

	}

	// Stream api to do the same-- firt non repeatingcharacter

	public static char firtNonRepeatingCharacterUsingStream(String str) {
		Character character = str.chars().mapToObj(c -> (char) c)
				.collect(Collectors.groupingBy(Function.identity(), LinkedHashMap::new, Collectors.counting()))
				.entrySet().stream().filter(m -> m.getValue() == 1).map(Map.Entry::getKey).findFirst().get();

		return character;
	}

	// using hashmap..
	public static char firtNonRepeatingCharacter(String str) {

		HashMap<Character, Integer> hm = new HashMap<>();

		for (int i = 0; i < str.length(); i++) {
			char ch = str.charAt(i);
			hm.put(ch, hm.getOrDefault(ch, 0) + 1);
		}
		for (char chr : str.toCharArray()) {
			if (hm.get(chr) == 1) {
				return chr;
			}
		}

		return '_';
	}

}
