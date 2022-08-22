package leetcode.Array.MaxSubArray;

/***
 * medium 53
 * 
 * Given an integer array nums, find the contiguous subarray
 * (containing at least one number) which has the largest sum and return its
 * sum.
 * A subarray is a contiguous part of an array.
 * 
 * Example 1:
 * Input: nums = [-2,1,-3,4,-1,2,1,-5,4]
 * Output: 6
 * Explanation: [4,-1,2,1] has the largest sum = 6.
 * 
 * Example 2:
 * Input: nums = [1]
 * Output: 1
 * 
 * Example 3:
 * Input: nums = [5,4,-1,7,8]
 * Output: 23
 * 
 * T.C.: O(n);
 * S.C.: O(1).
 */

public class MaxSubArray {

	public int maxSubArray(int[] nums) {

		// put first element to the maxsum
		int maxSum = nums[0];
		int currentSum = maxSum;

		// start loop from 1 to...
		for (int i = 1; i < nums.length; i++) {

			currentSum = (nums[i] + currentSum >= nums[i]) ? nums[i] + currentSum : nums[i];
			maxSum = (currentSum > maxSum) ? currentSum : maxSum;
		}
		return maxSum;
	}

	public static void main(String[] args) {

		int[] nums1 = new int[] { -2, 1, -3, 4, -1, 2, 1, -5, 4 };
		MaxSubArray s1 = new MaxSubArray();
		System.out.println(s1.maxSubArray(nums1));
	}
}
