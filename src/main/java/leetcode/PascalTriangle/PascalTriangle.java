package leetcode.PascalTriangle;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class PascalTriangle {
	
	public static List<List<Integer>> generate(int numRows) {
		
		//initiate and populate list and temporary array
        List<List<Integer>> triangle = new ArrayList<List<Integer>>();
		for (int i = 0; i < numRows; i++) {
			triangle.add(new ArrayList<Integer>());
		}
		int[][] arr = new int[numRows][numRows];
		
		//prepare matrix
		//insert into column 0 all values equal 1;
		for (int i = 0; i < arr.length; i++) {
			arr[i][0] = 1;
		}

		//insert into row 0 all values equal 1
		for (int j = 0; j < arr[0].length; j++) {
			arr[0][j] = 1;
		}

		
		//sum cells by pascal's triangle
		int length = arr.length; //we have quadrat matrix
		for (int i = 0; i < length; i++) {
			for (int j = 0; j < length; j++) {
				if( arr[i][j] != 1 && i < length - j){
					arr[i][j] = arr[i - 1][j] + arr[i][j-1];
					//System.out.println("arr["+i+"]["+j+"] = "+arr[i][j]);
				}
			}
		}

		//prepare returned triangle
		int i;
		int k = arr.length - 1;
		while(k >= 0){ //need to know real length of teh array
			
			i = length - 1;
			List<Integer> row  = triangle.get(k);
			//start from right top position in the matrix
			
			int j = 0;

			while(i >= 0){
				if(arr[i][j] != 0){
					row.add(arr[i][j]);
				}
				i--;
				j++;
			}
			//print this row
			System.out.println(Arrays.toString(row.toArray()));

			k--;
			length--;
		}

		return triangle;
    }

	
	public static void main(String[] args) {
		int numRows = 5;
		generate(numRows);
	}
}
