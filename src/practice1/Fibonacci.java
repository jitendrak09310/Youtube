package practice1;

public class Fibonacci {

	public static void main(String[] args) {
		// 0,1,1,2,3,5,8,13..
		printFibonacci();
		
	}

	public static void printFibonacci() {
		int a = 0, b = 1;

		for (int i = 0; i < 10; i++) {
			System.out.print(a + " ");
			int c = a + b;
			a = b;
			b = c;

		}
	}
}
