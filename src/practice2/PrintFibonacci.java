package practice2;

import java.util.stream.Stream;

public class PrintFibonacci {

	public static void main(String[] args) {
		printFib(10);

	}

	public static void printFib(int n) {

		Stream.iterate(new int[] { 0, 1 }, fib -> new int[] { fib[1], fib[0] + fib[1] }).map(fib -> fib[0]).limit(n)
				.forEach(s -> System.out.print(s + " "));

	}

}
