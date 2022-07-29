package com.meugenom.leetcode.CombinationSum;

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
				System.out.println(tmp.toString());
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
