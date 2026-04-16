package practice3;

public class MaxProfit {

	public static void main(String[] args) {
		int[] prices = { 7, 1, 5, 3, 6, 4 };

		int maxProfit = getMaxProfit(prices);
		System.out.println(maxProfit);
	}

	public static int getMaxProfit(int prices[]) {

		if (prices == null || prices.length == 0)
			return 0;

		int maxProfit = 0;
		int currBuyPrice = prices[0];
		for (int i = 1; i < prices.length; i++) {
			if (currBuyPrice > prices[i]) {
				currBuyPrice = prices[i];
			} else {
				int intCurrProfit = prices[i] - currBuyPrice;
				maxProfit = Math.max(maxProfit, intCurrProfit);

			}

		}
		return maxProfit;
	}

}
