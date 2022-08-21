package leetcode.LongestConsecutiveSequence;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

/***
 * 
 * 	128 medium
 * 
 * Given an unsorted array of integers nums, return the length of the longest
 * consecutive elements sequence.
 * You must write an algorithm that runs in O(n) time.
 * 
 * Example 1:
 * Input: nums = [100,4,200,1,3,2]
 * Output: 4
 * Explanation: The longest consecutive elements sequence is [1, 2, 3, 4].
 * Therefore its length is 4.
 * 
 * 
 * Example 2:
 * Input: nums = [0,3,7,2,5,8,4,6,0,1]
 * Output: 9
 * 
 * Time Complexity O(n)
 * Space Complexity O(1)
 */

public class LongestConsecutiveSequence {

	// second loop with while works by private case and
	// in the Time Complexity isn't calculated
	// T.C. - O(n)
	public static int longestConsecutive(int[] nums) {

		Set<Integer> num_set = new HashSet<Integer>();
		for (int num : nums) {
			num_set.add(num);
		}

		int longestStreak = 0;

		for (int num : num_set) {
			if (!num_set.contains(num - 1)) {
				int currentNum = num;
				int currentStreak = 1;

				while (num_set.contains(currentNum + 1)) {
					currentNum += 1;
					currentStreak += 1;
				}

				longestStreak = Math.max(longestStreak, currentStreak);
			}
		}

		return longestStreak;
	}

	/*
	 * Time Complexity (Arrays.sort is O(lgN))
	 * 
	 * public static int longestConsecutive(int[] nums) {
	 * 
	 * //need sorting array
	 * Arrays.sort(nums);
	 * 
	 * int j = 0;
	 * int i = 1;
	 * int longStrike = 0;
	 * int maxLongStrike = 0;
	 * 
	 * while(i < nums.length ){
	 * 
	 * if(nums[j] == nums[i] - 1){
	 * longStrike++;
	 * }else{
	 * longStrike++;
	 * maxLongStrike = longStrike > maxLongStrike? longStrike: maxLongStrike;
	 * longStrike = 0;
	 * }
	 * 
	 * i++;
	 * j++;
	 * }
	 * 
	 * return maxLongStrike;
	 * 
	 * }
	 */

	public static void main(String[] args) {
		int[] nums = new int[] { 100, 4, 200, 1, 3, 2 };
		System.out.println(longestConsecutive(nums));

	}
}
