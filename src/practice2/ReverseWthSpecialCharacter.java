package practice2;

public class ReverseWthSpecialCharacter {

	public static void main(String[] args) {
		String str = "jit%!en#dra^";

		String reverseString = reverseString(str);
		System.out.println(reverseString);
	}

	public static String reverseString(String str) {
		int start = 0;
		char[] charArray = str.toCharArray();
		int end = charArray.length-1;

		while (start < end) {

			if (!Character.isAlphabetic(charArray[start])) {
				start++;
			} else if (!Character.isAlphabetic(charArray[end])) {
				end--;
			} else {

				char temp = charArray[start];
				charArray[start] = charArray[end];
				charArray[end] = temp;

				start++;
				end--;
			}

		}

		return new String(charArray);
	}

}
