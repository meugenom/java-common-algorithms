package com.meugenom.leetcode.SingleNumber;

public class SingleNumber {

    public static int singleNumber(int[] nums) {
		
		int result = 0;
		
		for(int i = 0; i < nums.length; i++) {
			result ^= nums[i];
		}
		
		return result;
	} 


    public static void main(String[] args) {

/*

0 1 0 --> -1
1 0 0 --> -2
1 0 1 -- > 6
1 0 0 --> -2
0 1 0 --> -1
-----


// 0 XOR (^) 010
0 0 0
0 1 0
-----
0 1 0

//0 1 0 XOR (^) 1 0 0
0 1 0 
1 0 0
-----
1 1 0

//1 1 0 XOR (^) 1 0 1

1 1 0
1 0 1
-----
0 1 1

//0 1 1 XOR (^) 1 0 0

0 1 1 
1 0 0 
-----
1 1 1

//1 1 1 XOR (^) 0 1 0

1 1 1
0 1 0
- - - 
1 0 1 
*/
		
	int[] arr = {-1,-2,6,-2,-1};
	System.out.println(singleNumber(arr));

	}
}