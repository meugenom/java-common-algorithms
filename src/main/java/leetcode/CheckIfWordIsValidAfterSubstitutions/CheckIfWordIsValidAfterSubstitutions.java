package leetcode.CheckIfWordIsValidAfterSubstitutions;

import java.util.Stack;

public class CheckIfWordIsValidAfterSubstitutions {

	//optimal solving
	public static boolean isValid(String s) {
		Stack<Character> stack = new Stack<>();
		char[] arr = s.toCharArray();
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] == 'c') {
				if (stack.size() >= 2 && stack.pop() == 'b' && stack.pop() == 'a') {
					// all ok
				} else {
					return false;
				}
			} else {
				stack.push(arr[i]);
			}
		}
		return stack.size() == 0;
	}

	//timelimit error
	public static boolean _isValid(String s) {

		if (s.length() % 3 != 0)
			return false;

		return helper("", s);
	}

	public static boolean helper(String left, String right) {

		if (right.length() == 0 && left.length() == 0) {
			return true;
		}

		if (right.length() == 3 && !right.equals("abc")) {
			return false;
		}

		String currentInterval = right.substring(0, 3);
		if (currentInterval.equals("abc")) {
			right = right.substring(3, right.length());
			right = left + right;
			left = "";
			return helper(left, right);
		} else {
			left = left + right.substring(0, 1);
			right = right.substring(1, right.length());
			return helper(left, right);
		}
	}

	public static void main(String[] args) {
		String s = "abcabcababcc";
		System.out.println(isValid(s));
	}
}
