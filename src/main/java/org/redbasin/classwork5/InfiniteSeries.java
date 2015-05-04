/*
 * Copyright (C) Tanisha  - All Rights Reserved.
 * Unauthorized copying of this file, via any medium is strictly prohibited.
 * Proprietary and confidential.
 */

package org.redbasin.classwork5;

/**
 * @author redbasin
 */
public class InfiniteSeries {
  public static final long NUM_TERMS = 10000000000L;

  public static void main(String[] args) {
    double sum = 0;
    for (long i = 1; i < NUM_TERMS; i++) {
      sum += 1.0/i;
      if (i % 1000 == 0) {
        System.out.println("sum = " + sum);
      }
    }
    System.out.println("sum = " + sum);
  }

}
