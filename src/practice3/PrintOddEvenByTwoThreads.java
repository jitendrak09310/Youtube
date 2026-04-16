package practice3;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class PrintOddEvenByTwoThreads {

	public static int num = 1;
	public static int max = 10;

	public static void main(String[] args) {

		PrintOddEvenByTwoThreads print = new PrintOddEvenByTwoThreads();

		ExecutorService executorService = Executors.newFixedThreadPool(2);

		executorService.submit(() -> {
			try {
				print.printOdd();

			} catch (Exception e) {
				System.out.println(e.getMessage());
			}

		}, "Odd Thread");

		executorService.submit(() -> {
			try {
				print.printEven();

			} catch (Exception e) {
				System.out.println(e.getMessage());
			}

		}, "Even Thread");
		executorService.shutdown();

//		Thread odd = new Thread(() -> {
//			try {
//				print.printOdd();
//
//			} catch (Exception e) {
//				System.out.println(e.getMessage());
//			}
//
//		}, "Odd Thread");
//
//		Thread even = new Thread(() -> {
//			try {
//				print.printEven();
//			} catch (Exception e) {
//				System.out.println(e.getMessage());
//			}
//
//		}, "Even Thread");
//
//		odd.start();
//		even.start();

	}

	public synchronized void printEven() throws InterruptedException {

		while (num <= max) {

			while (num % 2 != 0) {
				wait();
			}
			if (num <= max) {
				System.out.println(Thread.currentThread().getName() + " " + num);
				num++;
				notify();
			}

		}

	}

	public synchronized void printOdd() throws InterruptedException {
		while (num <= max) {

			while (num % 2 == 0) {
				wait();
			}
			if (num <= max) {
				System.out.println(Thread.currentThread().getName() + " " + num);
				num++;
				notify();
			}

		}
	}

}
