/*
 * Copyright (C) Tanisha  - All Rights Reserved.
 * Unauthorized copying of this file, via any medium is strictly prohibited.
 * Proprietary and confidential.
 */

package org.redbasin.labs.classwork7;

/**
 *
 * @author redbasin
 */
public final class Rectangle {
   public Coordinate nw, ne, sw, se;
   boolean isValid;

   public Rectangle(Coordinate nw, Coordinate ne, Coordinate sw, Coordinate se) {
      this.nw = nw;
      this.ne = ne;
      this.sw = sw;
      this.se = se;
   }

   public double perimeter() {
       return GeometryUtils.distance(nw, ne)*2 + GeometryUtils.distance(nw, sw)*2;
   }

   public double area() {
       return GeometryUtils.distance(nw, ne) * GeometryUtils.distance(nw, sw);
   }
}