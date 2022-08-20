package leetcode.FindFirstAndLastPositionOfElementInSortedArray;

public class FindFirstAndLastPositionOfElementInSortedArray {

	public static int[] searchRange(int[] arr, int target) {

		int startingIndexOfTarget = bSearch(arr, target, true);
		int endingIndexOfTarget = bSearch(arr, target, false);

		return new int[] { startingIndexOfTarget, endingIndexOfTarget };

	}

	public static int bSearch(int[] arr, int target, boolean firstIndex) {
		int ans = -1;

		int start = 0;
		int end = arr.length - 1;

		//iterative 
		while (start <= end) {
			int mid = start + (end - start) / 2;
			if (target < arr[mid]) {
				end = end - 1;
			} else if (target > arr[mid]) {
				start = mid + 1;
			} else {

				ans = mid;
				if (firstIndex) {
					end = mid - 1;
				} else {
					start = start + 1;
				}
			}
		}
		return ans;
	}

	public static void main(String[] args) {
		int[] nums = new int[] { 5, 7, 7, 8, 8, 10 };
		int target = 6;
		int[] res = searchRange(nums, target);
		for (int i = 0; i < res.length; i++) {
			System.out.println("[" + i + "] = " + res[i]);
		}

	}
}
