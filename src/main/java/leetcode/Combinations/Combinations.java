package leetcode.Combinations;

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
