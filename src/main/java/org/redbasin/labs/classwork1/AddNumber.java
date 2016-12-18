/*
 * Copyright (C) Tanisha - All Rights Reserved.
 * Unauthorized copying of this file, via any medium is strictly prohibited.
 * Proprietary and confidential.
 */

package org.redbasin.labs.classwork1;

/**
 * @author tanisha on 1/17/16.
 */
public class AddNumber {

  final static int NUM = 1000;  // not possible to change it again

  public static void main(String[] args) {
    int sum = 0;

    for (int i = 1; i <= NUM; i++) {
      sum = sum + i;
    }

    System.out.println("sum = " + sum);

    sum = 0;
    for (int i = 1; i <= NUM; i = i + 2) {
      sum = sum + i;
    }

    System.out.println("sum of odd numbers = " + sum);

    sum = 0;
    for (int i = 0; i <= NUM; i = i + 2) {
      sum = sum + i;
    }

    System.out.println("sum of even numbers = " + sum);
  }
}
