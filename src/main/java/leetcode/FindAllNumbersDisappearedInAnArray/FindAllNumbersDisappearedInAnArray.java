package leetcode.FindAllNumbersDisappearedInAnArray;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class FindAllNumbersDisappearedInAnArray {

	public static List<Integer> findDisappearedNumbers(int[] nums) {

		List<Integer> result = new ArrayList<>();

		// hashset helps with sorting and no duplicate elements
		Set<Integer> set = new HashSet<>();

		// add elements to the hashset
		for (int i = 0; i < nums.length; i++) {
			set.add(nums[i]);
		}

		// compare hashset and inputted array
		// if element doesn't exist in the hash -> then add this element to the
		// disappeared result's list
		for (int i = 1; i <= nums.length; i++) {
			if (!(set.contains(i))) {
				result.add(i);
			}
		}
		return result;
	}

	public static void main(String[] args) {
		int[] nums = new int[] { 4, 3, 2, 7, 8, 2, 3, 1 };
		List<Integer> res = findDisappearedNumbers(nums);
		res.forEach(val -> {
			System.out.println("value = " + val);
		});

	}
}
