package practice1;

public class RotateString {

	public static void main(String[] args) {

		String str = "Jitendra";

		int n = 5;

		String rotated = rotateByKthPosition(str, n);
		
		System.out.println(rotated);

	}

	public static String rotateByKthPosition(String str, int k) {

		if (str == null || str.length() == 0) {
			return str;
		}
		int n = str.length();

		k = k % n;

		return str.substring(k) + str.substring(0, k);

	}

}
