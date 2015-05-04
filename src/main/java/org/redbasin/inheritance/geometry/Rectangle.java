/*
 * Copyright (C) Tanisha  - All Rights Reserved.
 * Unauthorized copying of this file, via any medium is strictly prohibited.
 * Proprietary and confidential.
 */

package org.redbasin.inheritance.geometry;

public class Rectangle extends Quadrilateral {

  public Rectangle(Coordinate sw, Coordinate ne) {
    southWest = sw;
    northEast = ne;
    northWest = new Coordinate(sw.x, ne.y);
    southEast = new Coordinate(ne.x, sw.y);
  }
  public double perimeter() {
       return GeometryUtils.distance(northWest, northEast)*2 + GeometryUtils.distance(northWest, southWest)*2;
   }

   public double area() {
       return GeometryUtils.distance(northWest, northEast) * GeometryUtils.distance(northWest, southWest);
   }
}
