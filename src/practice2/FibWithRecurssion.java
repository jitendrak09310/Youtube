package practice2;

public class FibWithRecurssion {

	public static void main(String[] args) {

		int n = 10;
		for (int i = 0; i < n; i++) {
			System.out.print(getFib(i) + " ");
		}

	}

	public static int getFib(int n) {
		if (n < 2) {
			return n;
		}
		return getFib(n - 1) + getFib(n - 2);
	}

}
