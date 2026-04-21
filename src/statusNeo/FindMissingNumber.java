package statusNeo;

public class FindMissingNumber {

	public static void main(String[] args) {

		int[] arr = { 1, 2, 3, 4, 6, 7 };
		int n = 7;

		// find the sum of n natural numbers = n*(n+1)/2;

		int findMissingNumber = findMissingNumber(arr, n);
		System.out.println(findMissingNumber);
	}

	public static int findMissingNumber(int arr[], int n) {

		int expectedSum = n * (n + 1) / 2;

		int actualSum = 0;

		for (int num : arr) {
			actualSum += num;
		}

		return expectedSum - actualSum;
	}

}
