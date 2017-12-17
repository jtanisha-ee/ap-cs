package org.redbasin.recursion;

/**
 * Created by manojjoshi on 11/12/17.
 */
public class FibonacciFun {

    public static int fib(int n) {
        if ((n == 1) || (n == 2))
            return 1;
        return fib(n-1) + fib(n-2);
    }

    public static void main(String[] args) {
        int n = 10;
        System.out.println("fibonacci n = " + fib(n));
    }
}
