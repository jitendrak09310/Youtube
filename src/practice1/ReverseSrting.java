package practice1;

public class ReverseSrting {

	public static void main(String[] args) {
		String str = "Microservices";
		String reverseString = reverseString(str);
		System.out.println(reverseString);
	}

	public static String reverseString(String str) {
		char[] charArray = str.toCharArray();
		int length = charArray.length;

		int start = 0;
		int end = length - 1;

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
