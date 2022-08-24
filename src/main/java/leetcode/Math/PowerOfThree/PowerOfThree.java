package leetcode.Math.PowerOfThree;

/***
 * easy 326
 * 
 * Given an integer n, return true if it is a power of three. Otherwise, return
 * false.
 * An integer n is a power of three, if there exists an integer x such that n ==
 * 3x.
 * 
 * Example 1:
 * Input: n = 27
 * Output: true
 * 
 * Example 2:
 * Input: n = 0
 * Output: false
 * 
 * Example 3:
 * Input: n = 9
 * Output: true
 * 
 * T.C.: O(n^2);
 * S.C.: O(1);
 */

public class PowerOfThree {

	public boolean isPowerOfThree(int n) {

		int i = 0;
		return helper(n, i);
	}

	public boolean helper(int n, int i) {

		if (Math.pow(3, i) == n)
			return true;

		if (Math.pow(3, i) > n)
			return false;

		// System.out.println(i);
		i++;
		return helper(n, i);
	}
}
