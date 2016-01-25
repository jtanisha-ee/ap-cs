/*
 * Copyright (C) Tanisha - All Rights Reserved.
 * Unauthorized copying of this file, via any medium is strictly prohibited.
 * Proprietary and confidential.
 */

package org.redbasin.arrays;

/**
 * @author tanisha on 1/24/16.
 */
public class EastridgeTheaters {

  public void initializeSeats(String[][][] seats) {
    for (int i = 0; i < seats.length; i++) {  // number of theaters
       seats[i] = new String[40][35];   // 40 rows, 35 seats
      for (int j = 0; j < seats[i].length; j++) {  // number of rows
        for (int k = 0; k < seats[i][j].length; k++) {  // no of seats per row
            seats[i][j][k] = "s-" + i + "-" + "j" + "-" + k;
        }
      }
    }
  }

  public void dumpSeats(String[][][] seats) {
    for (int i = 0; i < seats.length; i++) {
      for (int j = 0; j < seats[i].length; j++) {
        for (int k = 0; k < seats[i][j].length; k++) {
          System.out.println(seats[i][j][k]);
        }
      }
    }
  }

  public static void main(String[] args) {
    String[][][] seats = new String[3][][];  // assume 3 theaters
    EastridgeTheaters eastridgeTheaters = new EastridgeTheaters();
    eastridgeTheaters.initializeSeats(seats);
    eastridgeTheaters.dumpSeats(seats);
  }
}
