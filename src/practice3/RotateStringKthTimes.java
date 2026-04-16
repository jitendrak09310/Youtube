package practice3;

public class RotateStringKthTimes {

	public static void main(String[] args) {

		// this is left rotation try moving the watch

		String str = "jitendra";
		int k = 3;

		String rotatedString = rotateString(str, k);
		System.out.println(rotatedString);

	}

	public static String rotateString(String str, int k) {
		int n = str.length();
		if (str == null || n == 0) {
			return "Invalid String";
		}
		k = k % n;

		return str.substring(k) + str.substring(0, k);
	}

}
