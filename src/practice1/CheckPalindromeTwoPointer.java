package practice1;

public class CheckPalindromeTwoPointer {

	public static void main(String[] args) {
		String str = "race";

		boolean isPalindrome = checkPalindrome(str);
		System.out.println(isPalindrome);

	}

	public static boolean checkPalindrome(String str) {

		int start = 0;
		int end = str.length() - 1;

		while (start < end) {
			if (str.charAt(start) != str.charAt(end)) {
				return false;
			}
			start++;
			end--;

		}

		return true;
	}

}
