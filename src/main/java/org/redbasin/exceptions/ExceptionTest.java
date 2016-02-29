/*
 * Copyright (C) Tanisha - All Rights Reserved.
 * Unauthorized copying of this file, via any medium is strictly prohibited.
 * Proprietary and confidential.
 */

package org.redbasin.exceptions;

/**
 * @author tanisha on 2/28/16.
 */
public class ExceptionTest {

  public static void main(String[] args) {
    int x = 10;
    int y = 0;

    try {
      System.out.println(x / y);
    } catch (ArithmeticException e) {
      System.out.println("Haha, you gave me the poison, but I did not drink it.");
    }

    System.out.println(x + y);

  }
}
