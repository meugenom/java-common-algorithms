package com.meugenom.leetcode.MaxSubArray;

public class MaxSubArray {

    public int maxSubArray(int[] nums) {

        //put first element to the maxsum
        int maxSum = nums[0];
        int currentSum = maxSum;

        //start loop from 1 to...
        for(int i = 1; i < nums.length; i++) {

            currentSum = (nums[i] + currentSum >= nums[i]) ? nums[i] + currentSum : nums[i];
            maxSum = (currentSum > maxSum) ? currentSum : maxSum;
        }
        return maxSum;
    }

    public static void main(String[] args){

        int[] nums1 = new int[]{-2,1,-3,4,-1,2,1,-5,4};
        MaxSubArray s1 = new MaxSubArray();
        System.out.println(s1.maxSubArray(nums1));
    }
}
