package leetcode.IsSubsequence;

/***
 * Given two strings s and t, return true if s is a subsequence of t, or false
 * otherwise.
 * A subsequence of a string is a new string that is formed from the original
 * string by deleting some (can be none)
 * of the characters without disturbing the relative positions of the remaining
 * characters.
 * (i.e., "ace" is a subsequence of "abcde" while "aec" is not).
 * 
 * Example 1:
 * Input: s = "abc", t = "ahbgdc"
 * Output: true
 * 
 * 
 * Example 2:
 * Input: s = "axc", t = "ahbgdc"
 * Output: false
 * 
 * T.C - O(N)
 * S.C - O(N) [iterative solution]
 */

public class IsSubsequence {

	public static boolean isSubsequence(String s, String t) {

		int j = 0;
		String res = "";

		// base case
		if (s.length() == 0)
			return true;

		for (int i = 0; i < t.length(); i++) {
			if (s.charAt(j) == t.charAt(i)) {
				res = res + t.charAt(i);
				j++;
				if (j >= s.length()) {
					break;
				}
			}
		}

		return res.equals(s) ? true : false;
	}

	public static void main(String[] args) {
		String s = "b";
		String t = "ahbgdc";
		System.out.println(isSubsequence(s, t));
	}
}
