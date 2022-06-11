package com.meugenom.leetcode.LongestCommonPrefix;

import java.util.ArrayList;
import java.util.List;

public class LongestCommonPrefix {

    public String longestCommonPrefix(String[] strs) {

        String out = "";
        String cash = "";
        String firstWord = strs[0];
        int firstWordLength = strs[0].length();
        List<String> tmp = new ArrayList<String>();

        for(int i = 1; i < firstWordLength; i++) {
            for(int j = 1; j < strs.length; j++) {

                //System.out.println(strs[j]);

                if(String.valueOf(strs[j].charAt(i)) == String.valueOf(firstWord.charAt(i))) {

                    String firstWordSymbols = String.valueOf(firstWord.charAt(i));

                    if(String.valueOf(strs[j].charAt(i)) == firstWordSymbols
                        && cash == "" ) {

                        //add first symbol to the out;
                        cash = firstWordSymbols;
                    } else {
                        if(strs[j].contains(firstWordSymbols)
                            && (cash + firstWordSymbols).contains(strs[j])) {
                            cash = cash + firstWordSymbols;
                        } else {
                            //put those words to the temp array
                            tmp.add(cash);
                            cash = "";
                        }
                    }
                }
            }
        }
        //System.out.println(tmp.toString());
        return out;
    }

    public static void main(String[] args){

        String[] strs = new String[]{"test","apesttestor"};
        LongestCommonPrefix l = new LongestCommonPrefix();
        System.out.println(l.longestCommonPrefix(strs));
    }
}
