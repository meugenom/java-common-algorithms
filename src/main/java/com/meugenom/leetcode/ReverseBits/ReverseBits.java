package com.meugenom.leetcode.ReverseBits;


public class ReverseBits {
	

	public static int reverseBits(int n) {

		int reversed = 0;
        
        for (int i=0; i<32; i++) {

            reversed <<= 1; //shift left by 1 bit
			//System.out.println("left shift : " + Integer.toBinaryString(reversed));	
            
			reversed |= (n & 1);
			//System.out.println("if odd then reverse : " + Integer.toBinaryString(reversed));
            
			n >>= 1; 
			//System.out.println("right shift : " + Integer.toBinaryString(reversed));	

        }
        
        return reversed;

    }


	public static void main(String[] args) {
		
		String binaryString = "00000010100101000001111010011100";
		int n = Integer.parseInt(binaryString, 2);
		System.out.println(n);
		System.out.println(reverseBits(n));

		/*
		int value = 0000110;
		System.out.println(value + " : " + Integer.toBinaryString(value));
    	value <<= 1;
		System.out.println(Integer.toBinaryString(value) + " : " + value);
		value |= (value & 1);
		System.out.println(Integer.toBinaryString(value) + " : " + value);
		value >>= 1;
		System.out.println(Integer.toBinaryString(value) + " : " + value);
		*/
	}
}
