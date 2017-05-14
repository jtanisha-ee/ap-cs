package org.redbasin.geometry;

/**
 * Created by manojjoshi on 4/30/17.
 */
public class Circle {
    double radius;
    static final double pi = 3.14159;

    // implicit constructor
    //Circle() {

    //}

    // explicit constructor
    Circle(double radius) {
        this.radius = radius;
    }

    double getArea() {
        return pi * radius * radius;
    }

    double getCircumference() {
        return 2 * pi * radius;
    }
}

