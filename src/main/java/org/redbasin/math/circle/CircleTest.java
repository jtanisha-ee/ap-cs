/*
 * Copyright (C) Tanisha - All Rights Reserved.
 * Unauthorized copying of this file, via any medium is strictly prohibited.
 * Proprietary and confidential.
 */

package org.redbasin.math.circle;

/**
 * @author tanisha on 10/11/15.
 */
public class CircleTest {
  public static void main(String[] args) {
    Circle c1 = new Circle(4);
    Circle c2 = new Circle(5);
    if (c1.equals(c2)) {
      System.out.println("The two circles are equal");
    } else {
      System.out.println("The two circles are not equal");
    }
  }
}
