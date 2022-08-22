package leetcode.Array.SquaresOfSortedArray;

/***
 * easy 977
 * 
 * Given an integer array nums sorted in non-decreasing order, 
 * return an array of the squares of each number sorted in non-decreasing order.
 * 
 * 
 * Example 1:
 * Input: nums = [-4,-1,0,3,10]
 * Output: [0,1,9,16,100]
 * Explanation: After squaring, the array becomes [16,1,0,9,100].
 * After sorting, it becomes [0,1,9,16,100].
 * 
 * 
 * Example 2:
 * Input: nums = [-7,-3,2,3,11]
 * Output: [4,9,9,49,121]
 * 
 * T.C. O(n^2);
 * S.C. O(1);
 */

public class SquaresOfSortedArray {

	public static int[] sortedSquares(int[] nums) {
		int step = 0;
		int length = nums.length;

		while (step < length) {
			nums[step] = nums[step] * nums[step];
			step++;
		}

		// sorting
		int i = 0;
		while (i < length) {

			int j = 1;
			while (j < length) {

				if (nums[j] < nums[j - 1]) {
					int tmp = nums[j];
					nums[j] = nums[j - 1];
					nums[j - 1] = tmp;
				}
				j++;
			}
			i++;
		}

		return nums;
	}

	public static void main(String[] args) {

		int[] nums = new int[] { 3, 8, 2, 1, 5, 7, 0 };
		sortedSquares(nums);

		for (int i = 0; i < nums.length; i++) {
			System.out.println("num[" + i + "]= " + nums[i]);
		}
	}

}
