package leetcode.RemoveDuplicatesFromSortedArray;

public class RemoveDuplicatesFromSortedArray {

	public static int removeDuplicates(int[] nums) {

		int count = 0;

		for (int i = 0; i < nums.length; i++) {

			if (i == 0 || nums[i] != nums[i - 1]) {

				nums[count] = nums[i];
				count++;
			}
		}

		for (int i = 0; i < nums.length; i++) {

			System.out.println("nums[" + i + "] = " + nums[i]);

		}

		return count;
	}

	public static void main(String[] args) {
		// int[] nums = new int[]{ 1, 1, 2};
		int[] nums = new int[] { 0, 0, 1, 1, 1, 2, 2, 3, 3, 4 };
		System.out.println(removeDuplicates(nums));
	}

}
