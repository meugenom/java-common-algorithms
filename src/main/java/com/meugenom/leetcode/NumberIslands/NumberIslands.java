package com.meugenom.leetcode.NumberIslands;

public class NumberIslands {

	private static int islands;
	private static int[][] visited;

	public static int numIslands(char[][] grid) {
		islands = 0;
		int rows = grid.length, column = grid[0].length;
		visited = new int[rows][column];

		for (int i = 0; i < grid.length; i++) {
			for (int j = 0; j < grid[0].length; j++) {

				if (grid[i][j] == '1' && visited[i][j] != 1) {
					islands++;
					System.out.println("next island entrypoint: " + i + "," + j);
					helper(grid, i, j);

				}

			}
		}
		return islands;
	}

	public static void helper(char[][] grid, int i, int j) {

		// boundaries of matrix
		int rows = grid.length, column = grid[0].length;
		if (i < 0 || i >= rows || j < 0 || j >= column) {
			return;
		}

		// make visited
		visited[i][j] = 1;

		if (grid[i][j] == '0') {

			return;
		}

		System.out.println("visited: " + i + "," + j);

		// up
		if (i > 0 && visited[i - 1][j] == 0) {
			helper(grid, i - 1, j);
		}

		// down
		if (i < rows - 1 && visited[i + 1][j] == 0) {
			helper(grid, i + 1, j);
		}

		// right
		if (j < column - 1 && visited[i][j + 1] == 0) {
			helper(grid, i, j + 1);
		}

		// left
		if (j > 0 && visited[i][j - 1] == 0) {
			helper(grid, i, j - 1);
		}
	}

	public static void main(String[] args) {
		char[][] grid = new char[][] {
				{ '1', '1', '1', '1', '0' },
				{ '1', '1', '0', '1', '0' },
				{ '1', '1', '0', '0', '0' },
				{ '0', '0', '0', '0', '0' } };

		System.out.println("found islands = " + numIslands(grid));

		grid = new char[][] {
				{ '1', '1', '0', '0', '0' },
				{ '1', '1', '0', '0', '0' },
				{ '0', '0', '1', '0', '0' },
				{ '0', '0', '0', '1', '1' } };

		System.out.println("found islands = " + numIslands(grid));

		grid = new char[][] { { '1' },
				{ '1' } };
		System.out.println("found islands = " + numIslands(grid));

		grid = new char[][] {
				{ '1', '1', '1' },
				{ '0', '1', '0' },
				{ '1', '1', '1' }
		};
		System.out.println("found islands = " + numIslands(grid));
	}
}
