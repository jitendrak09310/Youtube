package practice1;

import java.util.HashMap;

public class LengthOfLongestSubstring {
	public static void main(String[] args) {
		String str = "abcabctlmbb";
		int longestSubstring = longestSubstring(str);
		System.out.println(longestSubstring);

	}

	public static int longestSubstring(String str) {

		// sliding window..

		int left = 0;
		int maxLength = 0;
		int start = 0;

		HashMap<Character, Integer> map = new HashMap<>();

		for (int right = 0; right < str.length(); right++) {
			char ch = str.charAt(right);

			if (map.containsKey(ch)) {
				left = Math.max(left, map.get(ch) + 1);// 0+1 -> (0,1)// (1,2) ->max 2
			}

			map.put(ch, right);// a-0,b-1,c-2,a-3, b-4

			if (right - left + 1 > maxLength) {
				maxLength = Math.max(maxLength, right - left + 1);// 3-1+1 --3//4-2+1-->3
				start = left;
			}
		}

		String substring = str.substring(start, start + maxLength);

		System.out.println(substring);

		return maxLength;
	}

}
