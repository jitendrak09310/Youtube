package statusNeo;

import java.util.Arrays;

public class MaxSubArraySum {

	public static void main(String[] args) {

		int[] arr = { -2, 1, -3, 4, -1, 2, 1, -5, 4 };
		int maxSubArraySum = maxSubArraySum(arr);
		System.out.println(maxSubArraySum);

		int[] maxSubArray = maxSubArray(arr);

		int[] copyOfRange = Arrays.copyOfRange(arr, maxSubArray[1], maxSubArray[2] + 1);
		System.out.println(Arrays.toString(copyOfRange));
		System.out.println(maxSubArray[0]);

	}

	// max sum subArray

	public static int[] maxSubArray(int[] arr) {

		int maxSum = arr[0];
		int curSum = arr[0];

		int start = 0, end = 0, tempStart = 0;

		for (int i = 1; i < arr.length; i++) {
			if (arr[i] > arr[i] + curSum) {
				curSum = arr[i];
				tempStart = i;
			} else {
				curSum += arr[i];
			}

			if (curSum > maxSum) {
				maxSum = curSum;
				start = tempStart;
				end = i;
			}
		}

		return new int[] { maxSum, start, end };

	}

//max sum
	public static int maxSubArraySum(int[] arr) {

		int maxSum = arr[0];
		int curSum = arr[0];

		for (int i = 1; i < arr.length; i++) {

			curSum = Math.max(arr[i], arr[i] + curSum);
			maxSum = Math.max(maxSum, curSum);
		}

		return maxSum;
	}

}
