package leetcode.Triangle;

import java.util.ArrayList;
import java.util.List;

public class Triangle {
	
	public static int minimumTotal(List<List<Integer>> triangle) {
		int n = triangle.size(); 
		
		//make massive
    	int[][] dp = new int[n][n];
		
		//equal every value of massive to -1;
    	for (int i=0;i<n;i++) {
        	for(int j=0;j<n;j++) {
            	dp[i][j] = -1;
        	}
    	}
    
	// start recursive function
    int result = f(0,0, n, triangle, dp);

    return result;
    }

	public static int f(int i,int j,int n,List<List<Integer>> triangle,int[][] dp){
    	
		//exit when we will done
		if (i == n - 1) {
        	return triangle.get(i).get(j) ;
    	}
    
    	if (dp[i][j] != -1) return dp[i][j];
    
    	int bottom = triangle.get(i).get(j) + f (i + 1, j, n, triangle, dp);
    	int diag = triangle.get(i).get(j) + f(i + 1, j + 1, n, triangle, dp);
    
    	return dp[i][j] = Math.min(bottom,diag);
}

	
	public static void main(String[] args) {
		// //Input: triangle = [[2],[3,4],[6,5,7],[4,1,8,3]]
		List a = new ArrayList<Integer>();
		List b = new ArrayList<Integer>();
		List c = new ArrayList<Integer>();
		List d = new ArrayList<Integer>();
		
		a.add(2);
		
		b.add(3); 
		b.add(4);

		c.add(6);
		c.add(5);
		c.add(7);
		
		d.add(4);
		d.add(1);
		d.add(8);
		d.add(3);

		List<List<Integer>> triangle = new ArrayList<List<Integer>>();
		
		triangle.add(a);
		triangle.add(b);
		triangle.add(c);
		triangle.add(d);
		
		
		//System.out.println(minimumTotal(triangle));
		//Output: 11

		// //Input: triangle = [[-1],[2,3],[1,-1,-3]]
		List a1 = new ArrayList<Integer>();
		List b1 = new ArrayList<Integer>();
		List c1 = new ArrayList<Integer>();
		
		a1.add(-1);
		
		b1.add(2); 
		b1.add(3);

		c1.add(1);
		c1.add(-1);
		c1.add(-3);

		List<List<Integer>> triangle1 = new ArrayList<List<Integer>>();

		triangle1.add(a1);
		triangle1.add(b1);
		triangle1.add(c1);

		System.out.println(minimumTotal(triangle1));

	}	
}
