package leetcode.Backtracking.Combinations;

/***
 * medium 77
 * 
 * Given two integers n and k, return all possible combinations of k numbers chosen from the range [1, n].
 * You may return the answer in any order.
 * 
 * 
 * Example 1:
 * Input: n = 4, k = 2
 * Output: [[1,2],[1,3],[1,4],[2,3],[2,4],[3,4]]
 * Explanation: There are 4 choose 2 = 6 total combinations.
 * Note that combinations are unordered, i.e., [1,2] and [2,1] are considered to be the same combination.
 * 
 * 
 * Example 2:
 * Input: n = 1, k = 1
 * Output: [[1]]
 * Explanation: There is 1 choose 1 = 1 total combination.
 * 
 * T.C.: O(n^2);
 * S.C.: O(2n).
 */

import java.util.ArrayList;
import java.util.List;

public class Combinations {

	public static List<List<Integer>> combine(int n, int k) {

		List<List<Integer>> result = new ArrayList<>();
		List<Integer> track = new ArrayList<>();

		backtrack(n, k, track, 1, result);

		return result;
	}

	public static void backtrack(int n, int k, List<Integer> track, int index, List<List<Integer>> result) {
		if (track.size() == k) {
			result.add(new ArrayList<>(track));
			return;
		}

		for (int i = index; i <= n; i++) {
			track.add(i);
			backtrack(n, k, track, i + 1, result);
			track.remove(track.size() - 1);
		}
	}

	public static void main(String[] args) {
		int n = 4;
		int k = 2; // out: [[1,2],[1,3],[1,4],[2,3],[2,4],[3,4]]
		// int n = 1;
		// int k = 1; //out : [[1]]
		// int n = 2;
		// int k = 1; //out : [[1]]
		System.out.println(combine(n, k));

	}
}
