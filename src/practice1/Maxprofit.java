package practice1;

public class Maxprofit {

	public static void main(String[] args) {

		int arr[] = { 3, 4, 2, 5, 7, 8, 1 };
		int maxProfit = maxProfit(arr);
		System.out.println(maxProfit);
	}

	public static int maxProfit(int[] arr) {
		int maxProfit = 0;
		int currBuyPrice = arr[0];

		for (int i = 0; i < arr.length; i++) {
			if (currBuyPrice < arr[i]) {
				int currProfit = arr[i] - currBuyPrice;
				maxProfit = Math.max(maxProfit, currProfit);

			} else {
				currBuyPrice = arr[i];
			}
		}
		return maxProfit;
	}

}
