package leetcode.Array.MaximumIceCreamBars;

import java.util.Arrays;

/**
 * 1833. Maximum Ice Cream Bars medium
 * 
 * It is a sweltering summer day, and a boy wants to buy some ice cream bars.
 * At the store, there are n ice cream bars. You are given an array costs of length n, 
 * where costs[i] is the price of the ith ice cream bar in coins. 
 * The boy initially has coins coins to spend, 
 * and he wants to buy as many ice cream bars as possible. 
 * Return the maximum number of ice cream bars the boy can buy with coins coins.
 * Note: The boy can buy the ice cream bars in any order.
 * 
 * Example 1:
 * Input: costs = [1,3,2,4,1], coins = 7
 * Output: 4
 * Explanation: The boy can buy ice cream bars at indices 0,1,2,4 for a total price of 1 + 3 + 2 + 1 = 7.
 * 
 * Example 2:
 * Input: costs = [10,6,8,7,7,8], coins = 5
 * Output: 0
 * Explanation: The boy cannot afford any of the ice cream bars.
 * 
 * Example 3:
 * Input: costs = [1,6,3,1,2,5], coins = 20
 * Output: 6
 * Explanation: The boy can buy all the ice cream bars for a total price 
 * of 1 + 6 + 3 + 1 + 2 + 5 = 18.
 * 
 * T.C.: O(n log n);
 * S.C.: O(1);
 */

public class MaximumIceCreamBars {

	public static int maxIceCream(int[] costs, int coins) {

		int numberOfIceCreams = 0;
		
		//sort(costs);
        Arrays.sort(costs);

		// print sorted array
		//for (int i = 0; i < costs.length; i++) {
		//	System.out.println("i=" + i + ", costs[i]=" + costs[i]);
		//}

		for (int i = 0; i < costs.length; i++) {
			if (coins - costs[i] >= 0) {
				numberOfIceCreams++;
				coins = coins - costs[i];
			} else {
				break;
			}
		}

		return numberOfIceCreams;
	}

	public static void sort(int[] costs) {

		int i = 0;

		while (i < costs.length) {
			int min = costs[i];
			int idx = i;

			// find min number in the current interval and index
			for (int j = i; j < costs.length; j++) {
				if (min > costs[j]) {
					min = costs[j];
					idx = j;
				}
			}

			// write min to the current cell
			int tmp = costs[i];
			costs[i] = min;
			costs[idx] = tmp;

			i++;
		}
	}

	public static void main(String[] args) {
		//example 1
		int[] costs = new int[] { 1, 3, 2, 4, 1 };
		int coins = 7;
		System.out.println(maxIceCream(costs, coins));
		
		//example 2
		costs = new int[] { 10, 6, 8, 7, 7, 8 };
		coins = 5;
		System.out.println(maxIceCream(costs, coins));
		
		//example 3
		costs = new int[] { 1, 6, 3, 1, 2, 5 };
		coins = 20;
		System.out.println(maxIceCream(costs, coins));

	}
}
