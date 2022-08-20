package leetcode.SearchInRotatedSortedArray;

public class SearchInRotatedSortedArray {

	public int search(int[] nums, int target) {

		if (nums[0] == target) return 0;
		if (nums.length == 1 && nums[0] != target) return -1;

		int k = findRotationsNumber(nums);

		// if we need rotations
		if (k > 0) {
			nums = rotate(nums, k);
			int res = binarySearch(nums, target, 0, nums.length - 1);
			System.out.println("res = " + res);
			System.out.println("k = " + k);
			return res != -1 ? (res + nums.length - k) % nums.length : -1;
		} else {
			// without rotations
			int res = binarySearch(nums, target, 0, nums.length - 1);
			return res != -1 ? res : -1;
		}
	}

	// binary search method
	public int binarySearch(int[] nums, int target, int low, int high) {
		if (low >= high || low < 0 || high < 0)
			return -1;
		if (nums[low] == target)
			return low;
		if (nums[high] == target)
			return high;

		int mid = (low + high) / 2;
		if (nums[mid] == target) {
			return mid;
		} else if (nums[mid] > target) {
			high = mid - 1;
			return binarySearch(nums, target, low, high);
		} else {
			low = mid + 1;
			return binarySearch(nums, target, low, high);
		}
	}

	// find k - number of rotations
	public int findRotationsNumber(int[] nums) {
		int i = 0;
		while (i < nums.length - 1) {
			// find first unsorted value in the array
			if (nums[i + 1] < nums[i]) {
				return nums.length - i - 1;
			}
			i++;
		}
		return 0;
	}

	// get sorted array before rotations
	public int[] rotate(int[] nums, int k) {
		// save last value
		int tmp = nums[nums.length - 1];

		// make left move for all values
		for (int i = nums.length - 1; i > 0; i--) {
			nums[i] = nums[i - 1];
		}

		// push saved last value to the first place in the array
		nums[0] = tmp;
		k--;

		if (k > 0) {
			return rotate(nums, k);
		} else {
			return nums;
		}
	}

	public static void main(String[] args) {
		// int[] nums = new int[]{4, 5, 6, 7, 0, 1, 2};
		// int target = 0;
		// int[] nums = new int[]{4, 5, 6, 7, 0, 1, 2};
		// int target = 1;
		// int[] nums = new int[]{5, 6, 7, 2, 3};
		// int target = 3;
		// int[] nums = new int[]{7,8,1,2,3,4,5,6};
		// int target = 2;
		int[] nums = new int[] { 2, 3, 7, 8, 1 };
		int target = 5; // out -1
		SearchInRotatedSortedArray sarr = new SearchInRotatedSortedArray();
		System.out.println(sarr.search(nums, target));
	}
}
