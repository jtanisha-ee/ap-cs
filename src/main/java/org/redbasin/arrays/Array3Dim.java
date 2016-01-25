/*
 * Copyright (C) Tanisha - All Rights Reserved.
 * Unauthorized copying of this file, via any medium is strictly prohibited.
 * Proprietary and confidential.
 */

package org.redbasin.arrays;

/**
 * @author tanisha on 1/24/16.
 */
public class Array3Dim {

  /**
   * In AMC Eastridge:
   * - there are 16 movie theaters
   * - each movie theater has "numRows" rows
   * - each row has "numSeats" seats
   * @param args
   */
  public static void main(String[] args) {
    String[][][] eastridge = new String[16][][];

    for (int i = 0; i < eastridge.length; i++) {
      eastridge[i] = new String[40][35];
      for (int j = 0; j < eastridge[i].length; j++) {
        for (int k = 0; k < eastridge[i][j].length; k++) {
          eastridge[i][j][k] = "seat" + "-" + i + "-" + j + "-" + k;
        }
      }
    }

    for (int i = 0; i < eastridge.length; i++) {
       for (int j = 0; j < eastridge[i].length; j++) {
         for (int k = 0; k < eastridge[i][j].length; k++) {
           System.out.println(eastridge[i][j][k]);
         }
       }
    }
  }
}
