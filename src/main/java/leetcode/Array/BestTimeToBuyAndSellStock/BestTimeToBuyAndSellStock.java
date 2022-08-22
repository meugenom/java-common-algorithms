package leetcode.Array.BestTimeToBuyAndSellStock;

import java.util.Stack;

/***
 * easy 121
 * You are given an array prices where prices[i] is the price of a given stock
 * on the ith day.
 * You want to maximize your profit by choosing a single day to buy one stock
 * and choosing a different day in the future to sell that stock.
 * Return the maximum profit you can achieve from this transaction. If you
 * cannot achieve any profit, return 0.
 * 
 * Example 1:
 * Input: prices = [7,1,5,3,6,4]
 * Output: 5
 * Explanation: Buy on day 2 (price = 1) and sell on day 5 (price = 6), profit =
 * 6-1 = 5.
 * Note that buying on day 2 and selling on day 1 is not allowed because you
 * must buy before you sell.
 * 
 * 
 * Example 2:
 * Input: prices = [7,6,4,3,1]
 * Output: 0
 * Explanation: In this case, no transactions are done and the max profit = 0.
 * 
 * T.C.: O(n);
 * S.C.: O(1);
 */

public class BestTimeToBuyAndSellStock {

	public int maxProfit(int[] prices) {
		
		int minPrice = 99999; // constraint 10^5
		int maxProfit = 0;

		for (int i = 0; i < prices.length; i++) {
			minPrice = Math.min(minPrice, prices[i]);
			maxProfit = Math.max(maxProfit, prices[i] - minPrice);
		}
		return maxProfit;
	}

	// solving with stack
	// Time Complexity: O(n^2)
	/* 
	Stack<Integer> stack = new Stack<Integer>();
	public int _maxProfit(int[] prices) {

		int minPrice = prices[0];
		int multipleProfit = 0;

		if (prices.length == 1) {
			return 0;
		}

		for (int i = 0; i < prices.length; i++) {

			int currentPrice = prices[i];

			while (!stack.isEmpty() && stack.peek() > currentPrice) {
				stack.pop();
			}

			if (stack.isEmpty()) {
				minPrice = currentPrice;
			}

			stack.push(currentPrice);
			multipleProfit = (multipleProfit >= currentPrice - minPrice) ? multipleProfit : currentPrice - minPrice;

		}
		return multipleProfit;
	}
	*/

	public static void main(String[] args) {

		BestTimeToBuyAndSellStock s = new BestTimeToBuyAndSellStock();

		int[] prices = new int[] { 7, 1, 5, 3, 6, 4 };
		// prices = new int[] { 3, 3, 5, 0, 0, 3, 1, 4 };
		System.out.println(s.maxProfit(prices));
		System.out.println(s.maxProfit(prices));
	}
}
