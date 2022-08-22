package leetcode.Array.Permutations;

/***
 * medium 46
 * 
 * Given an array nums of distinct integers, return all the possible permutations. 
 * You can return the answer in any order.
 * 
 * Example 1:
 * Input: nums = [1,2,3]
 * Output: [[1,2,3],[1,3,2],[2,1,3],[2,3,1],[3,1,2],[3,2,1]]
 * 
 * 
 * Example 2:
 * Input: nums = [0,1]
 * Output: [[0,1],[1,0]]
 * 
 * 
 * Example 3:
 * Input: nums = [1]
 * Output: [[1]]
 * 
 * T.C.: O(n^2)
 * S.C.: O(n)
 */


import java.util.ArrayList;
import java.util.List;


public class Permutations {

	public static List<List<Integer>> permute(int[] nums) {

		List<List<Integer>> result = new ArrayList<>();
		List<Integer> track = new ArrayList<>();

		boolean[] visited = new boolean[nums.length];

		for (int i = 0; i < visited.length; i++) {
			System.out.println(visited[i]);
		}

		backtrack(nums, track, visited, result);

		return result;
	}

	public static void backtrack(int[] nums, List<Integer> track, boolean[] visited, List<List<Integer>> result) {

		if (nums.length == track.size()) {
			result.add(new ArrayList<>(track));
		}

		for (int i = 0; i < nums.length; i++) {

			if (visited[i] == true)
				continue;
			track.add(nums[i]);
			visited[i] = true;
			backtrack(nums, track, visited, result);
			track.remove(track.size() - 1);
			visited[i] = false;
		}
	}

	public static void main(String[] args) {
		int[] nums = new int[] { 1, 2, 3 };
		System.out.println(permute(nums));
	}
}
