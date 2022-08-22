package leetcode.Array.MedianOfTwoSortedArrays;

/***
 * hard 4
 * 
 * Given two sorted arrays nums1 and nums2 of size m and n respectively, return
 * the median of the two sorted arrays.
 * The overall run time complexity should be O(log (m+n)).
 * 
 * Example 1:
 * Input: nums1 = [1,3], nums2 = [2]
 * Output: 2.00000
 * Explanation: merged array = [1,2,3] and median is 2.
 * 
 * Example 2:
 * Input: nums1 = [1,2], nums2 = [3,4]
 * Output: 2.50000
 * Explanation: merged array = [1,2,3,4] and median is (2 + 3) / 2 = 2.5.
 * 
 * T.C.: O(log(N));
 * S.C.: O(n).
 */

public class MedianOfTwoSortedArrays {

	public int min;
	public double median;

	public double findMedianSortedArrays(int[] nums1, int[] nums2) {

		int[] arr = this.merge(nums1, nums2);

		// base case
		if (arr.length == 1)
			return arr[0];

		arr = this.sort(arr);
		double right = Math.round((double) arr.length / 2);
		double left = Math.floor((double) arr.length / 2);

		if (Double.compare(left, right) == 0) {
			return Double.sum(arr[(int) left - 1], arr[arr.length - (int) right]) / 2.0;
		} else {
			return arr[(int) left];
		}
	}

	// sorting Time Complexity O(log(N))
	private int[] sort(int[] nums) {

		int left = 0;
		int right = nums.length;
		while (right >= 0) {

			if (nums[left] > nums[left + 1]) {
				int tmp = nums[left];
				nums[left] = nums[left + 1];
				nums[left + 1] = tmp;
			}

			if (left == nums.length - 2) {
				right--;
				left = -1;
			}
			left++;
		}

		return nums;

	}

	public int[] merge(int[] m, int[] n) {
		int[] result = new int[m.length + n.length];

		for (int i = 0; i < m.length; i++) {
			result[i] = m[i];
		}

		for (int j = 0; j < n.length; j++) {
			result[j + m.length] = n[j];
		}

		return result;
	}

	public static void main(String[] args) {
		int[] n = new int[2];
		n[0] = 1;
		n[0] = 3;

		int[] m = new int[1];
		m[0] = 2;

		MedianOfTwoSortedArrays o = new MedianOfTwoSortedArrays();
		System.out.println(o.findMedianSortedArrays(n, m)); // 2.0
	}
}
