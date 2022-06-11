package com.meugenom.leetcode.ReverseInteger;

public class ReverseInteger {

    public int reverse(int x) {

        String res = "";
        String sign = "";

        if (x < -2147483647 || x > 2147483647) {
            return 0;
        } else {
            if(x == 0)
                return 0;
            if(x < 0) {
                x = Math.abs(x);
                sign = "-";
            }
        
            while (x > 0) {
                res = res + String.valueOf(x % 10);
                x = x / 10;
            }

            try
            {
                return Integer.parseInt(sign + res);
            }
                catch(Exception e)
            {
                return 0;
            }
        }
    }

    public static void main(String[] args) {

        ReverseInteger r = new ReverseInteger();        
        int calculated = -1234567;
        System.out.println("reversed number = " + r.reverse(calculated));
    }
}
