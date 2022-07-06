package com.meugenom.leetcode.PermutationInString;

import java.util.Arrays;

public class PermutationInString {

	//old solution but doesn't optimal (timeout)
	/*
	public static boolean checkInclusion(String s1, String s2) {

		int length = s2.length();

		int left = 0;
		int right = length - 1;

		//private case
        if(length == 1 && s1.length() == 1){
            return s1.equals(s2) ? true : false;
			
        }

		//private case
		if(s1.length() > s2.length()) return false;
		
		//find values have the first digit in the substring and put +all digits to the tmp array
		while(left < length){

			//System.out.println("left index = " + left);
			//System.out.println("right index = " + right);
			
			if(String.valueOf(s2.charAt(left)).equals(String.valueOf(s1.charAt(0)))){
				if(left +  s1.length() <= length){

					//System.out.println("left index = " + left);
					if(checkInterval(left, s1 , s2)){
						return true;
					}

				}
			}

			if(String.valueOf(s2.charAt(right)).equals(String.valueOf(s1.charAt(0)))){
				if( right < length && right >= s1.length() - 1){
					
					//System.out.println("right index = " + right);
					if(checkInterval(right, s1 , s2)){
						return true;
					}
				}
			}

			left++;
			right--;
		}
		

		return false;
    }

	public static boolean checkInterval(int index, String s1, String s2){

		//sorting s1 too
		String s1_sorted = String.valueOf(sort(s1.toCharArray()));
		

		int step = 0;
		
		int left = index;
		
		int right = index + s1.length() - 1;
		
		while(step < s2.length()){
			
			if(right < s2.length() && left >= 0){

				//System.out.println("substring : " + s2.substring(left, right + 1));

				char[] tmp = s2.substring(left, right + 1).toCharArray();
				tmp = sort(tmp);
				
				//System.out.println( "sorted : " + String.valueOf(tmp));

				if(String.valueOf(tmp).equals(s1_sorted)){
					
					return true;

				}
			}

			left--;
			right--;

			step++;

		}

		return false;
	}

	public static char[] sort(char[] arr) {

        char temp;

        for(int i = 0; i < arr.length; i++) {
            for(int j = 0; j < arr.length; j++){
                if(arr[j] > arr[i]) {
                    temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }
        return arr;
    }
	*/

	//new optimal solution 
	public static boolean checkInclusion(String s1, String s2) {
        
		int l1 = s1.length();
        int l2 = s2.length();

        //private case
        if (l1 > l2) return false;

        //private case
        if (l1 == 0) return true;

        /*
         * create frequency array for string s1 and s2;
         * */
        int[] s1CharArray = new int[26];
        int[] s2CharArray = new int[26];


        //Update frequency for our case
        for (int i = 0; i < l1; i++) {
            s1CharArray[s1.charAt(i) - 'a']++;
            s2CharArray[s2.charAt(i) - 'a']++;
        }

		//System.out.println(Arrays.toString(s1CharArray));
		//System.out.println(Arrays.toString(s2CharArray));

        //private case when frequency is equal
		//if l1 == l2 && l1 != 0 && l2 != 0
        if (Arrays.equals(s1CharArray, s2CharArray)) return true;



		// Frequency were not equal, meaning the strings s1 and window of s2(0,s1.len) were not anagrams
        // Time to update the window and slide the window to the right.

        int left = 0;
        int right = l1;

        while (right < l2) {

            // Remove the first char frequency from s2CharArray.
            // Include the new char at s1 len position.
             
            s2CharArray[s2.charAt(left) - 'a']--;
            s2CharArray[s2.charAt(right) - 'a']++;

            
            // Check if the frequency arrays are equal. If yes return true.
            //else increment the window till windowEnd < s2 len
            
            if (Arrays.equals(s1CharArray, s2CharArray)) return true;

            left++;
            right++;

        }

        return false;
    }

	public static void main(String[] args) {
		
		//String s1 = "ab", s2 = "eidbaooo"; //true
		//String s1 = "adc", s2 = "ddca"; //true
		//String s1 = "hello", s2 = "ooolleooooleh"; //false
		//String s1 = "abc", s2 = "ccccbbbbaaaa"; //false
		//String s1 = "ab", s2 = "ab"; //true
		//String s1 = "ab", s2 = "ba"; //true
		//String s1 = "a", s2 = "ba"; //true
		//String s1 = "park", s2 = "spike"; //false
		//String s1 = "rvwrk", s2 = "lznomzggwrvrkxecjaq"; //true
		//String s1 = "ky", s2 = "ainwkckifykxlribaypk"; //true
		String s1 = "enz", s2 = "emhqwznesno"; //true
		System.out.println(checkInclusion(s1, s2));
	}


}

