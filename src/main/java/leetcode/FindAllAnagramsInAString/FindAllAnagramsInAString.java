package leetcode.FindAllAnagramsInAString;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class FindAllAnagramsInAString {

	public static List<Integer> findAnagrams(String s, String p) {

		List<Integer> result = new ArrayList<>();

		// private case
		if (s.length() < p.length())
			return result;

		char[] sArr = s.toCharArray();
		char[] pArr = p.toCharArray();
		
		// initiate two arrays with dimension 26, as number of letters in the alphabet
		int[] count1 = new int[26];
		int[] count2 = new int[26];

		/*
		 * populate this arrays
		 * if (pArr[i] - 'a') == letter "a" then value is 1 and saves in the pArr[0] - place for letter A
		 * if (pArr[i] - 'a') == letter "b" then value is 1 and saves in the pArr[1] - place for letter B
		 * if (pArr[i] - 'a') == letter "c" then value is 1 and saves in the pArr[2] - place for letter C
		 * 
		 * !!! if was added again letter a, then value in pArr[0] will be 2!
		 */
		for (int i = 0; i < pArr.length; i++) {
			count1[pArr[i] - 'a']++; // is the same count1[pArr[i] - 'a'] = count1[pArr[i] - 'a'] + 1;
			count2[sArr[i] - 'a']++;

		}

		/*	if sArr = [a,b,c] and pArr = [c,b,a] then count1 and count2 are equal
		 * count1 is [ 1, 1, 1, 0, 0, 0, .....0]
		 * count2 is [ 1, 1, 1, 0, 0, 0, .....0]
		 *  count1 is the same count2 ....so see below
		 */
		
		//we compare count1 and count2 with method Arrays.equals(arr1, arr2)
		//and if returned 'true' then will add index to the result list
		for (int i = 0; i < sArr.length - pArr.length + 1; i++) {
			if (Arrays.equals(count1, count2))
				result.add(i);

			if (i == sArr.length - pArr.length)
				break;

			//moving by s string with adding 1 to left and right indexes
			count2[s.charAt(i) - 'a']--;	
			count2[s.charAt(i + p.length()) - 'a']++;

		}

		return result;
	}

	public static void main(String[] args) {
		String s = "cbaebabacd";
		String p = "abc";
		// String s = "abab";
		// String p = "ab";
		System.out.println(findAnagrams(s, p));
	}
}
