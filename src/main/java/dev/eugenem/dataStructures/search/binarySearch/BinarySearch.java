package dev.eugenem.dataStructures.search.binarySearch;

public class BinarySearch {

	/**
	 * @see !!! binary search works with sorted nums
	 * @param nums   - int array
	 * @param target - searched value
	 * @return
	 */
	public int search(int[] nums, int target) {

		int mid;
		int left = 0;
		int right = nums.length - 1;

		while (left <= right) {

			mid = left + (right - left) / 2;

			if (nums[mid] == target) {
				return mid;
			}

			if (target < nums[mid]) {
				right = mid - 1;
			} else {
				left = mid + 1;
			}
		}

		return -1;

	}
}
