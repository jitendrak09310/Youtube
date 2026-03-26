package practice1;

import java.util.stream.IntStream;

public class ReversesStringUsingStream {

	public static void main(String[] args) {
		String str = "Method";
		System.out.println(str.length());
		String reverseString = reverseString(str);
		System.out.println(reverseString);
	}

	public static String reverseString(String str) {

		StringBuilder sb = new StringBuilder();
		// 10 --
		IntStream.range(0, str.length()).mapToObj(i -> str.charAt(str.length() - 1 - i)).forEach(sb::append);

		return sb.toString();
	}
}
