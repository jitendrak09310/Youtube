package practice3;

public class LongestCommonSubstring {

	public static void main(String[] args) {

		String s1 = "Jitendra";
		String s2 = "Jitu";

		String longestSubstring = longestSubstring(s1, s2);
		System.out.println(longestSubstring);

	}

	public static String longestSubstring(String s1, String s2) {

		int dp[][] = new int[s1.length() + 1][s2.length() + 1];

		int maxLength = 0;
		int endIndex = 0;

		for (int i = 1; i < s1.length(); i++) {
			for (int j = 1; j < s2.length(); j++) {

				if (s1.charAt(i - 1) == s2.charAt(j - 1)) {

					dp[i][j] = dp[i - 1][j - 1] + 1;

					if (dp[i][j] > maxLength) {
						maxLength = dp[i][j];
						endIndex = i;
					}

				}

			}
		}

		return s1.substring(endIndex - maxLength, endIndex);
	}

}
