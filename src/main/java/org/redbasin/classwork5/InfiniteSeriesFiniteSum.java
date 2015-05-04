/*
 * Copyright (C) Tanisha  - All Rights Reserved.
 * Unauthorized copying of this file, via any medium is strictly prohibited.
 * Proprietary and confidential.
 */

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package org.redbasin.classwork5;

/**
 *
 * @author redbasin
 */
public class InfiniteSeriesFiniteSum {

  public static void main(String[] args) {
    double sum = 1;
    double previousSum = 0;
    long i = 1;
    long j = 1;
    while (previousSum != sum) {
      i += 1;
      j *= 2;
      previousSum = sum;
      sum += 1.0/j;
      System.out.println("j = " + j + ", sum = " + sum + ", previousSum = " + previousSum);
    }
    System.out.println("sum = " + sum);
    System.out.println("i = " + i);
  }

}
