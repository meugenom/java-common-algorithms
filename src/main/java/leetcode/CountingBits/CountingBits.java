package leetcode.CountingBits;

/***
 * Given an integer n, return an array ans of length n + 1 such
 * that for each i (0 <= i <= n),
 * ans[i] is the number of 1's in the binary representation of i.
 * 
 * Example 1:
 * 
 * Input: n = 2
 * Output: [0,1,1]
 * Explanation:
 * 0 --> 0
 * 1 --> 1
 * 2 --> 10
 * 
 * 
 * Example 2:
 * Input: n = 5
 * Output: [0,1,1,2,1,2]
 * Explanation:
 * 0 --> 0
 * 1 --> 1
 * 2 --> 10
 * 3 --> 11
 * 4 --> 100
 * 5 --> 101
 */

public class CountingBits {

	/**
	 * solution with bitwise operator
	 * It's not a recursion
	 * Time: O(n)
	 * Space: O(n)
	 */

	public static int[] _countBits(int n) {
		int[] ans = new int[n + 1];
		ans[0] = 0;
		for (int i = 1; i < ans.length; i++) {
			ans[i] = (i & 1) + ans[i / 2];
		}
		return ans;
	}

	/**
	 * Second solution without bitwise operators
	 * Converted out of recursion, so no Recursive Stack!
	 * Time: O(n)
	 * Space: O(n)
	 */

	public static int[] countBits(int n) {
		int[] ans = new int[n + 1];
		for (int i = 0; i <= n; i++) { // n
			ans[i] = helper(i, ans); // 1
		}
		return ans;
	}

	public static int helper(int n, int[] memo) {

		if (n == 0)
			return 0;
		if (n == 1)
			return 1;
		if (memo[n] > 0)
			return memo[n];
		if (n % 2 == 0)
			return helper(n / 2, memo);

		return helper(n / 2, memo) + 1;

	}


	public static void main(String[] args) {
		int n = 5;
		int[] ans = _countBits(n);
		for (int i = 0; i < ans.length; i++) {
			System.out.println("ans[" + i + "]=" + ans[i]);
		}
	}
}
