package com.meugenom.leetcode.FibonacciNumber;

public class  FibonacciNumber {
	
	public static int fib(int n) {
        //private case
        if(n == 0) return 0;
        if(n == 1) return 1;
        
        return helper(n);
    }
    
    public static int helper(int n){
		
		int last = 0;
		
		int step = 1;
		int current = step;
		
		while(step < n){

			int tmp = last;
			last = current;
			current = tmp + current;
			
			step++;

		}

		return current;
    }

	public static void main(String[] args) {
		int n = 6;
		System.out.println(fib(n)); //8
		//numbers Fibonacci
		//0,1,1,2,3,5,8,13......
	}

}
