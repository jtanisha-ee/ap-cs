package org.redbasin.algorithms.matrix;

/**
 * Created by manojjoshi on 9/11/16.
 */
public class MatrixSum {

    /**
     * Create a matrix with numRows = rows, and
     * numColumns = cols, and fill it up with random integers.
     * @param rows
     * @param cols
     * @return
     */
    public static int[][] createMatrix(int rows, int cols) {
        int[][] matrix = new int[rows][cols];
        for (int i = 0; i < rows; i++) {
            matrix[i] = new int[cols];
            // generate random bet 10 and 110
            for (int j = 0; j < cols; j++) {
                int rand = 10 + (int) (Math.random() * 100);
                matrix[i][j] = rand;
            }

        }
        return matrix;
    }

    public static int matrixSum(int[][] aMatrix) {
        int sum = 0;
        int rows = aMatrix.length;
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < aMatrix[i].length; j++) {
                sum = sum + aMatrix[i][j];
            }
        }
        return sum;
    }

    public static void main(String[] args) {
        int[][] matrix = createMatrix(23, 76);
        int sum = matrixSum(matrix);
        System.out.println("sum = " + sum);
    }
}
