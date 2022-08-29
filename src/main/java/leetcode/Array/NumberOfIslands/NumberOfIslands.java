package leetcode.Array.NumberOfIslands;

/***
 * 200 medium
 * Given an m x n 2D binary grid grid which represents a map of '1's (land) and
 * '0's (water),
 * return the number of islands.
 * An island is surrounded by water and is formed by connecting adjacent
 * lands horizontally or vertically. You may assume all four edges of the grid
 * are all surrounded by water.
 * 
 * Example 1:
 * Input: grid = [["1","1","1","1","0"],
 * ["1","1","0","1","0"],
 * ["1","1","0","0","0"],
 * ["0","0","0","0","0"]]
 * Output: 1
 * 
 * Example 2:
 * Input: grid = [["1","1","0","0","0"],
 * ["1","1","0","0","0"],
 * ["0","0","1","0","0"],
 * ["0","0","0","1","1"]]
 * Output: 3
 * 
 * 
 */

public class NumberOfIslands {

	public static int numIslands(char[][] grid) {
		int[][] visited = new int[grid.length][grid[0].length];
		int count = 0;
		for (int i = 0; i < grid.length; i++) {
			for (int j = 0; j < grid[i].length; j++) {
				if (grid[i][j] == '1' && visited[i][j] == 0) {
					helper(i, j, visited, grid);
					count++;
				}
			}
		}
		return count;
	}

	static void helper(int i, int j, int[][] visited, char[][] grid) {

		if (grid[i][j] == '0') {
			visited[i][j] = 1;
			return;
		}

		visited[i][j] = 1;

		// up
		if (i > 0 && grid[i - 1][j] != '0' && visited[i - 1][j] != 1) {
			helper(i - 1, j, visited, grid);
		}
		// down
		if (i < grid.length - 1 && grid[i + 1][j] != '0' && visited[i + 1][j] != 1) {
			helper(i + 1, j, visited, grid);
		}

		// left
		if (j > 0 && grid[i][j - 1] != '0' && visited[i][j - 1] != 1) {
			helper(i, j - 1, visited, grid);
		}

		// right
		if (j < grid[0].length - 1 && grid[i][j + 1] != '0' && visited[i][j + 1] != 1) {
			helper(i, j + 1, visited, grid);
		}

	}

	public static void main(String[] args) {

		char[][] grid = new char[][] {
				{ '1', '1', '1', '1', '0' },
				{ '1', '1', '0', '1', '0' },
				{ '1', '1', '0', '0', '0' },
				{ '0', '0', '0', '0', '0' } };
		/*
		 * char[][] grid = new char[][] {
		 * { '1', '1', '0', '0', '0' },
		 * { '1', '1', '0', '0', '0' },
		 * { '0', '0', '1', '0', '0' },
		 * { '0', '0', '0', '1', '1' } };
		 */
		System.out.println(numIslands(grid));
	}
}
