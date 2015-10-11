/*
 * Copyright (C) Tanisha - All Rights Reserved.
 * Unauthorized copying of this file, via any medium is strictly prohibited.
 * Proprietary and confidential.
 */

package org.redbasin.math.circle;

/**
 * @author tanisha on 10/11/15.
 */
public class Circle {
  private static double PI = 3.14159;
  private double radius = 0;

  public Circle(double radius) {
    this.radius = radius;
  }

  public double getArea() {
    return PI * radius * radius;
  }

  public double circumference() {
    return 2 * PI * radius;
  }
}
