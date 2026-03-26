package practice1;

import java.util.stream.Stream;

public class FibonacciUsingStream {

	public static void main(String[] args) {
//0,1,1,2,3,5,8
		printFib(10);
	}

	public static void printFib(int n) {
		Stream.iterate(new int[] { 0, 1 }, t -> new int[] { t[1], t[0] + t[1] }).map(b -> b[0]).limit(n)

				.forEach(s -> System.out.print(s + "  "));
	}

}
