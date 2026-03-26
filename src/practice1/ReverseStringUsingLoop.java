package practice1;

public class ReverseStringUsingLoop {

	public static void main(String[] args) {
		String str = "Recursion";
		String reverseString = reverseString(str);

		System.out.println(reverseString);
	}

	public static String reverseString(String str) {
		char[] charArray = str.toCharArray();
		int length = charArray.length;
		System.out.println(length);
		for (int i = 0; i < (length / 2); i++) {
			char temp = charArray[i];
			charArray[i] = charArray[length - i - 1];// 9 - 0 -1 == 8
			charArray[length - i - 1] = temp;

		}

		return new String(charArray);
	}

}
