package com.meugenom.leetcode.PalindromeNumber;

/*
 * 	Given an integer x, return true if x is palindrome integer.
 *	An integer is a palindrome when it reads the same backward as forward.
 *	For example, 121 is a palindrome while 123 is not.
 */

public class PalindromeNumber {

	// new version

	public boolean isPalindrome(int x) {

		if (x < 0)
			return false;

		int newNumber = 0;
		int origin = x;

		while (x != 0) {
			int lastDigit = x % 10;
			newNumber = newNumber * 10 + lastDigit;
			x = x / 10;
		}

		return newNumber == origin;
	}

	public static void main(String[] args) {

		PalindromeNumber r = new PalindromeNumber();
		int x = 121;

		System.out.println(r.isPalindrome(x));
	}
}
