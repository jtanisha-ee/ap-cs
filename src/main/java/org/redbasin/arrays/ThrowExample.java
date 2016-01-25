/*
 * Copyright (C) Tanisha - All Rights Reserved.
 * Unauthorized copying of this file, via any medium is strictly prohibited.
 * Proprietary and confidential.
 */

package org.redbasin.arrays;

/**
 * @author tanisha on 1/17/16.
 */


public class ThrowExample {

  public static int getInteger(String s) throws Exception {
    int x = 0;
    try {
      x = new Integer(s);
    } catch (NumberFormatException e) {
      throw new Exception("Age is invalid.", e);
    }
    System.out.println("Came here ******");
    return x;
  }

  public static void main(String[] args)  {
    String s = "900";
    try {
      int x = getInteger(s);
      System.out.println("x = " + x);
    } catch (Exception e) {
      System.out.println("Cannot convert a String to a number ---- " + e.getMessage());

    } finally {
      System.out.println("I always execute this statement.");
    }

    System.out.println("Came here to resume regular processing");
  }
}
