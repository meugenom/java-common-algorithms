package leetcode.Array.PlusOne;

import java.util.Arrays;

/***
 * easy 66
 * 
 * You are given a large integer represented as an integer array digits, where
 * each digits[i] is the ith digit of the integer. The digits are ordered from
 * most significant to least significant in left-to-right order. The large
 * integer does not contain any leading 0's.
 * Increment the large integer by one and return the resulting array of digits.
 * 
 * Example 1:
 * Input: digits = [1,2,3]
 * Output: [1,2,4]
 * Explanation: The array represents the integer 123.
 * Incrementing by one gives 123 + 1 = 124.
 * Thus, the result should be [1,2,4].
 * 
 * Example 2:
 * Input: digits = [4,3,2,1]
 * Output: [4,3,2,2]
 * Explanation: The array represents the integer 4321.
 * Incrementing by one gives 4321 + 1 = 4322.
 * Thus, the result should be [4,3,2,2].
 * 
 * Example 3:
 * Input: digits = [9]
 * Output: [1,0]
 * Explanation: The array represents the integer 9.
 * Incrementing by one gives 9 + 1 = 10.
 * Thus, the result should be [1,0].
 * 
 * T.C.: O(n^2)
 * S.C.: O(n)
 */

public class PlusOne {

	public static int[] plusOne(int[] digits) {

		int n = 1;
		int index = digits.length - 1;
		return helper(digits, n, index);

	}

	public static int[] helper(int[] digits, int n, int index) {
		if ((digits[index] + n) < 10) {
			digits[index] = digits[index] + n;
			return digits;
		} else {

			if (index == 0) {
				int[] tmp = new int[digits.length + 1];
				int j = 0;
				for (int i = 1; i < tmp.length; i++) {
					tmp[i] = digits[j];
					j++;
				}
				digits = tmp;
				index++;
			}
			int newN = (digits[index] + n) / 10;
			digits[index] = (digits[index] + n) % 10;
			index--;
			return helper(digits, newN, index);
		}
	}

	public static void main(String[] args) {
		// int[] digits = new int[] { 1, 2, 3 };
		int[] digits = new int[] { 9, 9, 9 };
		int[] res = plusOne(digits);
		System.out.println(Arrays.toString(res));
	}
}
