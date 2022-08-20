package leetcode.NumberOfOneBits;

public class NumberOfOneBits {
	
	public static int hammingWeight(int n) {
		
		int count = 0;
		return helper(n, count);
    }

	public static int helper(int n, int count){
		
		if(n == 1) return count + 1;
		if(n == 0) return count;
	
		n = n & (n-1);	
		return helper(n, count + 1);

	}

	public static void main(String[] args) {
		//int n = 00000000000000000000000001;
		int n = 0000000000000000000000110001;
		System.out.println(hammingWeight(n));
	}
}
