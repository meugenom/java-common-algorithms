package leetcode.Array.MergeSortedArray;

/***
 * easy 88
 * 
 * Example 1:
 * Input: nums1 = [1,2,3,0,0,0], m = 3, nums2 = [2,5,6], n = 3
 * Output: [1,2,2,3,5,6]
 * Explanation: The arrays we are merging are [1,2,3] and [2,5,6].
 * The result of the merge is [1,2,2,3,5,6] with the underlined elements coming
 * from nums1.
 * 
 * Example 2:
 * Input: nums1 = [1], m = 1, nums2 = [], n = 0
 * Output: [1]
 * Explanation: The arrays we are merging are [1] and [].
 * The result of the merge is [1].
 * 
 * Example 3:
 * Input: nums1 = [0], m = 0, nums2 = [1], n = 1
 * Output: [1]
 * Explanation: The arrays we are merging are [] and [1].
 * The result of the merge is [1].
 * Note that because m = 0, there are no elements in nums1.
 * The 0 is only there to ensure the merge result can fit in nums1.
 * 
 * T.C.: O(n^2)
 * S.C.: O(1)
 */

public class MergeSortedArray {

	public void merge(int[] nums1, int m, int[] nums2, int n) {

		if (m == 0 && nums1.length == 1) {
			nums1[0] = nums2[0];
		}

		int lengthA = nums1.length;
		int lengthB = nums2.length;
		int a = 0;
		int b = 0;

		while (a < lengthA) {
			if (nums1[a] == 0 && b < lengthB) {
				nums1[a] = nums2[b];
				b++;
			}
			a++;
		}

		this.sort(nums1);
	}

	public int[] sort(int[] arr) {

		int temp;

		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr.length; j++) {
				if (arr[j] > arr[i]) {
					temp = arr[i];
					arr[i] = arr[j];
					arr[j] = temp;
				}
			}
		}
		return arr;
	}

	public static void main(String[] args) {

		MergeSortedArray d = new MergeSortedArray();
		int[] nums1 = new int[] { 1, 0 };
		int[] nums2 = new int[] { 2 };
		int m = 1;
		int n = 1;
		d.merge(nums1, m, nums2, n);
	}
}