package leetcode.Array.SquaresOfSortedArray;

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
