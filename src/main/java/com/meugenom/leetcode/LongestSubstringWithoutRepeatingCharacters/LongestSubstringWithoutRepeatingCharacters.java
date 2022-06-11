package com.meugenom.leetcode.LongestSubstringWithoutRepeatingCharacters;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Iterator;

public class LongestSubstringWithoutRepeatingCharacters {

    public int lengthOfLongestSubstring(String s) {

        Deque<String> symbols = new ArrayDeque<String>();
        int maxLength = 0;

        for(int i = 0; i < s.length(); i++){
            String symbol = String.valueOf(s.charAt(i));

                if(symbols.contains(symbol)){
                    maxLength = (maxLength < symbols.size())?symbols.size():maxLength;

                    Iterator<String> iteratorVals = symbols.iterator();

                    while (iteratorVals.hasNext()) {

                    if(symbols.getFirst().equals(symbol)) {
                        symbols.pop();
                        break;
                    }else{
                        symbols.pop();
                    }
                }

                //add last symbol
                symbols.add(symbol);
            } else {
                symbols.add(symbol);
                maxLength = (maxLength < symbols.size())?symbols.size():maxLength;
            }
        }
        return maxLength;
    }

    public static void main(String[] args){

        LongestSubstringWithoutRepeatingCharacters l1 = new LongestSubstringWithoutRepeatingCharacters();
        String s1 = "pwwkew";
        System.out.println(l1.lengthOfLongestSubstring(s1));

        LongestSubstringWithoutRepeatingCharacters l2 = new LongestSubstringWithoutRepeatingCharacters();        
        String s2 = "abcabcbb";
        System.out.println(l2.lengthOfLongestSubstring(s2));
    }
}
