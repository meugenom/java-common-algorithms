package leetcode.ValidAnagram;

import java.util.Arrays;

/***
 * Given two strings s and t, return true if t is an anagram of s, and false
 * otherwise.
 * An Anagram is a word or phrase formed by rearranging the letters of a
 * different word or phrase,
 * typically using all the original letters exactly once.
 * 
 * Example 1:
 * Input: s = "anagram", t = "nagaram"
 * Output: true
 * 
 * 
 * Example 2:
 * Input: s = "rat", t = "car"
 * Output: false
 * 
 * 
 * Time Complexity  - O(N)
 * Space Complexity - O(2N) [we created 2 arrays]
 * 
 */

public class ValidAnagram {

	public static boolean isAnagram(String s, String t) {

		// base case
		if (s.length() != t.length())
			return false;

		int[] sCharArray = new int[26];
		int[] tCharArray = new int[26];

		for (int i = 0; i < t.length(); i++) {

			sCharArray[s.charAt(i) - 'a']++;
			tCharArray[t.charAt(i) - 'a']++;

		}

		if (Arrays.equals(sCharArray, tCharArray))
			return true;

		return false;
	}

	public static void main(String[] args) {
		String s = "anagram";
		String t = "nagaram";

		System.out.println(isAnagram(s, t));

	}
}
