package leetcode.Array.Permutations;

import java.util.ArrayList;
import java.util.List;

/*
 * related topics:
 * - arrays
 * - backtracking
 */

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
