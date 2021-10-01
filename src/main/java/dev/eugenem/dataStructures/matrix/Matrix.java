package dev.eugenem.dataStructures.matrix;

public class Matrix {

    /**
     * rotate matrix
    * @param {Array} matrix
    */
    public void rotate(int[][] matrix) {

        this.transpose(matrix);
        this.reflect(matrix);
    }

    /** 
     * transpose matrix : 1 step -> rotated
     * @param {Array} matrix
     */
    public void transpose(int[][] matrix) {
        for(int i = 0; i < matrix.length; i++) {
            for(int j = i; j < matrix[i].length; j++) {
                int tmp = matrix[j][i];
                matrix[j][i] = matrix[i][j];
                matrix[i][j] = tmp;
            }
        }
    }

    /**
     * reflect early transposed matrix : 2 step -> rotated
     * @param matrix
     */
    public void reflect(int[][] matrix) {
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix.length / 2; j++) {
                int tmp = matrix[i][j];
                matrix[i][j] = matrix[i][matrix.length - j - 1];
                matrix[i][matrix.length - j - 1] = tmp;
            }
        }
    }

        public static void main(String[] args){

            Matrix m = new Matrix();
            int[][] matrix = new int[][]{
                {1,2,3},
                {4,5,6},
                {7,8,9}};

            m.rotate(matrix);
            //expected : [[7,4,1],[8,5,2],[9,6,3]]
        }
}
