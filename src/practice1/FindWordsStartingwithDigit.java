package practice1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class FindWordsStartingwithDigit {

	public static void main(String[] args) {
		List<String> list = Arrays.asList("keshav", "2Renu", "Ra3ju", "5Vishnu");
		List<String> result = checkWords(list);
		
		System.out.println(result);
	}

	public static List<String> checkWords(List<String> list) {

		ArrayList<String> res = new ArrayList<>();

		for (String name : list) {
			if (Character.isDigit(name.charAt(0))) {
				res.add(name);
			}

		}

		return res;

	}
}
