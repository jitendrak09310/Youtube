package practice2;

public class CheckPrime {

	public static void main(String[] args) {
		
		boolean prime = isPrime(21);
		System.out.println(prime);

	}

	public static boolean isPrime(int n) {

		if (n < 2) {
			return false;
		}

		for (int i = 2; i <= Math.sqrt(n); i++) {
			if (n % i == 0) {
				return false;
			}
		}
		return true;
	}

}
