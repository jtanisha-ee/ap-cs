package org.redbasin.algorithms;

/**
 * Created by jtanisha-ee on 8/7/16.
 */
public class Determinant {

    public static int determinant2x2(int[][] matrix) {
        // ad - bc
        return matrix[0][0]*matrix[1][1] - matrix[1][0]*matrix[0][1];
    }

    public static int determinant3x3(int[][] matrix) {
        int[][] m1 = {{matrix[1][0], matrix[1][1]},
                      {matrix[2][0], matrix[2][1]}};

        int[][] m2 = {{matrix[1][0], matrix[1][2]},
                       {matrix[2][0], matrix[2][2]}};

        int[][] m3 = {{matrix[1][1], matrix[1][2]},
                       {matrix[2][1], matrix[2][2]}};

        int d1 = determinant2x2(m1);
        int d2 = determinant2x2(m2);
        int d3 = determinant2x2(m3);

        return matrix[0][0]*d1 - matrix[0][1]*d2 + matrix[0][2]*d3;
    }

    public static int addRightDiagonal(int[][] matrix) {
        int sum = 0;
        for (int i = 0; i < matrix.length; i++) {
            sum = sum + matrix[i][matrix.length-1-i];
        }
        return sum;
    }

    public static int addLeftDiagonal(int[][] matrix) {
       int sum = 0;
        for (int i = 0; i < matrix.length; i++) {
           sum = sum + matrix[i][i];
       }
        return sum;
    }

    public static void main(String[] args) {
        int[][] matrix = {{2, 3}, {4, 7}};

        System.out.println(determinant2x2(matrix));

        int[][] matrix3x3 = {{3, 2, 4}, {1, 7, 2}, {3, 2, 5}};

        System.out.println(determinant3x3(matrix3x3));

        System.out.println("Left Diagonal Sum = " + addLeftDiagonal(matrix3x3));
        System.out.println("Right Diagonal Sum = " + addRightDiagonal(matrix3x3));

    }
}
