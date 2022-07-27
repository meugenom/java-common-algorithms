package com.meugenom.leetcode.UniquePathsII;

public class UniquePathsII {
	
	public static int uniquePathsWithObstacles(int[][] obstacleGrid) {
		
		//make new matrix dp to calculations
		int[][] dp = new int[obstacleGrid.length][obstacleGrid[0].length];

		//fill in the dp value 1 to the first column and first row
		//if we have obstacle so change with cell to 0 
		//first column
		for (int i = 0; i < dp.length; i++) {
			if(obstacleGrid[i][0]== 1){
				dp[i][0] = 0; //because no ways after obstacle
				break;
			}else{
				dp[i][0] = 1;
			}
		}
		//first row
		for (int j = 0; j < dp[0].length; j++) {
			if(obstacleGrid[0][j]== 1){
				dp[0][j] = 0;
				break; //no ways after obstacle
			}else{
				dp[0][j] = 1;
			}
		}

		//traverse by cells as in the Pascal's triangle
		for (int i = 1; i < dp.length; i++) {
			for (int j = 1; j < dp[i].length; j++) {
				dp[i][j] =  obstacleGrid[i][j] == 1 ? 0 : dp[i - 1][j] + dp[i][j - 1];
			}
		}
		
		return dp[dp.length - 1][dp[0].length - 1];
    }

	public static void main(String[] args) {
		//int[][] obstacleGrid = new int[][]{ {0,0,0},{0,1,0}, {0,0,0} }; //out 2
		//int[][] obstacleGrid = new int[][]{ {1,0}}; //out 0
		int[][] obstacleGrid = new int[][]{ {0,0},{1,1}, {0,0} }; //out 0 no ways
		System.out.println(uniquePathsWithObstacles(obstacleGrid)); 

	}
}
