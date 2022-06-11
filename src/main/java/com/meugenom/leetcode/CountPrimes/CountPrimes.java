package com.meugenom.leetcode.CountPrimes;

import java.util.ArrayList;

//17 / 66 test cases passed.
// easy

public class CountPrimes {

    ArrayList<Integer> arr = new ArrayList<Integer>();

    public int countPrimes(int n) {

        if(n <= 2)
            return 0;
        
        //autofill all numbers
        for(int i = 2; i < n; i ++) {

            boolean res = true;

            if((i % 2) == 0 && i != 2)
                res = false;

            if((i % 3) == 0  && i!= 3)
                res = false;

            if((i % 5) == 0 && i!= 5)
                res = false;

            if(res){
                this.arr.add(i);
            }
        }

        System.out.println(arr.toString());
        return arr.size();
    }

    public static void main(String[] args){
        CountPrimes c = new CountPrimes();
        //int n = 499979;
        int n = 5;
        System.out.println(c.countPrimes(n));
    }
    
}

// 1  2   2  4  6    6   6   
//2..3..5..7..11..17..23..29..31..
//eratosphenes algorithm
        /*
        int i = 5;      
        int length = arr.size();  
        while(i < length){
            for(int j = 0; j < length; j++){
                if((arr.get(i) % arr.get(j)) == 0 && arr.get(i) != arr.get(j)){
                    arr.remove(j);
                    length = arr.size();
                }
            }
            i++;
        }
        */

