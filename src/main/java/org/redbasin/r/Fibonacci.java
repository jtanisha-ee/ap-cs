package org.redbasin.r;

/**
 * Created by manojjoshi on 7/10/16.
 */
public class Fibonacci {

    /**
     *
     * @param n is the (n+1)th term in the sequence
     * @return
     */
    public static int fib(int n) {
        if (n == 0) return 0;
        if (n == 1) return 1;
        int m = fib(n-1) + fib(n-2);
        System.out.println("m = " + m);
        return m;
    }

    public static void main(String[] args) {
        System.out.println(fib(10));
    }
}
