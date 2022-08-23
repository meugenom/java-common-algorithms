package leetcode.Backtracking.CombinationSum;

/***
 * medium 39
 * 
 * Given an array of distinct integers candidates and a target integer target, 
 * return a list of all unique combinations of candidates where the chosen numbers sum to target. 
 * You may return the combinations in any order.
 * The same number may be chosen from candidates an unlimited number of times.
 * Two combinations are unique if the frequency of at least one of the chosen numbers is different.
 * It is guaranteed that the number of unique combinations that sum up to target is less than 150 combinations 
 * for the given input.
 * 
 * Example 1:
 * Input: candidates = [2,3,6,7], target = 7
 * Output: [[2,2,3],[7]]
 * Explanation:
 * 2 and 3 are candidates, and 2 + 2 + 3 = 7. Note that 2 can be used multiple times.
 * 7 is a candidate, and 7 = 7.
 * These are the only two combinations.
 * 
 * Example 2:
 * Input: candidates = [2,3,5], target = 8
 * Output: [[2,2,2,2],[2,3,3],[3,5]]
 * 
 * Example 3:
 * Input: candidates = [2], target = 1
 * Output: []
 * 
 * T.C.: O(n^2);
 * S.C.: O(n).
 */


import java.util.ArrayList;
import java.util.List;

public class CombinationSum {

	public static List<List<Integer>> combinationSum(int[] candidates, int target) {

		List<List<Integer>> result = new ArrayList<List<Integer>>();

		helper(candidates, 0, target, result, new ArrayList<>());

		return result;
	}

	private static void helper(int[] candidates, int i, int target, List<List<Integer>> result, List<Integer> tmp) {

		if (i == candidates.length) {
			if (target == 0) {
				result.add(new ArrayList<>(tmp));
				//System.out.println(tmp.toString());
			}
			return;
		}

		if (candidates[i] <= target) {

			tmp.add(candidates[i]);
			helper(candidates, i, target - candidates[i], result, tmp);
			tmp.remove(tmp.size() - 1);

		}

		helper(candidates, i + 1, target, result, tmp);
	}

	public static void main(String[] args) {
		int[] candidates = new int[] { 3, 7, 11 };
		int target = 15;
		combinationSum(candidates, target);

	}
}
