/*
 * Copyright (C) Tanisha - All Rights Reserved.
 * Unauthorized copying of this file, via any medium is strictly prohibited.
 * Proprietary and confidential.
 */

package org.redbasin.arrays;

/**
 * @author tanisha on 1/17/16.
 */
public class HelloException {

  public static int getInteger(String s) {
    return new Integer(s);
  }

  public static void main(String[] args) {
    String s = "S900";
    try {
      getInteger(s);
    } catch (NumberFormatException e) {
      System.out.println("Cannot convert a String to a number ---- " + e.getMessage());
      e.printStackTrace();
    } finally {
      System.out.println("I always execute this statement.");
    }

    System.out.println("Came here to resume regular processing");
  }
}
