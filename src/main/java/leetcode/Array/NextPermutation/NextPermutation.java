package leetcode.Array.NextPermutation;

/***
 * 31 medium
 * 
 * A permutation of an array of integers is an arrangement of its members into a sequence or linear order.
 * For example, for arr = [1,2,3], the following are considered permutations 
 * of arr: [1,2,3], [1,3,2], [3,1,2], [2,3,1].
 * The next permutation of an array of integers is the next lexicographically greater permutation 
 * of its integer. More formally, if all the permutations of the array are sorted in one container 
 * according to their lexicographical order, then the next permutation of that array is the permutation 
 * that follows it in the sorted container. If such arrangement is not possible, 
 * the array must be rearranged as the lowest possible order (i.e., sorted in ascending order).
 * 
 * 
 * For example, the next permutation of arr = [1,2,3] is [1,3,2].
 * Similarly, the next permutation of arr = [2,3,1] is [3,1,2].
 * While the next permutation of arr = [3,2,1] is [1,2,3] 
 * because [3,2,1] does not have a lexicographical larger rearrangement.
 * Given an array of integers nums, find the next permutation of nums.
 * The replacement must be in place and use only constant extra memory.
 * 
 * 
 * Example 1:
 * Input: nums = [1,2,3]
 * Output: [1,3,2]
 * 
 * 
 * Example 2:
 * Input: nums = [3,2,1]
 * Output: [1,2,3]
 * 
 * 
 * Example 3:
 * Input: nums = [1,1,5]
 * Output: [1,5,1]
 */

import java.util.Arrays;

public class NextPermutation {

	// next permutation in lexical order
	// take a number such as 3456 -> 3465 -> 3546 -> 3564 -> 3645 -> 3654 -> 4356 ->
	// .....
	// as we can see the next permutation of number will be at the place where
	// number has
	// has exhausted its possibilities
	// and possibilities will exhaust when the digits next to it are all in
	// increasing order
	// so we will start searching from behind and find the index of element which is
	// breaking
	// the order
	// swap it with digit which is just greater than found digit
	// sort the digits which are after swapped digit

	public static void nextPermutation(int[] nums) {

		// we will start comparing with last value for order break
		for (int i = nums.length - 2; i >= 0; i--) {

			// to store the element which is next greater
			int nxtGrt = Integer.MAX_VALUE;

			// taking index as -1
			int idx = -1;

			// i = index of element
			// j = index of element after i
			for (int j = i + 1; j < nums.length; j++) {

				// if element at j is greater than element at i
				if (nums[j] > nums[i] && nums[j] < nxtGrt) {
					// storing the just greater element
					nxtGrt = nums[j];
					idx = j;
					System.out.println(nxtGrt + " " + idx);
				}

			}

			// the idx will change if element is found
			if (idx != -1) {
				// swapping the elements
				nums[idx] = nums[i];
				nums[i] = nxtGrt;
				Arrays.sort(nums, i + 1, nums.length);
				return;
			}
		}
		// if the whole digit is in decreasing order then there will be no next
		// permutation the next to it will be original number which will be full sorted
		Arrays.sort(nums);
		return;
	}

	public static void main(String[] args) {
		int[] nums = new int[] { 1, 2, 3 };
		nextPermutation(nums);
		System.out.print(Arrays.toString(nums));
	}
}
