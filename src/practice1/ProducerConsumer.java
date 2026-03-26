package practice1;

public class ProducerConsumer {
	private int data;
	private boolean hasData = false;

	public static void main(String[] args) {

		ProducerConsumer pc = new ProducerConsumer();

		Thread producer = new Thread(() -> {
			int count = 1;
			try {
				for (int i = 0; i < 10; i++) {
					pc.produce(count++);
//					Thread.sleep(1000);
				}
			} catch (Exception e) {
				System.out.println("Exception Caught : " + e.getMessage());
			}
		});

		Thread consumer = new Thread(() -> {
			try {
				for (int i = 0; i < 10; i++) {
					pc.consume();
//					Thread.sleep(1500);
				}
			} catch (Exception e) {
				System.out.println("Exception Caught : " + e.getMessage());
			}
		});

		producer.start();
		consumer.start();

	}

	public synchronized void produce(int value) throws InterruptedException {

		while (hasData) {
			wait();
		}
		data = value;
		System.out.println("Produced Value : " + data);
		hasData = true;
		notify();
	}

	public synchronized void consume() throws InterruptedException {
		while (!hasData) {
			wait();
		}
		System.out.println("consumed Value : " + data);
		hasData = false;
		notify();

	}
}
