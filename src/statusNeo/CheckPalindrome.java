package statusNeo;

public class CheckPalindrome {

	public static void main(String[] args) {
		int a = 191;

		boolean palindrome = isPalindrome(a);
		System.out.println(palindrome);
	}

	public static boolean isPalindrome(int original) {

		int temp = original;

		int reversed = 0;

		while (temp > 0) {
			int digit = temp % 10;
			reversed = reversed * 10 + digit;
			temp = temp / 10;
		}
		return reversed == original;
	}

}
