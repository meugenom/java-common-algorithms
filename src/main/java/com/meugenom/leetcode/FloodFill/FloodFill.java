package com.meugenom.leetcode.FloodFill;

public class FloodFill {

	public static int[][] floodFill(int[][] image, int sr, int sc, int color) {
		dfs(image, sr, sc, color, image[sr][sc]);
		return image;
	}

	public static void dfs(int[][] image, int i, int j, int color, int redPixel) {
		image[i][j] = color;
		int n = image.length;
		int m = image[0].length;

		// Left
		if (j - 1 >= 0 && image[i][j - 1] != color && image[i][j - 1] == redPixel) {
			dfs(image, i, j - 1, color, redPixel);
		}

		// Top
		if (i - 1 >= 0 && image[i - 1][j] != color && image[i - 1][j] == redPixel) {
			dfs(image, i - 1, j, color, redPixel);
		}

		// Right
		if (j + 1 < m && image[i][j + 1] != color && image[i][j + 1] == redPixel) {
			dfs(image, i, j + 1, color, redPixel);
		}

		// Bottom
		if (i + 1 < n && image[i + 1][j] != color && image[i + 1][j] == redPixel) {
			dfs(image, i + 1, j, color, redPixel);
		}

	}

	public static void main(String[] args) {
		int[][] image = new int[][] { { 1, 1, 1 },
				{ 1, 1, 0 },
				{ 1, 0, 1 } };
		int sr = 1;
		int sc = 1;
		int color = 2;
		int[][] res = floodFill(image, sr, sc, color); // Output: [[2,2,2],[2,2,0],[2,0,1]]
		for (int row = 0; row < res.length; row++) {
			System.out.print("[");

			for (int col = 0; col < res[row].length; col++) {

				System.out.print(" " + image[row][col]);

			}
			System.out.print("],");
			System.out.println("");
		}
	}
}
