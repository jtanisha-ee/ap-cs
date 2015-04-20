/*
 * Copyright (C) Tanisha (aceso1999@gmail.com) - All Rights Reserved.
 * Unauthorized copying of this file, via any medium is strictly prohibited.
 * Proprietary and confidential.
 */

package org.redbasin.freeresponse.test1;

/**
 * // zoomSquare = 1
 * rowSum[0] = square[0][0];
 * colSum[0] = square[0][0];
 * // zoomSquare = 2
 * rowSum[0] = rowSum[0] + square[0][1];
 * rowSum[1] = square[1][0] + square[1][1];
 * colSum[0] = colSum[0] + square[1][0];
 * colSum[1] = square[0][1] + square[1][1];
 * // zoomSquare = 3
 * rowSum[0] = rowSum[0] + square[0][2];
 * rowSum[1] = rowSum[1] + square[1][2];
 * rowSum[2] = square[2][0] + square[2][1] + square[2][2];
 * colSum[0] = colSum[0] + square[2][0];
 * colSum[1] = colSum[1] + square[2][1];
 * colSum[2] = square[0][2] + square[1][2] + square[2][2];
 * // zoomSquare = 4
 * rowSum[0] = rowSum[0] + square[0][3];
 * rowSum[1] = rowSum[1] + square[1][3];
 * rowSum[2] = rowSum[2] + square[2][3];
 * rowSum[3] = square[3][0] + square[3][1] + square[3][2] + square[3][3];
 * colSum[0] = colSum[0] + square[3][0];
 * colSum[1] = colSum[1] + square[3][1];
 * colSum[2] = colSum[2] + square[3][2];
 * colSum[3] = square[0][3] + square[1][3] + square[2][3] + square[3][3];
 *
 * @author tanisha on 4/19/15.
 */
public class MagicSquare {

  public int getElement(int[][] square, int i, int j) {
    return square[i][j];
  }

  public int processMagic(int[][] square) {
    int[] colSum = new int[square.length];
    int[] rowSum = new int[square.length];
    int frontDiagSum = 0;
    int backDiagSum = 0;

    for (int zoomSquare = 1; zoomSquare <= square.length; zoomSquare++) {
      for (int j = 0; j < zoomSquare; j++) {
        if (j < zoomSquare - 1) {
          rowSum[j] += getElement(square, j, zoomSquare - 1);
          colSum[j] += getElement(square, zoomSquare - 1, j);
        } else {
          for (int k = 0; k < zoomSquare; k++) {
            rowSum[j] += getElement(square, zoomSquare - 1, k);
            colSum[j] += getElement(square, k, zoomSquare - 1);
          }
        }
      }
      // update north-west to south-east diagonal sum
      frontDiagSum += getElement(square, zoomSquare - 1, zoomSquare - 1);
    }
    for (int i = 0; i < square.length; i++) {
      backDiagSum += getElement(square, i, square.length - 1 - i);
    }
    int currentSum = backDiagSum;
    if (backDiagSum != frontDiagSum) return -1;
    for (int i = 0; i < square.length; i++) {
      if (colSum[i] != currentSum) return -1;
      if (rowSum[i] != currentSum) return -1;
    }
    return currentSum;
  }

  public static void main(String[] args) {
    int[][] square =
        {
            {16, 3, 2, 13},
            {5, 10, 11, 8},
            {9, 6, 7, 12},
            {4, 15, 14, 1}
        };
    MagicSquare magicSquare = new MagicSquare();
    System.out.println(magicSquare.processMagic(square));
  }
}
