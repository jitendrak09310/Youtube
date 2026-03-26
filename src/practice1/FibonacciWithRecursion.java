package practice1;

public class FibonacciWithRecursion {

	public static void main(String[] args) {

		int n = 10;
		for (int i = 0; i < n; i++) {
			System.out.print(printFib(i) + " ");
		}

	}

	public static int printFib(int n) {
		// 0,1,1,2,3..
		if (n <= 1) {
			return n;
		}
		return printFib(n - 1) + printFib(n - 2);
	}

}
