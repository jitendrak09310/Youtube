package practice2;

public class Singleton {

	private static volatile Singleton instance;

	private Singleton() {

	}

	public static void main(String[] args) {
		Singleton instance1 = Singleton.getInstance();
		Singleton instance2 = Singleton.getInstance();

		System.out.println(instance1);
		System.out.println(instance2);

	}

	public static Singleton getInstance() {
		if (instance == null) {
			synchronized (Singleton.class) {
				if (instance == null) {
					instance = new Singleton();

				}
			}

		}

		return instance;
	}

}
