package statusNeo;

public class ReverseStringWithoutInbuilt {

	public static void main(String[] args) {

		String str = "Jitendra, you are Rocking.. ";

		String reverseString = reverseString(str);

		System.out.println(reverseString);
	}

	public static String reverseString(String str) {

		char[] charArray = str.toCharArray();

		int n = charArray.length;

		int start = 0;
		int end = n - 1;

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
