package practice3;

public class PalindromeCheck {

	public static void main(String[] args) {

		String str = "jitendra";
		boolean checkPalindrome = checkPalindrome(str);
		System.out.println(checkPalindrome);

	}

	public static boolean checkPalindrome(String str) {
//		char[] charArray = str.toCharArray();

//		int n = charArray.length;

		int start = 0;
//		int end = n - 1;
		int end = str.length() - 1;

		while (start < end) {

			if (str.charAt(start) != str.charAt(end)) {
				return false;
			}

//			char temp = charArray[start];
//			charArray[start] = charArray[end];
//			charArray[end] = temp;

			start++;
			end--;

		}

//		return charArray.toString().equals(str);
		return true;
	}

}
