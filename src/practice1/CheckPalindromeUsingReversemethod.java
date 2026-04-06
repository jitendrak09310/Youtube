package practice1;

public class CheckPalindromeUsingReversemethod {

	public static void main(String[] args) {

		String str = "Joker";
		boolean checkPalindrome = checkPalindrome(str);
		System.out.println(checkPalindrome);

	}

	public static boolean checkPalindrome(String str) {

		String reversedString = new StringBuilder(str).reverse().toString();

		if (str.equalsIgnoreCase(reversedString)) {
			return true;
		}

		return false;
	}

}
