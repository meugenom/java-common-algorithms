package com.meugenom.leetcode.LongestPalindromicSubstring;

public class LongestPalindromicSubstring {

	public static String longestPalindrome(String s) {

		String[] palindroms = new String[s.length()];
		int length = s.length();
		int step = 0;


		while(step < length){
			System.out.println(s.charAt(step));
			step++;
		}



        return "";
    }

	public static void main(String[] args){
		String s = "cvbabvadavnfj";
        System.out.println(longestPalindrome(s));
    }
}
