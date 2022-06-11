package com.meugenom.leetcode.SearchInsertPosition;

public class SearchInsertPosition {

    public int searchInsert(int[] nums, int target) {

        for(int i = 0; i < nums.length; i++) {

            if(nums[i] == target) {
                return i;
            } else if(target > nums[nums.length-1]) {
                return nums.length;
            } else if(target > nums[i]
                        && target < nums[i+1]) {
                return i+1;
            }
        }
        return 0;
    }
}
