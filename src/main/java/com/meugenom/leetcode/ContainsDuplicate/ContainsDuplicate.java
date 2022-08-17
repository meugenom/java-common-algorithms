package com.meugenom.leetcode.ContainsDuplicate;

import java.util.HashSet;
import java.util.Set;

/**
 * Given an integer array nums, 
 * return true if any value appears at least twice in the array, 
 * and return false if every element is distinct.
 * 
 * Example 1:
 * Input: nums = [1,2,3,1]
 * Output: true
 * 
 * Example 2:
 * Input: nums = [1,2,3,4]
 * Output: false
 * 
 * Example 3:
 * Input: nums = [1,1,1,3,3,4,3,2,4,2]
 * Output: true
*/

public class ContainsDuplicate {
	
	
	public static boolean containsDuplicate(int[] nums) {
		
		// Hash Set Initialisation
        Set<Integer> setNums = new HashSet<>();
		//add nums  to hashset
		for (int i = 0; i < nums.length; i++) {
			setNums.add(nums[i]);
		}
		
		return nums.length != setNums.size(); 
    }

	public static void main(String[] args) {
		int[] nums = new int[]{1,2,3,4};
		System.out.println(containsDuplicate(nums));
	}
}


