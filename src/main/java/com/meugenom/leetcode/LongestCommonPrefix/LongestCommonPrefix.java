package com.meugenom.leetcode.LongestCommonPrefix;

public class LongestCommonPrefix {

	/*
	 * This solution is for all matches in the words but let's know 
	 * how to find matches not only from the start position of the examined word. 
	 * The real solution was simple. And let's see how to find pairs only from the start position of the word. 
	 * I keep the first decision and make other more simple then the first. See below...
	 * 
	 */
	public String _longestCommonPrefix(String[] strs) {

		// private cases
		if (strs.length == 0)
			return "";
		if (strs.length == 1)
			return strs[0].replace(" ", "");

		// find min word in the array
		int min = strs[0].length();
		String minWord = strs[0];
		int minIndex = 0;

		for (int i = 0; i < strs.length; i++) {
			if (min > strs[i].length()) {
				min = strs[i].length();
				minWord = strs[i];
				minIndex = i;
			}
		}
		// find all matches in words
		String[] ans = new String[strs.length - 1];
		int k = 0;
		for (int j = 0; j < strs.length; j++) {
			if (minIndex != j) {
				int left = 0;
				int right = left + 1;
				String result = "";
				result = helper(minWord, left, right, strs[j], result);
				ans[k] = result;
				k++;
			}
		}

		// find min match or if result was "" return 0 matches
		String minMatch = ans[0];
		for (int c = 1; c < ans.length; c++) {

			if (minMatch.length() == 0) {
				return "";
			}

			if (ans[c].length() < minMatch.length()) {
				minMatch = ans[c];
			}
		}

		return minMatch;
	}

	public String helper(String minWord, int left, int right, String currentWord, String result) {
		if (right > minWord.length())
			return result;

		if (currentWord.contains(minWord.substring(left, right))) {
			result = minWord.substring(left, right);
		}

		return helper(minWord, left, right + 1, currentWord, result);

	}

	/*
	 * It's a new solution and more simple then the first.
	 */
	public String longestCommonPrefix(String[] strs) {
		if (strs.length == 0)
			return "";

		String prefix = strs[0];

		for (int i = 1; i < strs.length; i++) {
			while (strs[i].indexOf(prefix) != 0) {

				prefix = prefix.substring(0, prefix.length() - 1);

				if (prefix.isEmpty())
					return "";
			}
		}

		return prefix;
	}

	public static void main(String[] args) {

		//first solution
		String[] strs = new String[] { "test", "apesttestor", "jsdhsdtes", "dlajdte", "jkshskjtefsdf" };
		LongestCommonPrefix l = new LongestCommonPrefix();
		System.out.println("out is: " + l._longestCommonPrefix(strs));//out "ts"
		
		// the real solution return null string because code calculates all words from the start position.
		//so in this case we have no matches
		System.out.println("out is: " + l.longestCommonPrefix(strs));//out ""
	}
}
