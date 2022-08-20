package leetcode.MoveZeroes;

/**
 * Given an integer array nums, 
 * move all 0's to the end of it while maintaining the relative order of the non-zero elements.
 * Note that you must do this in-place without making a copy of the array.
 * 
 * 
 * Example 1:
 * Input: nums = [0,1,0,3,12]
 * Output: [1,3,12,0,0]
 * 
 * 
 * Example 2:
 * Input: nums = [0]
 *  Output: [0]
 * 
 */

public class MoveZeroes {
	//new solution
	public static void _moveZeroes(int[] nums) {
		
		int j = 0;

		for (int i = 0; i < nums.length; i++) {
			if(nums[i] != 0){
				int tmp = nums[i];
				nums[i] = nums[j];
				nums[j] = tmp;
				j++;
			}
			
		}
	}	



	//old solution
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
		_moveZeroes(nums);

		for (int i = 0; i < nums.length; i++) {
			System.out.println("num[" + i + "] = " + nums[i]);
		}

	}
}
