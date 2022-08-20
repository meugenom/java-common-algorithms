package leetcode.UniquePaths;

public class UniquePaths {
	
	public static int uniquePaths(int m, int n) {
		//initiate matrix and fill 1 in the first row and first column
		int[][] arr = new int[m][n];
		for (int i = 0; i < m; i++) {
			arr[i][0] = 1;
		}

		for (int j = 0; j < n; j++) {
			arr[0][j] = 1;
		}

		//make sum as possible in the Pascal's triangle 
		for (int i = 1; i < m; i++) {
			for (int j = 1; j < n; j++) {
				arr[i][j] = arr[i - 1][j] + arr[i][j - 1];
			}
		}
		
		return arr[m - 1][n - 1];
    }

	
	//recursive method for smallest n and m
	private static int paths(int m, int n){
		
		if(m < 1 || n < 1) return 0;
		if(m == 1 && n == 1) return 1;

		return paths(m, n - 1) + paths(m - 1, n);
	}


	public static void main(String[] args) {
		int m = 3;
		int n = 7;
		System.out.println("number of possible unique paths is " + uniquePaths(m, n)); //out 28
	}
}
