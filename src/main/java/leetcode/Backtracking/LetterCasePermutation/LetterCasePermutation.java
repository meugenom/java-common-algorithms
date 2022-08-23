package leetcode.Backtracking.LetterCasePermutation;

/***
 * medium 784
 * 
 * Given a string s, you can transform every letter individually to be lowercase or uppercase to create another string.
 * Return a list of all possible strings we could create. Return the output in any order.
 * 
 * 
 * Example 1:
 * Input: s = "a1b2"
 * Output: ["a1b2","a1B2","A1b2","A1B2"]
 * 
 * 
 * Example 2:
 * Input: s = "3z4"
 * Output: ["3z4","3Z4"]
 * 
 * T.C.: O(n^2);
 * S.C.: O(n).
 */

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class LetterCasePermutation {

	public static List<String> letterCasePermutation(String s) {

		List<String> res = new ArrayList<>();
		Set<String> result = new HashSet<String>();

		String track = "";

		backtrack(s, track, 0, result);

		result.stream().forEachOrdered(value -> {
			res.add(value);
		});

		return res;
	}

	public static void backtrack(String s, String track, int index, Set<String> result) {

		if (s.length() == track.length()) {
			result.add(track);
		}

		for (int i = index; i < s.length(); i++) {

			if (Character.isLetter(s.charAt(i))) {

				String trackLowerCase = track + String.valueOf(s.charAt(i)).toLowerCase();
				backtrack(s, trackLowerCase, i + 1, result);

				String trackUpperCase = track + String.valueOf(s.charAt(i)).toUpperCase();
				backtrack(s, trackUpperCase, i + 1, result);

			} else {
				track = track + String.valueOf(s.charAt(i));
				backtrack(s, track, i + 1, result);
				track = track.substring(track.length() - 1, track.length());

			}
		}

	}

	public static void main(String[] args) {
		// String s = "3Z4"; //output: [3z4, 3Z4]
		String s = "a1b2"; // output: [a1b2, a1B2, A1b2, A1B2]
		System.out.println(letterCasePermutation(s));
	}
}
