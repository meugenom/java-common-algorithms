package leetcode.NullOneMatrix;

import java.util.LinkedList;
import java.util.Queue;

class Pair {
	int row;
	int column;

	public Pair(int row, int column) {
		this.row = row;
		this.column = column;
	}

	@Override
	public String toString() {
		return "row= " + this.row + "  col = " + this.column;
	}
}

public class NullOneMatrix {

	public static int[][] directions = { { 1, 0 }, { 0, 1 }, { -1, 0 }, { 0, -1 } };

	public static int[][] updateMatrix(int[][] mat) {

		Queue<Pair> q = new LinkedList<>();

		int n = mat.length;
		int m = mat[0].length;

		for (int i = 0; i < n; i++) {
			for (int j = 0; j < m; j++) {
				if (mat[i][j] == 0) {
					q.add(new Pair(i, j));

				} else {
					mat[i][j] = -1;
				}
			}
		}

		// System.out.println(q.size());

		while (q.size() > 0) {

			Pair p = q.poll();

			for (int i = 0; i < 4; i++) {

				int nr = p.row + directions[i][0];
				int nc = p.column + directions[i][1];

				// System.out.println("p:" + p.row + " c:" + p.column + " nr: " + nr + " nc:" +
				// nc);

				if (nr >= 0 && nc >= 0 && nr < n && nc < m && mat[nr][nc] < 0) {

					q.add(new Pair(nr, nc));
					mat[nr][nc] = mat[p.row][p.column] + 1;

				}
			}
		}
		/*
		 * for (int i = 0; i < mat.length; i++) {
		 * for (int k = 0; k < mat[i].length; k++) {
		 * System.out.println("[" + i + "][" + k + "]=" + mat[i][k]);
		 * }
		 * }
		 */

		return mat;
	}

	public static void main(String[] args) {

		int[][] mat = new int[][] { { 0, 0, 0 }, { 0, 1, 0 }, { 1, 1, 1 } };
		System.out.println(updateMatrix(mat)); // out : [[0,0,0],[0,1,0],[1,2,1]]
	}
}
