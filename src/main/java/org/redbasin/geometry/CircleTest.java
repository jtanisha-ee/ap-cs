package org.redbasin.geometry;

/**
 * Created by manojjoshi on 4/30/17.
 */
public class CircleTest {
    public static void main(String[] args) {
        // This is a one instance of a circle
        Circle c = new Circle(22.5);
        //c.radius = 22.5;
        System.out.println("Area = " + c.getArea());
        System.out.println("Circumference = " + c.getCircumference());

        // This is another instance of a circle
        Circle c1 = new Circle(22.5);
        //c1.radius = 22.5;

        Circle c2 = new Circle(3.4);
        System.out.println("Area = " + c2.getArea());
    }
}
