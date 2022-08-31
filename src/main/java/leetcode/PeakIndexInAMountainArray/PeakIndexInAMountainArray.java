package leetcode.PeakIndexInAMountainArray;

/***
 * 852 medium
 * An array arr a mountain if the following properties hold:
 *
 * arr.length >= 3
 * There exists some i with 0 < i < arr.length - 1 such that:
 * arr[0] < arr[1] < ... < arr[i - 1] < arr[i]
 * arr[i] > arr[i + 1] > ... > arr[arr.length - 1]
 * Given a mountain array arr, return the index i such that arr[0] < arr[1] <
 * ... < arr[i - 1] < arr[i] > arr[i + 1] >
 * ... > arr[arr.length - 1].
 * You must solve it in O(log(arr.length)) time complexity.
 *
 * Example 1:
 * Input: arr = [0,1,0]
 * Output: 1
 *
 * Example 2:
 * Input: arr = [0,2,1,0]
 * Output: 1
 *
 * Example 3:
 * Input: arr = [0,10,5,2]
 * Output: 1
 * 
 * T.C.: 0(logN);
 * S.C.: O(1).
 */

public class PeakIndexInAMountainArray {

	public static int peakIndexInMountainArray(int[] arr) {
		int left = 0;
		int right = arr.length;
		return helper(left, right, arr);
	}

	private static int helper(int left, int right, int[] arr) {

		int mid = left + (right - left) / 2;

		if (arr[mid] > arr[mid + 1] && arr[mid] > arr[mid - 1]) {
			return mid;

		} else {
			if (arr[mid] > arr[mid + 1]) {
				right = mid - 1;

				return helper(left, mid, arr);
			} else {
				left = mid + 1;
				return helper(left, right, arr);
			}
		}
	}

	public static void main(String[] args) {
		int[] arr = new int[] { 40, 48, 61, 75, 100, 99, 98, 39, 30, 10 };
		System.out.println(peakIndexInMountainArray(arr));
	}
}
