/*
 * Copyright (C) Tanisha  - All Rights Reserved.
 * Unauthorized copying of this file, via any medium is strictly prohibited.
 * Proprietary and confidential.
 */

package org.redbasin.classwork4;
/**
 * 1. Generate an array of 20 random numbers between 1
 *    and 100.
 * 2. Identify the max and min of these numbers.
 * FILL IN THE QUESTION MARKS WITH CORRECT VALUES.
 * @author redbasin
 */
public class MaxMin {
  public static void main(String[] args) {
    int min = 100, max = 0;
    final int CNT = 1000000000;
    int[] numbers = new int[CNT];
    for (int i = 0; i < CNT; i++) {
      numbers[i] = (int) (Math.random() * 100);
      //System.out.print(numbers[i] + " ");
    }
    for (int i = 0; i < CNT; i++) {
      if (numbers[i] > max) {
        max = numbers[i];
      }
      if (numbers[i] < min) {
        min = numbers[i];
      }
    }
    System.out.println();
    System.out.println("min = " + min + ", max = " + max);
  }
}
