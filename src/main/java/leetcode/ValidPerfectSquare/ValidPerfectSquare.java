package leetcode.ValidPerfectSquare;

/***
 * Given a positive integer num,
 * write a function which returns True if num is a perfect square else False.
 * Follow up: Do not use any built-in library function such as sqrt.
 * 
 * Example 1:
 * Input: num = 16
 * Output: true
 * 
 * 
 * Example 2:
 * Input: num = 14
 * Output: false
 */

public class ValidPerfectSquare {

	public static boolean isPerfectSquare(int num) {

		if(num == 1) return true;

		long l = 1; //! important (long) because in test was used large numbers
		long r = num/2;

		while (l <= r) {
			long mid = (l + r) / 2;
			if (mid * mid == num)
				return true;
			if (mid * mid < num) {
				l = mid + 1;
			} else {
				r = mid - 1;
			}
		}
		return false;
	}

	public static void main(String[] args) {
		//int num = 2000105819;
		 int num = 808201;
		System.out.println(isPerfectSquare(num));
	}

}
