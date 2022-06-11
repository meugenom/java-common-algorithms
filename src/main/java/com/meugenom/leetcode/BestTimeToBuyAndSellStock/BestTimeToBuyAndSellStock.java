package com.meugenom.leetcode.BestTimeToBuyAndSellStock;

import java.util.Stack;

public class BestTimeToBuyAndSellStock {

    Stack<Integer> stack = new Stack<Integer>();

    public int maxProfit(int[] prices) {

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

    public static void main(String[] args) {

        BestTimeToBuyAndSellStock s = new BestTimeToBuyAndSellStock();

        int[] prices = new int[] { 7, 1, 5, 3, 6, 4 };
        prices = new int[] { 3, 3, 5, 0, 0, 3, 1, 4 };
        System.out.println(s.maxProfit(prices));
    }
}
