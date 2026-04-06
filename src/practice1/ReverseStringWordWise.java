package practice1;

public class ReverseStringWordWise {

	public static void main(String[] args) {

		String str = "Core java code";
		String reversewords = reversewords(str);
		System.out.println(reversewords);

	}

	public static String reversewords(String str) {
		String[] wordsArray = str.split(" ");

		String res = "";
		int n = wordsArray.length;
		System.out.println(n);

		for (int i = n - 1; i >= 0; i--) {
			res = res + wordsArray[i] +" ";

		}
		return res;
	}

}
