package com.meugenom.leetcode.FindMinimumInRotatedSortedArray;

public class FindMinimumInRotatedSortedArray {
	
	public static int findMin(int[] nums) {

        int left = 0;
		int right = nums.length - 1;
        
		while (left < right) {
        
			int mid = left + (right - left) / 2;
            
			if (nums[mid] < nums[right]) {
            
				right = mid;
            
			} else if (nums[mid] > nums[right]) {
            
				left = mid + 1;
            
			}
        }
        
		return nums[left];
    }

	public static void main(String[] args) {
		int[] nums = new int[]{3, 4, 5, 1, 2};
		System.out.println(findMin(nums));
	}

}
