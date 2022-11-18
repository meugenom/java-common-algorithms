package leetcode.Math.UglyNumber;

//num 263 easy

// An ugly number is a positive integer whose prime factors are limited to 2, 3, and 5.
// Given an integer n, return true if n is an ugly number.

// Example 1:
// Input: n = 6
// Output: true
// Explanation: 6 = 2 × 3

// Example 2:
// Input: n = 1
// Output: true
// Explanation: 1 has no prime factors, therefore all of its prime factors are limited to 2, 3, and 5.

// Example 3:
// Input: n = 14
// Output: false
// Explanation: 14 is not ugly since it includes the prime factor 7.

//Time complexity: O(log(N)).
//Space complexity: O(1).

public class UglyNumber {

	public static boolean isUgly(int n) {

		// private case
		if (n <= 0) {
			return false;
		}

		// Factorize by dividing with permitted factors
		for (int factor : new int[] { 2, 3, 5 }) {
			n = keepDividingWhenDivisible(n, factor);
		}

		// Check if the integer is reduced to 1 or not.
		return n == 1;
	}

	// Keep dividing dividend by divisor when division is possible.
	private static int keepDividingWhenDivisible(int dividend, int divisor) {
		while (dividend % divisor == 0) {
			dividend /= divisor;
		}
		return dividend;
	}

	public static void main(String[] args) {
		int n = 50;
		System.out.println(isUgly(n));
	}

}
