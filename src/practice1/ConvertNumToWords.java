package practice1;

public class ConvertNumToWords {

	public static void main(String[] args) {
		int num = 1254; // --- > two hundred forty five. -- 200 40 5
		// 1254 -- > one thousand two hundred fifty four. 1000 200 50 4

		// modulo -- % -- remainder -> / divide --> quotient result
		System.out.println(convertToWords(num));

	}

//one words. .. 
	private static final String[] belowTwenty = { "", "one", "two", "three", "four", "five", "six", "seven", "eight",
			"nine", "ten", "eleven", "twelve", "thirteen", "fourteen", "fifteen", "sixteen", "seventeen", "eighteen",
			"nineteen" };

	private static final String[] tens = { "", "", "..", "thirty", "forty", "fifty", "sixty", "seventy", "eighty",
			"ninety" };

	private static final String[] thousands = { "", "thousand", "million", "billion" };

	public static String convertToWords(int num) { // 1254

		StringBuilder sb = new StringBuilder();
		int index = 0;
		if (num == 0) {
			return "zero";
		}
		while (num > 0) {

			if (num % 1000 != 0) {
				// 254
				sb.insert(0, helper(num % 1000) + thousands[index] + " "); // 0 1 one thousand
//one thousand + two hundred fifty four.. 
			}

			num /= 1000; // 1
			index++;

		}

		return sb.toString().trim();
	}

	private static String helper(int num) {
		StringBuilder sb = new StringBuilder();

		if (num >= 100) {// 254
			sb.append(belowTwenty[num / 100]).append(" Hundred ");// two hundred
			num %= 100;// 54
		}

		if (num >= 20) {// 54
			sb.append(tens[num / 10]).append(" ");// fifty
			num %= 10;// 4
		}

		if (num > 0) {// 4
			sb.append(belowTwenty[num]).append(" ");// four
		}

		return sb.toString();
	}

}
