/*
 * Copyright (C) Tanisha  - All Rights Reserved.
 * Unauthorized copying of this file, via any medium is strictly prohibited.
 * Proprietary and confidential.
 */

package org.redbasin.labs.classwork4;

/**
 * @author redbasin
 */
public class TopTwo {
  public static void main(String[] args) {
    int one = 0, two = 0;
    int[] numbers = new int[50];
    for (int i = 0; i < 50; i++) {
      numbers[i] = 50 + (int) (Math.random() * 100);
      System.out.print(numbers[i] + " ");
    }
    for (int i = 0; i < 50; i++) {
      if (numbers[i] > one) {
        two = one;
        one = numbers[i];
      } else if (numbers[i] > two) {
        two = numbers[i];
      }
    }
    System.out.println();
    System.out.println("First = " + one + ", Second = " + two);
  }
}
