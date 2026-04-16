package practice3;

import java.util.stream.Stream;

public class PrintFib {

	public static void main(String[] args) {
		printFib();

	}

	public static void printFib() {
		Stream.iterate(new int[] { 0, 1 }, fib -> new int[] { fib[1], fib[0] + fib[1] }).map(fib -> fib[0]).limit(10)
				.forEach(System.out::println);
	}

}
