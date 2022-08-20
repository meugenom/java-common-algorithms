package leetcode.RotateImage;

public class RotateImage {

    public void rotate(int[][] matrix) {

        //transpose
        for(int i = 0; i < matrix.length; i++) {
            for(int j = i; j < matrix[i].length; j++) {
                int tmp = matrix[j][i];
                matrix[j][i] = matrix[i][j];
                matrix[i][j] = tmp;
            }
        }

        //reflect
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix.length / 2; j++) {
                int tmp = matrix[i][j];
                matrix[i][j] = matrix[i][matrix.length - j - 1];
                matrix[i][matrix.length - j - 1] = tmp;
            }
        }
    }

    public static void main(String[] args){
        RotateImage ri = new RotateImage();
        int[][] matrix = new int[][]{{1,2,3},{4,5,6},{7,8,9}};
        ri.rotate(matrix);
        //expected : [[7,4,1],[8,5,2],[9,6,3]]
    }
}
