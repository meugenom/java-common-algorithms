package leetcode.Array.DeleteColumnsToMakeSorted;

/**
 * 944 easy "Delete Columns To Make Sorted"
 * You are given an array of n strings strs, all of the same length.
 * The strings can be arranged such that there is one on each line, making a
 * grid. For example, strs = ["abc", "bce", "cae"] can be arranged as:
 * abc
 * bce
 * cae
 * You want to delete the columns that are not sorted lexicographically. In the
 * above example (0-indexed), columns 0 ('a', 'b', 'c') and 2 ('c', 'e', 'e')
 * are sorted while column 1 ('b', 'c', 'a') is not, so you would delete column
 * 1.
 * 
 * Return the number of columns that you will delete.
 * 
 * Example 1:
 * Input: strs = ["cba","daf","ghi"]
 * Output: 1
 * Explanation: The grid looks as follows:
 * cba
 * daf
 * ghi
 * Columns 0 and 2 are sorted, but column 1 is not, so you only need to delete 1
 * column.
 * 
 * Example 2:
 * Input: strs = ["a","b"]
 * Output: 0
 * Explanation: The grid looks as follows:
 * a
 * b
 * Column 0 is the only column and is sorted, so you will not delete any
 * columns.
 * 
 * Example 3:
 * Input: strs = ["zyx","wvu","tsr"]
 * Output: 3
 * Explanation: The grid looks as follows:
 * zyx
 * wvu
 * tsr
 * All 3 columns are not sorted, so you will delete all 3.
 * T.C.: O(n^2);
 * S.C.: O(n).
 */

public class DeleteColumnsToMakeSorted {

	public int minDeletionSize(String[] strs) {

		// private case id strs is empty
		if (strs == null || strs.length == 0)
			return 0;

		// if strs is not empty declare deletions equals 0
		int deletions = 0;

		// loop by columns
		for (int column = 0; column < strs[0].length(); column++) {

			char character = strs[0].charAt(column);
			// loop by words
			for (int word = 0; word < strs.length; word++) {

				if (strs[word].charAt(column) < character) {
					deletions++;
					break;
				}

				character = strs[word].charAt(column);

			}
		}

		return deletions;
	}
}
