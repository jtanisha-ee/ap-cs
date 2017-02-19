package org.redbasin.operators;

/**
 * Created by manojjoshi on 2/19/17.
 */
public class OperatorIf {

    public static void main(String[] args) {
        int x = 5;
        // comparison happens first, increment happens later
        if (x++ == 6) {
            System.out.println("Hello");
        } else {
            System.out.println("World");
        }

        int y = 4;
        if (++y == (y++ - 1)) {
            System.out.println("Voyage");
        } else {
            System.out.println("Mars");
        }
        System.out.println("y = " + y);
    }
}
