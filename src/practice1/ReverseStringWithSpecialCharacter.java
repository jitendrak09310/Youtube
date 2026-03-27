package practice1;

public class ReverseStringWithSpecialCharacter {

	public static void main(String[] args) {

		String str = "fen!@232Hhero";

	}

	public static String reverseString(String str) {
		int start = 0;
		int end = str.length();

		while (start < end) {

			if (Character.isAlphabetic(str.charAt(start))) {
				char temp = str.charAt(start);
			}
		}
		return str;
	}

}
