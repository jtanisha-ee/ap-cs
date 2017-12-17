package org.redbasin.oo;

/**
 * Created by manojjoshi on 10/8/17.
 * This program represents a Triangle. It has 3 vertices.
 */
public class Triangle {

    double base;
    double height;
    final double MULTIPLIER = 0.5;

    // Constructor
    public Triangle(double base, double height) {
        this.base = base;
        this.height = height;
    }

    double area() {
        return MULTIPLIER*base*height;
    }
}
