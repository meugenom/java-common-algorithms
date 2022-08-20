package leetcode.ClimbingStairs;

public class ClimbingStairs {

	public static int climbStairs(int n) {

		int[] dp = new int[n + 1];
		return helper(n, dp);
	}

	public static int helper(int n, int[] dp) {

		if(n == 1) return 1;
		if(n == 2) return 2;
		
		if(dp[n]!=0) return dp[n];
		
		int s1 = helper(n - 1,dp);
    	int s2 = helper(n - 2,dp);
    
    	dp[n] = s1 + s2;

    	return dp[n];
	}

	public static void main(String[] args) {
		//int n = 3; //out 3
		//int n = 2; //out 2
		int n = 4; //out 5
		System.out.println(climbStairs(n));
	}
}
