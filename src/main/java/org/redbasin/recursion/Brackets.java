package org.redbasin.recursion;

/**
 * Created by manojjoshi on 1/15/17.
 */
public class Brackets {
    public static void f(int z) {
        if (z == 0)
            System.out.print("x");
        else {
            System.out.print("{");
                f(z-1);
                System.out.print("}");
        }
    }

    public static void g(int x, int y) {
        if (x/y != 0)
            g(x/y, y);
        System.out.print(x/y + 1);
    }


    public static void main(String[] args) {
        f(4);
        g(4, 2);
    }
}
