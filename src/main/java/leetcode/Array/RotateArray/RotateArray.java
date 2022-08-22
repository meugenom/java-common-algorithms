package leetcode.Array.RotateArray;

/**
 * medium 189
 * 
 * Given an array, rotate the array to the right by k steps, where k is
 * non-negative.
 * 
 * Example 1:
 * Input: nums = [1,2,3,4,5,6,7], k = 3
 * Output: [5,6,7,1,2,3,4]
 * Explanation:
 * rotate 1 steps to the right: [7,1,2,3,4,5,6]
 * rotate 2 steps to the right: [6,7,1,2,3,4,5]
 * rotate 3 steps to the right: [5,6,7,1,2,3,4]
 * 
 * 
 * Example 2:
 * Input: nums = [-1,-100,3,99], k = 2
 * Output: [3,99,-1,-100]
 * Explanation:
 * rotate 1 steps to the right: [99,-1,-100,3]
 * rotate 2 steps to the right: [3,99,-1,-100]
 * 
 * T.C.: O(n);
 * S.C.: O(n).
 */

public class RotateArray {

	public static void _rotate(int[] nums, int k) {

		if (nums.length < k) {

			int koeff = (k / nums.length);
			k = k - (nums.length * koeff);
			_turn(nums, k);

		} else if (nums.length != 1) {
			_turn(nums, k);
		}
	}

	public static void _turn(int[] nums, int k) {

		int step_array = 0;
		int length = nums.length;
		int[] first = new int[nums.length - k];
		int[] second = new int[k];
		int step_second = 0;

		while (step_array < length) {

			if (length - k > step_array) {
				first[step_array] = nums[step_array];
			}

			if (length - k <= step_array) {
				second[step_second] = nums[step_array];
				step_second++;
			}

			step_array++;
		}

		/*
		 * for(int i=0; i < first.length; i++){
		 * System.out.println("first["+i+"]= "+first[i]);
		 * }
		 * 
		 * for(int i=0; i < second.length; i++){
		 * System.out.println("second["+i+"]= "+second[i]);
		 * }
		 */

		step_array = 0;

		while (step_array < length) {

			if (step_array < k) {
				nums[step_array] = second[step_array];
				// System.out.println("from second array : " + second[step_array]);
			}

			if (step_array >= k) {
				// System.out.println("from first array : " + first[step_array - k]);
				nums[step_array] = first[step_array - k];

			}

			step_array++;
		}

	}

	public static void main(String[] args) {

		int[] nums = new int[] { 1, 2, 3, 4, 5, 6, 7 };
		// int[] nums = new int[]{1,2};
		int k = 3;
		_rotate(nums, k);

		for (int i = 0; i < nums.length; i++) {
			System.out.println("num[" + i + "]= " + nums[i]);
		}
	}

}
