/*
 * Copyright (C) Tanisha - All Rights Reserved.
 * Unauthorized copying of this file, via any medium is strictly prohibited.
 * Proprietary and confidential.
 */

package org.redbasin.math.circle;

import java.util.Scanner;

/**
 * @author tanisha on 10/11/15.
 */
public class CircleTest2 {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    Circle c1 = null, c2 = null;
    System.out.print("Enter radius: ");
    if (scanner.hasNextDouble()) {
      double radius = scanner.nextDouble();
      c1 = new Circle(radius);
      System.out.println("Created circle c1 of radius " + radius);
    }
    System.out.print("Enter radius: ");
    if (scanner.hasNextLine()) {
      double radius = scanner.nextDouble();
      c2 = new Circle(radius);
      System.out.println("Created circle c2 of radius " + radius);
    }
    System.out.print("Do you want to compare the two circles? (Y or N): ");
    if (scanner.hasNext()) {
      String s = scanner.next();
      if (s.equals("Y")) {
        System.out.println("The two circles are equal (true or false): " + c1.equals(c2));
      } else {
        if (s.equals("N"))
          System.out.println("We will not compare the two circles.");
      }
    }
  }
}