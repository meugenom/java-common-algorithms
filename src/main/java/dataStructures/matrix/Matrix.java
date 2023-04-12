package dataStructures.matrix;

public class Matrix {

	private int[][] matrix;

	public void set(int[][] m) {
		if(m == null)
			throw new IllegalArgumentException("Input matrix is NULL");

		this.matrix = m;
	}

	public int[][] get() {
		return matrix;
	}

	/**
	 * rotate matrix
	 * @return rotated matrix
	 * @time complexity O(n^2)
	 * @space complexity O(1)
	 */
	public void rotate() {

		this.transpose();
		this.reflect();
	}

	/**
	 * transpose matrix : 1 step -> rotated
	 * @time complexity O(n^2)
	 * @space complexity O(1)
	 */
	public void transpose() {
		for (int i = 0; i < matrix.length; i++) {
			for (int j = i; j < matrix[i].length; j++) {
				int tmp = matrix[j][i];
				matrix[j][i] = matrix[i][j];
				matrix[i][j] = tmp;
			}
		}
	}

	/**
	 * reflect early transposed matrix : 2 step -> rotated
	 * @time complexity O(n^2)
	 * @space complexity O(1)
	 */
	public void reflect() {
		for (int i = 0; i < matrix.length; i++) {
			for (int j = 0; j < matrix.length / 2; j++) {
				int tmp = matrix[i][j];
				matrix[i][j] = matrix[i][matrix.length - j - 1];
				matrix[i][matrix.length - j - 1] = tmp;
			}
		}
	}

	@Override
	public String toString() {
		String out = "[";
		for (int i = 0; i < matrix.length; i++) {
			out = out + "[";
			for (int j = 0; j < matrix.length; j++) {
				out = out + matrix[i][j];
				if (j != matrix.length - 1) {
					out = out + ",";
				}
			}
			out = out + "]";
			if (i != matrix.length - 1) {
				out = out + ",";
			}
		}
		return out + "]";
	}
}
