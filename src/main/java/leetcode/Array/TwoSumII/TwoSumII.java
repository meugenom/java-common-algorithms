package leetcode.Array.TwoSumII;

/***
 * medium 167
 * 
 * Given a 1-indexed array of integers numbers that is already sorted in
 * non-decreasing order,
 * find two numbers such that they add up to a specific target number. Let these
 * two numbers be numbers[index1]
 * and numbers[index2] where 1 <= index1 < index2 <= numbers.length.
 * Return the indices of the two numbers, index1 and index2, added by one as an
 * integer array [index1, index2] of length 2.
 * The tests are generated such that there is exactly one solution. You may not
 * use the same element twice.
 * Your solution must use only constant extra space.
 * 
 * Example 1:
 * Input: numbers = [2,7,11,15], target = 9
 * Output: [1,2]
 * Explanation: The sum of 2 and 7 is 9. Therefore, index1 = 1, index2 = 2. We
 * return [1, 2].
 * 
 * 
 * Example 2:
 * Input: numbers = [2,3,4], target = 6
 * Output: [1,3]
 * Explanation: The sum of 2 and 4 is 6. Therefore index1 = 1, index2 = 3. We
 * return [1, 3].
 * 
 * 
 * Example 3:
 * Input: numbers = [-1,0], target = -1
 * Output: [1,2]
 * Explanation: The sum of -1 and 0 is -1. Therefore index1 = 1, index2 = 2. We
 * return [1, 2].
 * 
 * T.C.: O(n);
 * S.C.: O(n).
 */

public class TwoSumII {
	public static int[] twoSum(int[] numbers, int target) {

		int[] result = new int[2];
		int left = 0;
		int right = numbers.length - 1;

		while (left < right) {
			if (numbers[left] + numbers[right] == target) {
				result[0] = left + 1;
				result[1] = right + 1;
				return result;
			} else if (numbers[left] + numbers[right] > target) {
				right--;
			} else {
				left++;
			}
		}
		return result;
	}

	// old variant
	/*
	 * public static int[] twoSum(int[] numbers, int target) {
	 * int[] result = new int[2];
	 * 
	 * int step = 0;
	 * int length = numbers.length;
	 * 
	 * while(step < length){
	 * 
	 * int s = step + 1;
	 * 
	 * while(s < length){
	 * 
	 * if(numbers[step] + numbers[s] == target){
	 * result[1] = s + 1;
	 * result[0] = step + 1;
	 * break;
	 * }
	 * s++;
	 * }
	 * 
	 * step++;
	 * 
	 * }
	 * 
	 * return result;
	 * }
	 */

	public static void main(String[] args) {

		// int[] numbers = new int[]{2, 3, 4};
		// int target = 6;
		// int[] numbers = new int[]{2, 7, 11, 15};
		// int target = 9;
		// int[] numbers = new int[]{-1, 0};
		// int target = -1;
		// int[] numbers = new int[]{5, 25, 75};
		// int target = 100;
		int[] numbers = new int[] { 0, 0, 3, 4 };
		int target = 0;
		int[] res = twoSum(numbers, target);
		for (int i = 0; i < res.length; i++) {
			System.out.println("res[" + i + "]= " + res[i]);
		}
	}
}
