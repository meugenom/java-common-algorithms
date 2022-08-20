
package leetcode.FirstUniqueCharacterInAString;

public class FirstUniqueCharacterInAString {

	public static int firstUniqChar(String s) {
		int[] sCharArray = new int[26];
		// save index of last repeated symbol, if it was once then saves first index in
		// the string
		int[] lastIndex = new int[26];
		// find repeating of symbols
		for (int i = 0; i < s.length(); i++) {
			sCharArray[s.charAt(i) - 'a']++;
			lastIndex[s.charAt(i) - 'a'] = i;
		}
		int j = 0;
		int res = -1;
		while (j < sCharArray.length) {
			// find all elements what equals 1 ... was once in the string
			if (sCharArray[j] == 1) {
				// show what is in the lastIndex
				if (res == -1) {
					res = lastIndex[j];
				} else {
					if (res > lastIndex[j])
						res = lastIndex[j];
				}
			}
			j++;
		}

		return res;
	}

	public static void main(String[] args) {
		String s = "loveleetcode";
		System.out.println(firstUniqChar(s));
	}
}
