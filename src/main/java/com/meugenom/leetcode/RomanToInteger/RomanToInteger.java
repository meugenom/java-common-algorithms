package com.meugenom.leetcode.RomanToInteger;

public class RomanToInteger {

    String[][] hash = new String[][]{{"1","I"},{"5","V"},{"10","X"},{"50","L"},{"100","C"},{"500","D"},{"1000","M"}};
    String[][] fixes = new String[][]{{"-2","IV"},{"-2","IX"},{"-20","XL"},{"-20","XC"},{"-200","CD"},{"-200", "CM"}};

    public int romanToInt(String s) {

        int length = s.length();
        Integer sum = 0;

        for(int i = length - 1 ; i >= 0 ; i--) {
            String symbol = String.valueOf(s.charAt(i));
            int j = 0;
            while( j < hash.length) {
                if(hash[j][1].equals(symbol)){
                    sum = sum + Integer.parseInt(hash[j][0]);
                }
                j++;
            }
        }

        //fixing the Sum
        for(int a = 0; a < fixes.length; a++) {
            if(s.contains(fixes[a][1])) {
                sum = sum + Integer.parseInt(fixes[a][0]);
            }
        }
        return sum;
    }

    public static void main(String[] args) {

        RomanToInteger r = new RomanToInteger();
        String s = "";
        System.out.println(r.romanToInt(s));
    }
}
