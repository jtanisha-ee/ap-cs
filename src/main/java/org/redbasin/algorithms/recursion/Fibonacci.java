package org.redbasin.algorithms.recursion;

/**
 * Created by manojjoshi on 8/13/17.
 */
public class Fibonacci {

    public static int f(int N) {
        if (N == 1) return 1;
        if (N == 2) return 1;
        return f(N-1) + f(N-2);
    }

    public static void main(String[] args) {
        int f46 = f(46);
        int f45 = f(45);
        int f44 = f(44);
        System.out.println("f46 = " + f(46));
        System.out.println("f45 = " + f(45));
        System.out.println("f44 = " + f(44));
        int sum = f45 + f44;
        System.out.println("sum = " + sum);
    }
}
