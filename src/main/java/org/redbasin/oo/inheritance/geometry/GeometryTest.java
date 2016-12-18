/*
 * Copyright (C) Tanisha  - All Rights Reserved.
 * Unauthorized copying of this file, via any medium is strictly prohibited.
 * Proprietary and confidential.
 */

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package org.redbasin.oo.inheritance.geometry;

/**
 *
 * @author redbasin
 */
public class GeometryTest {
  public static void main(String[] args) {
    Rectangle rectangle = new Rectangle(new Coordinate(0, 0), new Coordinate(3, 3));
    System.out.println("area = " + rectangle.area());
    System.out.println("perimeter = " + rectangle.perimeter());
  }
}
