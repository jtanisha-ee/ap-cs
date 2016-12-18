package org.redbasin.staticex.statictheory;

/**
 * Created by manojjoshi on 9/18/16.
 */
public class StaticPlay {

    public static void main(String[] args) {
        Circle.PI = 3.14159;
        Circle c1 = new Circle();
        Circle c2 = new Circle();
        System.out.println("PI = " + c1.PI);
        System.out.println("PI = " + c2.PI);
        Circle.PI = 3.14;
        System.out.println("PI = " + c1.PI);
        System.out.println("PI = " + c2.PI);
    }
}

class Circle {
    static double PI;  // share across circles
    double radius;
}
