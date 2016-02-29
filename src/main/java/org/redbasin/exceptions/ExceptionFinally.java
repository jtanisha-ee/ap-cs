/*
 * Copyright (C) Tanisha - All Rights Reserved.
 * Unauthorized copying of this file, via any medium is strictly prohibited.
 * Proprietary and confidential.
 */

package org.redbasin.exceptions;

/**
 * @author tanisha on 2/28/16.
 */
public class ExceptionFinally {

  public static void main(String[] args) {
    int x = 10;
    int y = 0;

    try {
      System.out.println(x / y);
    } finally {
      System.out.println("I drank the poison, but managed to add two numbers before I died.");
      System.out.println(x + y);
    }

  }
}
