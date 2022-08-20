package leetcode.RottingOranges;

import java.util.LinkedList;
import java.util.Queue;

class Pair {
	int row;
	int column;

	public Pair(int row, int column) {
		this.row = row;
		this.column = column;
	}
}

public class RottingOranges {

	public static int[][] directions = { { 1, 0 }, { 0, 1 }, { -1, 0 }, { 0, -1 } };

	public static int orangesRotting(int[][] grid) {

		Queue<Pair> q = new LinkedList<>();

		int n = grid.length;
		int m = grid[0].length;
		int fresh = 0;

		//find rotten orange and quantity of the fresh oranges
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < m; j++) {
				if (grid[i][j] == 2) {
					q.add(new Pair(i, j));

				} else if (grid[i][j] == 1) {
					fresh++;// count number of fresh 🍊
				}
			}
		}

		//System.out.println(q.size());
		//System.out.println("fresh : " + fresh);

		//private case when we haven't fresh oranges return 0;
		if (fresh == 0) {
			return 0;
		}

		int level = -1;// level represent time at the beginning the time before started we put all
						// rotten oranges in the Queue
		
		// now each time goes they rot all their 4 adjacent and gonna put them in Queue
		int spoil = 0;
		
		while (q.size() > 0) {
			
			int size = q.size();
		
			while (size-- > 0) {
		
				Pair p = q.poll();
			
				for (int i = 0; i < 4; i++) {
					
					int nr = p.row + directions[i][0];
					int nc = p.column + directions[i][1];

					if (nr >= 0 && nc >= 0 && nr < n && nc < m && grid[nr][nc] == 1) {
					
						spoil++;
						grid[nr][nc] = 2;
						q.add(new Pair(nr, nc));

					}
				}
			}

			level++;
		}
		
		if (fresh == spoil) {// if number af spoiled oranges is equal to the total number of fresh oranges
								// --> we have rot all oranges then
			return level;
		} else {
			return -1;
		}
	}

	public static void main(String[] args) {
		int[][] grid = new int[][] { { 2, 1, 1 }, { 1, 1, 0 }, { 0, 1, 1 } };
		System.out.println(orangesRotting(grid));
	}

}
