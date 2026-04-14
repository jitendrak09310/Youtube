package practice2;

import java.util.HashMap;

public class LengthofLongestSubstring {

	public static void main(String[] args) {
		String str = "Jitendra";
		System.out.println(getLongestString(str));
	}

	public static String getLongestString(String str) {
		int left = 0;
		int maxlength = 0;
		int start = 0;

		HashMap<Character, Integer> map = new HashMap<>();

		for (int right = 0; right < str.length(); right++) {
			char ch = str.charAt(right);

			if (map.containsKey(ch)) {
				left = Math.max(left, map.get(ch) + 1);
			}
			map.put(ch, right);
			if (right - left + 1 > maxlength) {
				maxlength = right - left + 1;
				start = left;
			}

		}
		String substring = str.substring(start, start + maxlength);

		return substring;
	}

}
