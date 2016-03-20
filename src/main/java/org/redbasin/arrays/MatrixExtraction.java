package org.redbasin.arrays;

/**
 * Created by jtanisha-ee on 3/20/16.
 */
public class MatrixExtraction {

    public static void printLeftDiagonal(int[][] matrix) {
        for (int i = 0; i < 3; i++) {
            System.out.println(matrix[i][i]);
        }
    }

    public static void printRightDiagonal(int[][] matrix) {
        for (int i = 0; i < 3; i++) {
            System.out.println(matrix[i][3-i-1]);
        }
    }

    public static void main(String[] args) {

        int[][] matrix33 = new int[3][3];

        for (int row = 0; row < 3; row++) {   // visits each row
            for (int col = 0; col < 3; col++) {   // visits each col
                matrix33[row][col] = row + col;
            }
        }

        printLeftDiagonal(matrix33);
        printRightDiagonal(matrix33);

    }
}
