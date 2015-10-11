/*
 * Copyright (C) Tanisha - All Rights Reserved.
 * Unauthorized copying of this file, via any medium is strictly prohibited.
 * Proprietary and confidential.
 */

package org.redbasin.math.computepi;
/**
 * We will use the formula:
 * sqroot(12) * (1/1*3**0 - 1/3*3**1 + 1/5*3**2 - 1/7*3**3 + 1/9*3**4 - ...)
 * Compare this with 50 digits of pi:
 * 3.1415926535897932384626433832795028841971693993751
 * @see <a href="https://en.wikipedia.org/wiki/Approximations_of_%CF%80">Approximations to Pi</a>
 * See what level of accuracy you get with double precision.
 * @author tanisha on 10/11/15.
 */
public class ComputePiStepTwo {
  private double SOMETHING = 0;
  public double computeNthTerm(int n) {
    double negation = Math.pow(-1, n);
    double oddNum = 2*n + 1;
    return negation*(1/(oddNum*Math.pow(3, n)));
  }
  public double computeSeries(int numTerms) {
    // add your code here
    return SOMETHING;
  }
  public static void main(String[] args) {
    int terms = new Integer(args[0]);

    ComputePiStepTwo computePi = new ComputePiStepTwo();
    System.out.println("Pi to n places = " + computePi.computeSeries(terms));
  }
}