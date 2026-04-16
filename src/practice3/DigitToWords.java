package practice3;

public class DigitToWords {

	private static final String[] belowTwenty = { "", "one", "two", "three", "four", "five", "six", "seven", "eight",
			"nine", "ten", "eleven", "twelve", "thirteen", "fourteen", "fifteen", "sixteen", "seventeen", "eighteen",
			"nineteen" };

	private static final String[] tens = { "", "", "..", "thirty", "forty", "fifty", "sixty", "seventy", "eighty",
			"ninety" };

	private static final String[] thousands = { "", "thousand", "million", "billion" };

	public static String digitToWords(int num) {

		StringBuilder sb = new StringBuilder();

		int index = 0;

		if (num == 0) {
			return "Zero";
		}

		while (num > 0) {
//1240
			if (num % 1000 != 0) {
				sb.insert(0, helperMethod(num % 1000) + thousands[index] + " ");
			}
			num /= 1000; // 1
			index++;
		}

		return sb.toString();
	}

//1250
	private static String helperMethod(int n) {
		StringBuilder sb = new StringBuilder();

		if (n >= 100) {
			sb.append(belowTwenty[n / 100]).append(" Hundred ");
			n = n % 100;
		}

		if (n >= 20) {
			sb.append(tens[n / 10]).append(" ");
			n = n % 10;
		}
		if (n > 0) {
			sb.append(belowTwenty[n]).append(" ");
		}
		return sb.toString();
	}

	public static void main(String[] args) {

		String helperMethod = helperMethod(956);
//		System.out.println(helperMethod);

		String digitToWords = digitToWords(1246);
		System.out.println(digitToWords);

	}

}
