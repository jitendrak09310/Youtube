package practice2;

public class PrducerConsumer {

	private static boolean hasData = false;
	private static volatile int data;

	public static void main(String[] args) {

		PrducerConsumer pc = new PrducerConsumer();

		Thread prod = new Thread(() -> {
			int count = 1;
			try {
				for (int i = 0; i < 10; i++) {
					pc.produce(count++);
				}
			} catch (Exception e) {
				System.out.println("Exception Caught : " + e.getMessage());
			}

		});

		Thread cons = new Thread(() -> {
			try {
				for (int i = 0; i < 10; i++) {
					pc.consume();
				}
			} catch (Exception e) {
				System.out.println("Exception Caught : " + e.getMessage());
			}
		});

		prod.start();
		cons.start();

	}

	public synchronized int produce(int count) throws InterruptedException {

		while (hasData) {
			wait();
		}

		data = count;
		System.out.println("Data produced ... " + Thread.currentThread().getName() + " " + data);
		hasData = true;
		notifyAll();

		return data;

	}

	public synchronized void consume() throws InterruptedException {

		while (!hasData) {
			wait();

		}
		System.out.println("Data consumed ... " + Thread.currentThread().getName() + " " + data);
		hasData = false;
		notifyAll();

	}

}
