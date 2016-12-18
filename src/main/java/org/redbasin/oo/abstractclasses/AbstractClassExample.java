package org.redbasin.oo.abstractclasses;

/**
 * Created by jtanisha-ee on 7/24/16.
 */
public class AbstractClassExample {
    public static void main(String[] args) {
        Rectangle rectangle = new Rectangle(5, 7);
        System.out.println(rectangle.area());
        System.out.println(rectangle.perimeter());
    }
}

abstract class Quadrilateral {
    int a, b, c, d;
    public Quadrilateral(int x, int y) {
        a = c = x;
        b = d = y;
    }
    /*public Quadrilateral(int a, int b, int c, int d) {
        this.a = a;
        this.b = b;
        this.c = c;
        this.d = d;
    }*/
    public int perimeter() {
        return a + b + c + d;
    }
    abstract public int area();
}

class Rectangle extends Quadrilateral {
    int length, width;
    public Rectangle(int x, int y) {
        super(x, y);
        length = x;
        width = y;

    }
    public int perimeter() {
        return 2*(length+width);
    }
    public int area() {
        return length*width;
    }
}
