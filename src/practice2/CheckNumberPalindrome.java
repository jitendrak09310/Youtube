package practice2;

public class CheckNumberPalindrome {

	public static void main(String[] args) {
		boolean palin = isPalin(121);

		System.out.println(palin);

	}

	public static boolean isPalin(int num) {

		int original = num;
		int reverse = 0;

		while (num > 0) {
			int digit = num % 10;
			reverse = reverse * 10 + digit;
			num = num / 10;
		}
		return reverse == original;
	}

}
