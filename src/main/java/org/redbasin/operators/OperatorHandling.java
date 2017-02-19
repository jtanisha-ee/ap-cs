package org.redbasin.operators;

/**
 * Created by manojjoshi on 2/19/17.
 */
public class OperatorHandling {

    public static void main(String[] args) {
        // postfix increment operator
        // act on the variable first, and increment it later
        // prints first and increments it later
        int x = 2;
        System.out.println("x = " + x);
        System.out.println("x++ = " + x++);
        System.out.println("x = " + x);

        // prefix increment operator
        // increments first and prints later
        int y = 4;
        System.out.println("y = " + y);
        System.out.println("++y = " + ++y);

        //postfix decrement operator
        int z = 5;
        System.out.println("z = " + z);
        System.out.println("z-- = " + z--);

        // prefix decrement operator
        int a = 7;
        System.out.println("a = " + a);
        System.out.println("--a = " + --a);
    }
}
