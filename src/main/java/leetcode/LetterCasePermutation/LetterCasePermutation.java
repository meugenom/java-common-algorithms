package leetcode.LetterCasePermutation;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/*
 * related topics
 * - string
 * - backtracking
 * - bit manipulation
 */

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
