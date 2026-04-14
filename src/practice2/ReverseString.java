package practice2;

import java.util.stream.IntStream;

public class ReverseString {

	public static void main(String[] args) {

		String str = "Jitendra is working hard.. ";
		String reverseString = reverseString(str);
		System.out.println(reverseString);
		String reverseStringUsingStreamApi = reverseStringUsingStreamApi(str);
		System.out.println(reverseStringUsingStreamApi);

	}

	public static String reverseStringUsingStreamApi(String str) {
		StringBuilder sb = new StringBuilder();
		int n = str.length();
		IntStream.range(0, n).mapToObj(s -> str.charAt(n - 1 - s)).forEach(sb::append);
		return sb.toString();
	}

	public static String reverseString(String str) {
		char[] charArray = str.toCharArray();
		int start = 0, end = charArray.length - 1;

		while (start < end) {
			char temp = charArray[start];
			charArray[start] = charArray[end];
			charArray[end] = temp;

			start++;
			end--;
		}
		return new String(charArray);
	}
}
