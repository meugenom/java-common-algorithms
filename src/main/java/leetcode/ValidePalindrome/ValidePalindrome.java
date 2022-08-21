package leetcode.ValidePalindrome;

/***
 * 
 * easy 125
 * 
 * A phrase is a palindrome if, after converting all uppercase letters into
 * lowercase letters and removing all
 * non-alphanumeric characters, it reads the same forward and backward.
 * Alphanumeric characters include letters and numbers.
 * Given a string s, return true if it is a palindrome, or false otherwise.
 * 
 * Example 1:
 * Input: s = "A man, a plan, a canal: Panama"
 * Output: true
 * Explanation: "amanaplanacanalpanama" is a palindrome.
 * 
 * 
 * Example 2:
 * Input: s = "race a car"
 * Output: false
 * Explanation: "raceacar" is not a palindrome.
 * 
 * 
 * Example 3:
 * Input: s = " "
 * Output: true
 * Explanation: s is an empty string "" after removing non-alphanumeric
 * characters.
 * Since an empty string reads the same forward and backward, it is a
 * palindrome.
 * 
 * T.C. - O(n);
 * S.C. - O(1);
 */

public class ValidePalindrome {

	public static boolean isPalindrome(String s) {

		// base case
		if (s == " ")
			return true;
		// is Time Comlpexity O(n)
		s = s.replaceAll("[^A-Za-z0-9]", "").toLowerCase();

		int left = 0;
		int right = s.length() - 1;

		while (left < right) {

			if (s.charAt(left) != s.charAt(right))
				return false;

			left++;
			right--;
		}

		return true;
	}

	public static void main(String[] args) {
		// String s = "A man, a plan, a canal: Panama";
		String s = "race a car";
		System.out.println(isPalindrome(s));
	}
}
