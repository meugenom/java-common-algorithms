package com.meugenom.leetcode.MaximumAverageSubarrayI;

/***
 * You are given an integer array nums consisting of n elements, and an integer
 * k.
 * Find a contiguous subarray whose length is equal to k that has the maximum
 * average value and
 * return this value. Any answer with a calculation error less than 10-5 will be
 * accepted.
 * 
 * Example 1:
 * Input: nums = [1,12,-5,-6,50,3], k = 4
 * Output: 12.75000
 * Explanation: Maximum average is (12 - 5 - 6 + 50) / 4 = 51 / 4 = 12.75
 * 
 * 
 * Example 2:
 * Input: nums = [5], k = 1
 * Output: 5.00000
 * 
 */

public class MaximumAverageSubarrayI {

	// backtracking has O(n^2)

	// sliding window method O(n)
	public static double findMaxAverage(int[] nums, int k) {

		int sum = 0;

		for (int i = 0; i < k; i++) {
			sum = sum + nums[i];
		}

		int avg = sum;

		int j = k;

		for (int i = 0; i < nums.length - k; i++) {

			sum = sum + nums[j] - nums[i];
			avg = Math.max(avg, sum);
			j++;

		}

		return (double) avg / k;
	}

	public static void main(String[] args) {
		int[] nums = new int[] { -1, -2 };
		int k = 1;
		System.out.println(findMaxAverage(nums, k));
	}
}
