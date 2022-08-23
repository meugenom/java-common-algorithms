package leetcode.Backtracking.GenerateParentheses;

/***
 * medium 22
 * 
 * Given n pairs of parentheses, write a function to generate all combinations of well-formed parentheses.
 * 
 * Example 1:
 * Input: n = 3
 * Output: ["((()))","(()())","(())()","()(())","()()()"]
 * 
 * 
 * Example 2:
 * Input: n = 1
 * Output: ["()"]
 * 
 * 
 * T.C.: O(n^2);
 * S.C.: O(n).
 */

import java.util.ArrayList;
import java.util.List;

public class GenerateParentheses {

	private static List<String> res;

	public static List<String> generateParenthesis(int n) {

		res = new ArrayList<>();
		String str = "";
		int open = 0;
		int close = 0;
		backtrack(str, open, close, n);
		return res;
	}

	public static void backtrack(String str, int open, int close, int n) {

		if (str.length() == 2 * n) {

			res.add(str);
			return;
		}

		if (open < n) {
			backtrack(str + "(", open + 1, close, n);
		}

		if (close < open) {
			backtrack(str + ")", open, close + 1, n);
		}
	}

	public static void main(String[] args) {
		int n = 4;
		System.out.println(generateParenthesis(n).toString());
	}

}
