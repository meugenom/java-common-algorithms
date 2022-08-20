package leetcode.IsAnagram;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class IsAnagram {

	public static boolean isAnagram(String s, String t) {

		// private case
		if (s.length() != t.length())
			return false;

		// initiate new lists
		List<Character> l1 = new ArrayList<Character>();
		List<Character> l2 = new ArrayList<Character>();

		// populate lists from s and t
		for (int i = 0; i < s.length(); i++) {
			l1.add(s.charAt(i));
			l2.add(t.charAt(i));
		}

		// sorting lists
		Collections.sort(l1);
		Collections.sort(l2);

		// compare lists
		for (int i = 0; i < l1.size(); i++) {
			if (l1.get(i) != l2.get(i)) {
				return false;
			}
		}

		return true;
	}

	public static void main(String[] args) {
		String s = "rat";
		String t = "tar";
		System.out.println(isAnagram(s, t));
	}

}
