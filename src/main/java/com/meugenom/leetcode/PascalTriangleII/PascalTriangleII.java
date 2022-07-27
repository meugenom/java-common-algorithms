package com.meugenom.leetcode.PascalTriangleII;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class PascalTriangleII {

	public static List<Integer> getRow(int rowIndex) {

		// temporary array
		int[][] arr = new int[rowIndex + 1][rowIndex + 1];

		// prepare matrix
		// insert into column 0 all values equal 1;
		for (int i = 0; i < arr.length; i++) {
			arr[i][0] = 1;
		}

		// insert into row 0 all values equal 1
		for (int j = 0; j < arr[0].length; j++) {
			arr[0][j] = 1;
		}

		// sum cells by pascal's triangle
		int length = arr.length; // we have quadrat matrix
		for (int i = 0; i < length; i++) {
			for (int j = 0; j < length; j++) {
				if (arr[i][j] != 1 && i < length - j) {
					arr[i][j] = arr[i - 1][j] + arr[i][j - 1];
					// System.out.println("arr["+i+"]["+j+"] = "+arr[i][j]);
				}
			}
		}

		// prepare result
		int i;
		i = length - 1;
		List<Integer> res = new ArrayList<Integer>();

		// start from right top position in the matrix
		int j = 0;
		while (i >= 0) {
			if (arr[i][j] != 0) {
				res.add(arr[i][j]);
			}
			i--;
			j++;
		}

		// print this row
		System.out.println(Arrays.toString(res.toArray()));

		return res;

	}

	public static void main(String[] args) {
		int rowIndex = 3;
		getRow(rowIndex); // out [1,3,3,1]

	}

}
