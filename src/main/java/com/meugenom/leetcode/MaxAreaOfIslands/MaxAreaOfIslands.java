package com.meugenom.leetcode.MaxAreaOfIslands;

//import java.util.ArrayList;

//old solution with nodes
/* 
class Node {

	public int m;
	public int n;
	public boolean seen;
	public Node down;
	public Node left;
	public Node up;
	public Node right;

	public Node(int m, int n, boolean seen) {
		this.m = m;
		this.n = n;
		this.seen = seen;
		this.down = null;
		this.left = null;
		this.up = null;
		this.right = null;
	}

	@Override
	public String toString() {
		return String.format("[m:%s, n:%s, %s,  down:%s, left:%s, up:%s, right:%s]",
				m,
				n,
				seen,
				down == null ? "null" : down.toString(),
				left == null ? "null" : left.toString(),
				up == null ? "null" : up.toString(),
				right == null ? "null" : right.toString());
	}
}
*/

public class MaxAreaOfIslands {

	/*
	 * private static ArrayList<Node> nodes = new ArrayList<Node>();
	 * 
	 * public static int maxAreaOfIsland(int[][] grid) {
	 * 
	 * int m = 0;
	 * while (m < grid.length) {
	 * 
	 * int n = 0;
	 * while (n < grid[m].length) {
	 * 
	 * // System.out.println("value = " + grid[m][n]);
	 * 
	 * if (grid[m][n] == 1) {
	 * 
	 * Node node = new Node(m, n, false);
	 * nodes.add(node);
	 * }
	 * n++;
	 * }
	 * m++;
	 * }
	 * 
	 * int count = 0;
	 * int s = 0;
	 * // see nodes and set relations with neighbors
	 * while (s < nodes.size()) {
	 * 
	 * // System.out.println(node.toString());
	 * 
	 * // find neighbors
	 * int c = findNeighbors(nodes.get(s), 0);
	 * if (c > count) {
	 * count = c;
	 * }
	 * 
	 * s++;
	 * }
	 * ;
	 * 
	 * return count;
	 * }
	 * 
	 * public static int findNeighbors(Node root, int count) {
	 * 
	 * root.seen = true; // root seen
	 * 
	 * // System.out.println(root.toString());
	 * 
	 * int step = 0;
	 * 
	 * while (step < nodes.size()) {
	 * 
	 * Node node = nodes.get(step);
	 * 
	 * if (node.seen == false) {
	 * 
	 * // System.out.println(root.toString());
	 * 
	 * // UP/DOWN
	 * if (root.n == node.n) {
	 * if (root.m + 1 == node.m) {
	 * System.out.println("up");
	 * node.seen = true;
	 * // nodes.set(step, node);
	 * return findNeighbors(node, count + 1);
	 * }
	 * 
	 * if (root.m - 1 == node.m) {
	 * System.out.println("down");
	 * node.seen = true;
	 * // nodes.set(step, node);
	 * return findNeighbors(node, count + 1);
	 * }
	 * }
	 * 
	 * // LEFT/RIGHT
	 * if (root.m == node.m) {
	 * if (root.n + 1 == node.n) {
	 * System.out.println("right");
	 * node.seen = true;
	 * // nodes.set(step, node);
	 * return findNeighbors(node, count + 1);
	 * }
	 * 
	 * if (root.n - 1 == node.n) {
	 * System.out.println("left");
	 * node.seen = true;
	 * // nodes.set(step, node);
	 * return findNeighbors(node, count + 1);
	 * }
	 * }
	 * 
	 * }
	 * step++;
	 * }
	 * ;
	 * 
	 * return count;
	 * }
	 */
	// other solution with dfs method
	public static int maxAreaOfIsland(int[][] grid) {

		if (grid == null || grid.length == 0)
			return 0;
		int m = grid.length;
		int n = grid[0].length;
		boolean[][] seen = new boolean[m][n];

		int maxArea = 0;
		int curArea = 0;

		int i = 0;
		while (i < m) {

			int j = 0;
			while (j < n) {

				if (seen[i][j] == false) {
					curArea = dfs(grid, i, j, seen);
					maxArea = Math.max(maxArea, curArea);
				}

				j++;
			}

			i++;
		}
		return maxArea;
	}

	public static int dfs(int[][] grid, int i, int j, boolean[][] seen) {

		if (i < 0
				|| j < 0
				|| i >= grid.length
				|| j >= grid[0].length
				|| seen[i][j] == true
				|| grid[i][j] == 0) {
			return 0;
		}

		seen[i][j] = true;

		return 1 + dfs(grid, i - 1, j, seen)
				+ dfs(grid, i, j + 1, seen)
				+ dfs(grid, i, j - 1, seen)
				+ dfs(grid, i + 1, j, seen);
	}

	public static void main(String[] args) {
		int[][] grid = new int[][] {
				{ 0, 0, 1, 0, 0, 0, 0, 1, 0, 0, 0, 0, 0 },
				{ 0, 0, 0, 0, 0, 0, 0, 1, 1, 1, 0, 0, 0 },
				{ 0, 1, 1, 0, 1, 0, 0, 0, 0, 0, 0, 0, 0 },
				{ 0, 1, 0, 0, 1, 1, 0, 0, 1, 0, 1, 0, 0 },
				{ 0, 1, 0, 0, 1, 1, 0, 0, 1, 1, 1, 0, 0 },
				{ 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1, 0, 0 },
				{ 0, 0, 0, 0, 0, 0, 0, 1, 1, 1, 0, 0, 0 },
				{ 0, 0, 0, 0, 0, 0, 0, 1, 1, 0, 0, 0, 0 }
		};
		System.out.println(maxAreaOfIsland(grid)); // result 6
	}

}
