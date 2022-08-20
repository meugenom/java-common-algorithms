package leetcode.InterleavingString;

public class InterleavingString {

	private static Boolean[][] dp;

	public static boolean isInterleave(String s1, String s2, String s3) {

		// initiate new array with boolean values
		dp = new Boolean[s1.length() + 1][s2.length() + 1];
		return helper(s1, s2, s3, 0, 0);
	}

	public static boolean helper(String s1, String s2, String s3, int i, int j) {

		if (i == s1.length() && j == s2.length() && i + j == s3.length())
			return true;

		if (dp[i][j] != null)
			return dp[i][j];

		boolean flag1 = false;
		boolean flag2 = false;

		if (i < s1.length() && i + j < s3.length() && s1.charAt(i) == s3.charAt(i + j)) {

			flag1 = helper(s1, s2, s3, i + 1, j);
			dp[i][j] = flag1;

			if (flag1) {
				return true;
			}
		}

		if (j < s2.length() && i + j < s3.length() && s2.charAt(j) == s3.charAt(i + j)) {

			flag2 = helper(s1, s2, s3, i, j + 1);
			dp[i][j] = flag2;

			if (flag2) {
				return true;
			}
		}

		dp[i][j] = false;

		return dp[i][j];
	}

	public static void main(String[] args) {
		String s1 = "aabcc", s2 = "dbbca", s3 = "aadbbbaccc"; // in out: false
		System.out.println(isInterleave(s1, s2, s3));
	}
}
