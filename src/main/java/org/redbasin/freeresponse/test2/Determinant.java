/*
 * Copyright (C) Tanisha (aceso1999@gmail.com) - All Rights Reserved.
 * Unauthorized copying of this file, via any medium is strictly prohibited.
 * Proprietary and confidential.
 */

package org.redbasin.freeresponse.test2;

/**
 * @author tanisha on 5/3/15.
 */
public class Determinant {

  public static void print(int[][] submatrix) {
    for (int i = 0; i < submatrix.length; i++) {
      for (int j = 0; j < submatrix[0].length; j++) {
        System.out.print(submatrix[i][j]);
      }
      System.out.println();
    }
  }

  public static int computeDeterminant(int[][] matrix) {
    if (matrix == null)
      throw new IllegalArgumentException("Null matrix specified");
    int height = matrix.length;
    int width = matrix[0].length;
    if (!( (height == 3 && height == width) ||
        (height == 2 && height == width))) {
      throw new IllegalArgumentException("Please enter a valid 2x2 or 3x3 matrix.");
    }
    if (2==height) {  // 2x2 matrix
      return matrix[0][0]*matrix[1][1] - matrix[1][0]*matrix[0][1];
    }
    int sum = 0;
    for (int col = 0; col < matrix.length; col++) {
      int[][] submatrix = new int[2][2];
      for (int i = 1; i < matrix.length; i++) {
        for (int j = 0, k = 0; j < matrix[0].length && k < 2; j++) {
          if (col != j) {
            submatrix[i-1][k] = matrix[i][j];
            k++;
          }
        }
      }
      //print(submatrix);
      sum += Math.pow(-1, col)*matrix[0][col]*computeDeterminant(submatrix);
    }
    return sum;
  }

  public static void main(String[] args) {
    int[][] matrix = {
        {3, 1, 2},
        {1, 5, 3},
        {3, 2, 4}
    };
    System.out.println("Determinant = " + computeDeterminant(matrix));
  }
}
