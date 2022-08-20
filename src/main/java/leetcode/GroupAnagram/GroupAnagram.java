package leetcode.GroupAnagram;

import java.util.ArrayList;
import java.util.Arrays;

/***
 * 
 * medium 49
 * 
 * Given an array of strings strs, group the anagrams together. 
 * You can return the answer in any order.
 * An Anagram is a word or phrase formed by rearranging the letters of a different word or phrase, 
 * typically using all the original letters exactly once.
 * 
 * Example 1:
 * Input: strs = ["eat","tea","tan","ate","nat","bat"]
 * Output: [["bat"],["nat","tan"],["ate","eat","tea"]]
 * 
 * 
 * Example 2:
 * Input: strs = [""]
 * Output: [[""]]
 * 
 * Example 3:
 * Input: strs = ["a"]
 * Output: [["a"]]
 * 
 * Time Complexity -  O(n)
 * Space Complexity - O(n) 
 */

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class GroupAnagram {

	public static List<List<String>> groupAnagrams(String[] strs) {

		Map<String, List<String>> hm = new HashMap<>();

		for (String s : strs) {

			char[] chars = s.toCharArray();

			Arrays.sort(chars);
			String key = String.valueOf(chars);

			if (!hm.containsKey(key)) {
				hm.put(key, new ArrayList<>());
			}
			hm.get(key).add(s);

		}

		return new ArrayList<>(hm.values());
	}

	public static void main(String[] args) {

		String[] strs = new String[] { "eat", "tea", "tan", "ate", "nat", "bat" };
		// String[] strs = new String[]{"rer","s"};
		// String[] strs = new String[]{"a"};
		// String[] strs = new String[]{""};
		System.out.println(groupAnagrams(strs));

	}
}
