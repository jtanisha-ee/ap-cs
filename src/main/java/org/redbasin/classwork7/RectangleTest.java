/*
 * Copyright (C) Tanisha  - All Rights Reserved.
 * Unauthorized copying of this file, via any medium is strictly prohibited.
 * Proprietary and confidential.
 */

package org.redbasin.classwork7;

public class RectangleTest {
    public static void main(String[] args) {
        Coordinate nw = new Coordinate(5, 7);
        Coordinate ne = new Coordinate(9, 7);
        Coordinate sw = new Coordinate(5, 1);
        Coordinate se = new Coordinate(9, 1);
        Rectangle rectangle = new Rectangle(nw, ne, sw, se);
        System.out.println("perimeter = " + rectangle.perimeter());
        System.out.println("area = " + rectangle.area());

    }
}
