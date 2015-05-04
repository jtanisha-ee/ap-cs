/*
 * Copyright (C) Tanisha (aceso1999@gmail.com) - All Rights Reserved.
 * Unauthorized copying of this file, via any medium is strictly prohibited.
 * Proprietary and confidential.
 */

package org.redbasin.freeresponse.test2;

/**
 * @author tanisha on 5/3/15.
 */
public class CompoundInterest {

  public static double initialBalance;

  public static double totalGain(double balance, int term, double rate) {
    if (initialBalance == 0) initialBalance = balance;
    if (term != 0) {
      balance += balance * rate / 100;
      return totalGain(balance, term - 1, rate);
    } else {
      return balance - initialBalance;
    }
  }

  public static void main(String[] args) {
    System.out.println("Total Gain = "  + totalGain(1000, 14, 1.45));
  }
}
