package dataStructures.arrays;

public class BinarySearchArray {

	// method iterative
	public int searchIterative(int[] nums, int target) {

		int low = 0;

		int high = nums.length - 1;

		while (low <= high) {

			int mid = (low + high) / 2;

			if (nums[mid] == target) {
				return mid; // searched number found ... got to the end
			} else if (nums[mid] < target) {

				low = mid + 1; // in the next iteration we use right part of the array

			} else {

				high = mid - 1; // in the next iteration we use left part of the array
			}
		}

		return -1;
	}

	// method recursive
	public int searchRecursive(int[] nums, int target, int low, int high) {
		
		if (low == high || low > high) //if number is not present in the array or array is empty
			return -1;
		if (nums[low] == target)
			return low;
		if (nums[high] == target)
			return high;

		int mid = (high + low) / 2;
		if (nums[mid] == target) {
			return mid;
		} else if (nums[mid] > target) {
			high = mid - 1;
			return searchRecursive(nums, target, low, high);
		} else {
			low = mid + 1;
			return searchRecursive(nums, target, low, high);
		}
	}

	public static void main(String[] args) {
		//first example
		int[] nums = new int[] { 1, 4, 7, 15, 67, 89, 90, 234, 678, 876, 901, 1020 };
		int target = 234;
		BinarySearchArray bs = new BinarySearchArray();

		int res = bs.searchRecursive(nums, target, 0, nums.length - 1);
		System.out.println("result = " + res);

		//second example
		int[] nums1 = new int[] { 1, 2, 11, 15, 49, 71, 94, 134, 278, 476, 501, 720 };
		int target1 = 11;
		BinarySearchArray bs1 = new BinarySearchArray();

		int res1 = bs1.searchRecursive(nums1, target1, 0, nums1.length - 1);
		System.out.println("result = " + res1);

	}
}
