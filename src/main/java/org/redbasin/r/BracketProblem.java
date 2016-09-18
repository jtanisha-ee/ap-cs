package org.redbasin.r;

/**
 * Created by manojjoshi on 7/10/16.
 */
public class BracketProblem {

    public static void f(int z) {
        if (z == 0) System.out.print("{x}");
        else {
            System.out.print("{");
                f(z-1);
                System.out.print("}");
        }
    }

    public static void main(String[] args) {
        f(5);
    }
}
