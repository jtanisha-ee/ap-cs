/*
 * Copyright (C) Tanisha - All Rights Reserved.
 * Unauthorized copying of this file, via any medium is strictly prohibited.
 * Proprietary and confidential.
 */

package org.redbasin.math.computepi;

/**
 * We will use the formula:
 *
 * sqroot(12) * (1/1*3**0 - 1/3*3**1 + 1/5*3**2 - 1/7*3**3 + 1/9*3**4 - ...)
 *
 * Compare this with 50 digits of pi:
 *
 * 3.1415926535897932384626433832795028841971693993751
 *
 * See what level of accuracy you get with double precision.
 *
 * @author tanisha on 10/11/15.
 */
public class ComputePi {


  public double computeNthTerm(int n) {
    double negation = Math.pow(-1, n);
    double oddNum = 2*n + 1;
    return negation*(1/(oddNum*Math.pow(3, n)));
  }

  public double computeSeries(int numTerms) {
    double root12 = Math.sqrt(12);
    double currentPi = 0;
    double previousPi = 0;
    double currentSum = 0;
    for (int i = 0; i < numTerms; i++) {
      currentSum += computeNthTerm(i);
      previousPi = currentPi;
      currentPi = root12 * currentSum;
      System.out.println("Current value of pi = " + currentPi);
      if (previousPi == currentPi) {
        System.out.println("We have reached the best approximation in " + (i+1) + "th term");
        return currentPi;
      }
    }
    return currentPi;
  }

  public static void main(String[] args) {
    int terms = 0;
    try {
      terms = new Integer(args[0]);
    } catch (NumberFormatException e) {
      System.err.println("Usage: java ComputePi <numTerms>");
      System.exit(1);
    }
    ComputePi computePi = new ComputePi();
    System.out.println("Pi to n places = " + computePi.computeSeries(terms));
  }
}
