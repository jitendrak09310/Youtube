package practice1;

public class PrintOddEvenWithThreads {
	private volatile int num = 0;

	public static void main(String[] args) {

		PrintOddEvenWithThreads poe = new PrintOddEvenWithThreads();

		Thread odd = new Thread(() -> {
			try {
				poe.printOdd();
			} catch (Exception e) {
				System.out.println("Exception Caught : " + e.getMessage());
			}

		}, "Odd Thread");

		Thread even = new Thread(() -> {
			try {
				poe.printEven();
			} catch (Exception e) {
				System.out.println("Exception Caught : " + e.getMessage());
			}

		}, "Even Thread");
		odd.start();
		even.start();
	}

	public synchronized void printOdd() throws InterruptedException {

		while (num < 10) {
			while (num % 2 == 0) {
				wait();
			}
			System.out.println(Thread.currentThread().getName() + " " + num++);
			notifyAll();

		}

	}

	public synchronized void printEven() throws InterruptedException {

		while (num < 10) {
			while (num % 2 != 0) {
				wait();
			}
			System.out.println(Thread.currentThread().getName() + " " + num++);
			notifyAll();

		}

	}
}
