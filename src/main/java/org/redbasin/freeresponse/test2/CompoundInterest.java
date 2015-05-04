/*
 * Copyright (C) Tanisha  - All Rights Reserved.
 * Unauthorized copying of this file, via any medium is strictly prohibited.
 * Proprietary and confidential.
 */

package org.redbasin.freeresponse.test2;

/**
 * @author tanisha on 5/3/15.
 */
public class CompoundInterest {

  public static double initialBalance;
  public static int term;

  public static double totalGain(double balance, int term, double rate) {
    if (initialBalance == 0) initialBalance = balance;
    if (term != 0) {
      balance += balance * rate / 100;
      return totalGain(balance, term - 1, rate);
    } else {
      return balance - initialBalance;
    }
  }

  public static int computePeriod(double balance, double goal, double rate) {
    if (initialBalance == 0) initialBalance = balance;
    if (balance - initialBalance <= goal) {
      balance += balance * rate / 100;
      term++;
      return computePeriod(balance, goal, rate);
    } else {
      return term;
    }
  }

  public static void main(String[] args) {
    System.out.println("Total Gain = "  + totalGain(1000, 14, 1.45));
    initialBalance = 0;
    term = 0;
    System.out.println("Total Years = "  + computePeriod(1000, 150, 1.45));
  }
}
