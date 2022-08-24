package leetcode.Math.CheckIfNumberOfSumOfPowersOfThree;

/***
 * 1780 medium
 * 
 * Given an integer n, return true if it is possible to represent n as the sum
 * of distinct powers of three. Otherwise, return false.
 * An integer y is a power of three if there exists an integer x such that y ==
 * 3x.
 * 
 * Example 1:
 * Input: n = 12
 * Output: true
 * Explanation: 12 = 31 + 32
 * 
 * Example 2:
 * Input: n = 91
 * Output: true
 * Explanation: 91 = 30 + 32 + 34
 * 
 * Example 3:
 * Input: n = 21
 * Output: false
 * 
 * T.C.: O(log(N));
 * S.C.: O(1).
 */

public class CheckIfNumberOfSumOfPowersOfThree {
	public static boolean checkPowersOfThree(int n) {
		while (n > 0) {
			if (n % 3 != 2) {
				n /= 3;
			} else {
				return false;
			}
		}
		return true;
	}

	public static void main(String[] args) {
		int n = 12;
		System.out.println(checkPowersOfThree(n)); // true
	}

}
