package com.meugenom.leetcode.WordSearch;

public class WordSearch {

	static boolean visited[][];

	public static boolean exist(char[][] board, String word) {

		visited = new boolean[board.length][board[0].length];

		// entrypoint
		for (int i = 0; i < board.length; i++) {
			for (int j = 0; j < board[0].length; j++) {
				if (board[i][j] == word.charAt(0)) {

					// entrypoint founded
					if (helper(i, j, 0, word, board)) {

						return true;

					}

				}
			}
		}

		return false;
	}

	public static boolean helper(int i, int j, int idx, String word, char[][] board) {

		if (idx == word.length() - 1) {

			return true;
			
		} else {

			// mark current
			visited[i][j] = true;
			boolean check = false;

			// up
			if (i > 0 && visited[i - 1][j] == false && board[i - 1][j] == word.charAt(idx+1)) {
				check = helper(i - 1, j, idx + 1, word, board);
			}

			// down
			if (check == false && i < board.length - 1 && visited[i + 1][j] == false && board[i + 1][j] == word.charAt(idx+1)) {
				check = helper(i + 1, j, idx + 1, word, board);
			}

			// left
			if (check == false && j > 0 && visited[i][j - 1] == false && board[i][j - 1] == word.charAt(idx+1)) {
				check = helper(i, j - 1, idx + 1, word, board);
			}

			// right
			if (check == false && j < board[0].length - 1 && visited[i][j + 1] == false && board[i][j + 1] == word.charAt(idx+1)) {
				check = helper(i, j + 1, idx + 1, word, board);
			}

			// if didn't find then mark false and out
			visited[i][j] = false;
			return check;	
		}

	}

	public static void main(String[] args) {
		char[][] board = new char[][] { { 'A', 'B', 'C', 'E' }, { 'S', 'F', 'C', 'S' }, { 'A', 'D', 'E', 'E' } };
		String word = "SEE";
		System.out.println(exist(board, word));
	}
}
