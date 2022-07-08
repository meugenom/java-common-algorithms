package com.meugenom.leetcode.LetterCombinationsOfPhoneNumber;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Hashtable;
import java.util.List;
import java.util.Map;




public class LetterCombinationsOfPhoneNumber {
	
	private static Hashtable<String, String[]> ht = new Hashtable<>();
	
	public static List<String> letterCombinations(String digits) {

		ht.put("2", new String[]{"a", "b", "c"});
		ht.put("3", new String[]{"d", "e", "f"});
		ht.put("4", new String[]{"g", "h", "i"});
		ht.put("5", new String[]{"j", "k", "l"});
		ht.put("6", new String[]{"m", "n", "o"});
		ht.put("7", new String[]{"p", "q", "r"});
		ht.put("8", new String[]{"t", "u", "v"});
		ht.put("9", new String[]{"w", "x", "y", "z"});
        
		List<String> letters = new ArrayList<String>();
		//String result = "";
		
		//int step = 0;
		//while(step < digits.length()){
			
			//System.out.println(ht.get(String.valueOf(digits.charAt(step)))[0]);
			//letters


		//	step++;
		//}

		return letters;
    }

	public static List<String> helper(List<String> result, String digits, int index){


		String[] current = ht.get(digits.charAt(index));

		int step = 0;
		while(step < current.length){
			//result = 
			step++;
		}

		return result;
	}


	public static void main(String[] args) {
		String digits = "23";
		List<String> res = letterCombinations(digits);
		System.out.println(res.toString());

	}
}
