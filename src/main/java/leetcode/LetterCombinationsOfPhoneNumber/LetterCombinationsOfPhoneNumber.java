package leetcode.LetterCombinationsOfPhoneNumber;

import java.util.ArrayList;
import java.util.Hashtable;
import java.util.List;

public class LetterCombinationsOfPhoneNumber {

	private static Hashtable<Integer, String[]> ht;
	private static List<String> letters;

	public static List<String> letterCombinations(String digits) {

		letters = new ArrayList<String>();
		if (digits.length() == 0)
			return letters;

		ht = new Hashtable<>();

		ht.put(2, new String[] { "a", "b", "c" });
		ht.put(3, new String[] { "d", "e", "f" });
		ht.put(4, new String[] { "g", "h", "i" });
		ht.put(5, new String[] { "j", "k", "l" });
		ht.put(6, new String[] { "m", "n", "o" });
		ht.put(7, new String[] { "p", "q", "r", "s" });
		ht.put(8, new String[] { "t", "u", "v" });
		ht.put(9, new String[] { "w", "x", "y", "z" });

		helper(digits, 0, "");

		return letters;
	}

	public static void helper(String digits, int index, String tmp) {

		if (tmp.length() == digits.length()) {
			letters.add(tmp);
			return;
		}

		int val = Integer.parseInt(String.valueOf(digits.charAt(index)));
		String[] s = ht.get(val);
		for (int i = 0; i < s.length; i++) {
			tmp = tmp + s[i];
			helper(digits, index + 1, tmp);
			tmp = tmp.substring(0, tmp.length() - 1);
		}
	}

	public static void main(String[] args) {
		String digits = "237";
		List<String> res = letterCombinations(digits);
		System.out.println(res.toString());

	}
}
