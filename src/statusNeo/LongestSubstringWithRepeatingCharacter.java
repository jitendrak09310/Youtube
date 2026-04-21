package statusNeo;

import java.util.HashMap;

public class LongestSubstringWithRepeatingCharacter {

	public static void main(String[] args) {

		String str = "abcrabcab";

		String longestSubtring = longestSubtring(str);
		System.out.println(longestSubtring);

	}

	public static String longestSubtring(String orgString) {

		int start = 0;
		int maxlength = 0;
		int left = 0;

		HashMap<Character, Integer> hashMap = new HashMap<>();

		for (int right = 0; right < orgString.length(); right++) {

			char ch = orgString.charAt(right);
			if (hashMap.containsKey(ch)) {
				left = Math.max(left, hashMap.getOrDefault(ch, 0) + 1);
			}

			hashMap.put(ch, right);

			if (right - left + 1 > maxlength) {
				maxlength = right - left + 1;
				start = left;
			}

		}
		String substring = orgString.substring(start, start + maxlength);
		return substring;
	}

}
