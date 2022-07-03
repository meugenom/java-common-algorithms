package com.meugenom.leetcode.MoveZeroes;

public class MoveZeroes {

	public static void moveZeroes(int[] nums) {
		int step = 0;
		int length = nums.length;
		while (step < length) {
			
			int s = 0;	
			while (s < length - 1) {
				if(nums[s] == 0){
					int tmp = nums[s];
					nums[s] = nums[s+1];
					nums[s + 1] = tmp;
				}
				s++;
			}

			step++;
		}
	}

	public static void main(String[] args) {

		int[] nums = { 0, 1, 0, 0, 12, 3, 8, 0 };
		moveZeroes(nums);

		for (int i = 0; i < nums.length; i++) {
			System.out.println("num[" + i + "] = " + nums[i]);
		}

	}
}
