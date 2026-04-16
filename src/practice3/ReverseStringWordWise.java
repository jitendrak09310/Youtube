package practice3;

public class ReverseStringWordWise {

	public static void main(String[] args) {

		String str = "This is Jitendra builing his future";

		String reverseString = reverseString(str);
		System.out.println(reverseString);

		String reverseUsingStream = reverseUsingStream(reverseString);
		System.out.println(reverseUsingStream);

		String string = new StringBuilder(str).reverse().toString();

		System.out.println(string);
	}

	public static String reverseUsingStream(String str) {
		String string = str.chars().mapToObj(c -> (char) c)
				.collect(StringBuilder::new, StringBuilder::append, StringBuilder::append).reverse().toString();
		return string;
	}

	public static String reverseString(String str) {

		String[] split = str.split(" ");
		StringBuilder sb = new StringBuilder();

		for (String s : split) {

			char[] charArray = s.toCharArray();

			int start = 0;
			int end = charArray.length - 1;

			while (start < end) {
				char temp = charArray[start];
				charArray[start] = charArray[end];
				charArray[end] = temp;
				start++;
				end--;
			}
			sb.append(new String(charArray) + " ");
		}

		return sb.toString();
	}

}
