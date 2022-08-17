package com.meugenom.leetcode.StudentAttendanceRecordI;

/***
 * You are given a string s representing an attendance record for a student
 * where each character signifies whether the student was absent,
 * late, or present on that day.
 * The record only contains the following three characters:
 * 'A': Absent.
 * L': Late.
 * 'P': Present.
 * The student is eligible for an attendance award if they meet both of the
 * following criteria:
 * 
 * The student was absent ('A') for strictly fewer than 2 days total.
 * The student was never late ('L') for 3 or more consecutive days.
 * Return true if the student is eligible for an attendance award, or false
 * otherwise.
 * 
 * 
 * Example 1:
 * Input: s = "PPALLP"
 * Output: true
 * Explanation: The student has fewer than 2 absences and was never late 3 or
 * more consecutive days.
 * 
 * 
 * Example 2:
 * Input: s = "PPALLL"
 * Output: false
 * Explanation: The student was late 3 consecutive days in the last 3 days, so
 * is not eligible for the award.
 */

public class StudentAttendanceRecordI {

	private static boolean checkRecord(String s) {

		int lCount = 0;
		int aCount = 0;

		for (int i = 0; i < s.length(); i++) {
			if (s.charAt(i) == 'L') {
				lCount++;
				if (lCount > 2)
					return false;
			} else {
				lCount = 0;
			}

			if (s.charAt(i) == 'A') {
				aCount++;
				if (aCount == 2)
					return false;
			}
		}
		return true;
	}

	public static void main(String[] args) {
		String s = "PPALLP";
		System.out.println(checkRecord(s));
	}
}
