package com.meugenom.leetcodeContest;

public class GreatestEnglishLetter {
	
	public static String greatestLetter(String s) {
        
		int length = s.length();
        int step = 0;
		String lastLetter_unificated = "";
		String lastLetter = "";
        
		while(step < length){

			if(lastLetter_unificated.equals(String.valueOf(s.charAt(step)).toLowerCase())){
				if(!lastLetter.equals(String.valueOf(s.charAt(step)))){
					return lastLetter_unificated.toUpperCase();
				}
			}
			//save last letter
			lastLetter_unificated = String.valueOf(s.charAt(step)).toLowerCase();
			lastLetter = String.valueOf(s.charAt(step));

			step++;
		}

		return "";
    }

	public static void main(String[] args){
        
		String s = "lEceTcOdE";
		System.out.println(greatestLetter(s));
		
    }


}
