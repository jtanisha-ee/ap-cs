package org.redbasin.algorithms.minmax;

/**
 * Created by manojjoshi on 6/25/17.
 */
public class NegativeNumbers {
    public static void main(String[] args) {
        // smallest negative number
        System.out.println(Integer.MIN_VALUE);
        // smallest positive number
        System.out.println(Integer.MAX_VALUE);

        Integer x = Integer.MAX_VALUE + 1;
        System.out.println(x);

        System.out.println(x == Integer.MIN_VALUE); // boolean expression

        Integer y = Integer.MIN_VALUE - 1;
        System.out.println(y);

        System.out.printf("%.0f\n", Math.pow(2, 31) - 1);

        System.out.println(Math.pow(2, 31) -1 == Integer.MAX_VALUE);


    }
}
