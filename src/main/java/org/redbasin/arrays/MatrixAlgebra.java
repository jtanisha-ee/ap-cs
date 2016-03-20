package org.redbasin.arrays;

/**
 * Created by jtanisha-ee on 3/20/16.
 */
public class MatrixAlgebra {

    public static int getEigenvalue(int[][] matrix) {
        return matrix[0][0]*matrix[1][1] - matrix[0][1]*matrix[1][0];
    }

    public static void main(String[] args) {
        int[][] matrix = new int[2][2];

        matrix[0][0] = 4;  // 0th row, 0th column
        matrix[0][1] = 5;  // 0th row, 1st column
        matrix[1][0] = 3;
        matrix[1][1] = 7;

        System.out.println(getEigenvalue(matrix));

        int[][] matrix33 = new int[3][3];

        for (int row = 0; row < 3; row++) {   // visits each row
            for (int col = 0; col < 3; col++) {   // visits each col
                matrix33[row][col] = row * col;
            }
        }

        int[][] matrix1 = new int[2][2];
        for (int row = 0; row < 2; row++) {
            for (int col = 0; col < 2; col++) {
                matrix1[row][col] = matrix33[row+1][col+1];
            }
        }

        int[][] matrix2 = new int[2][2];
        matrix2[0][0] = matrix33[1][0];
        matrix2[0][1] = matrix33[1][2];
        matrix2[1][0] = matrix33[2][0];
        matrix2[1][1] = matrix33[2][2];

        int[][] matrix3 = new int[2][2];
        for (int row = 0; row < 2; row++) {
            for (int col = 0; col < 2; col++) {
                matrix3[row][col] = matrix33[row+1][col];
            }
        }

        int e = matrix33[0][0]*getEigenvalue(matrix1) -
                matrix33[0][1]*getEigenvalue(matrix2) +
                matrix33[0][2]*getEigenvalue(matrix3);

        System.out.println("Eigenvalue of 3x3 matrix = " + e);

    }
}
