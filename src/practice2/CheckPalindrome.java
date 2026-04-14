package practice2;

public class CheckPalindrome {

	public static void main(String[] args) {

		String str = "madam";

		boolean check = true;

		int start = 0;
		int end = str.length() - 1;

		while (start < end) {
			if (str.charAt(start) != str.charAt(end)) {
				System.out.println("Not a Palindrome!.. ");
				check = false;
			}

			start++;
			end--;
		}
		System.out.println(check);

	}

}
