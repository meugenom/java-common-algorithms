package leetcode.TwoSumII;

public class TwoSumII {

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
