/*
 * Copyright (C) Tanisha - All Rights Reserved.
 * Unauthorized copying of this file, via any medium is strictly prohibited.
 * Proprietary and confidential.
 */

package org.redbasin.recursion;

/**
 * @author tanisha on 1/31/16.
 */
public class Recursion {

  public static int fib(int n) {
    if (n == 0) return 0;
    if (n == 1) return 1;
    if (n > 1) {
      return fib(n-1) + fib(n-2);
    }
    return 0;
  }

  public static void main(String[] args) {
      System.out.println(fib(8));
  }
}
