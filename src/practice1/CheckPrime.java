package practice1;

public class CheckPrime {

	public static void main(String[] args) {

		boolean checkPrime = checkPrime(13);
		System.out.println(checkPrime);
	}

	public static boolean checkPrime(int num) {

		if (num < 2) {
			return false;
		}

		for (int i = 2; i <= Math.sqrt(num); i++) { // 64 -- 1 *64 2*32 4*16 8*8 16*4 32*2 64*1
			if (num % i == 0) {
				return false;
			}
		}
		return true;
	}

}
