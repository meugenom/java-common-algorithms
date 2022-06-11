package com.meugenom.leetcode.JewelsAndStones;

public class JewelsAndStones {

    public int numJewelsInStones(String jewels, String stones) {

        int jewelsLength = jewels.length();
        int stonesLength = stones.length();
        int count = 0;

        for(int i = 0; i < jewelsLength; i++) {
            for(int j = 0; j < stonesLength; j++) {
                if( (String.valueOf(stones.charAt(j))).equals(String.valueOf(jewels.charAt(i)))){
                    count++;
                }
            }
        }
        return count;
    }

    public static void main(String[] args){

        JewelsAndStones t = new JewelsAndStones();
        String j = "aA";
        String s = "aAAbbbb";
        System.out.println(t.numJewelsInStones( j, s));
    }
}
