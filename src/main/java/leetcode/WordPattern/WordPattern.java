package leetcode.WordPattern;

import java.util.HashMap;

//290 easy

//Given a pattern and a string s, find if s follows the same pattern.
//Here follow means a full match, 
//such that there is a bijection between a letter in pattern and a non-empty word in s.

//Example 1:
//Input: pattern = "abba", s = "dog cat cat dog"
//Output: true

//Example 2:
//Input: pattern = "abba", s = "dog cat cat fish"
//Output: false

//Example 3:
//Input: pattern = "aaaa", s = "dog cat cat dog"
//Output: false

public class WordPattern {
	public boolean wordPattern(String pattern, String s) {
		// put s to the array
		String[] arr = s.split(" ");

		// private case
		if (pattern.length() != arr.length)
			return false;

		// declare hashMap
		HashMap<Character, String> map = new HashMap<>();

		// Loop by pattern
		for (int i = 0; i < pattern.length(); i++) {

			// find contains key
			char ch = pattern.charAt(i);
			boolean containsKey = map.containsKey(ch);

			if (map.containsValue(arr[i]) && !containsKey)
				return false;

			if (containsKey && !map.get(ch).equals(arr[i]))
				return false;
			else
				map.put(ch, arr[i]);
		}

		return true;
	}
}
