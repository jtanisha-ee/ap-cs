package org.redbasin.recursion.r;

/**
 * Created by manojjoshi on 7/10/16.
 */
public class Factorial {

    /**
     * This is an example of iteration
     * @param n is the number of terms in the series
     * @return
     */
    public static int factorial(int n) {
        int f = 1;
        for (int i = 1; i <= n; i++) {
            f = f * i;
            System.out.println("i = " + i + ", f = " + f);
        }
        return f;
    }

    public static int factRecur(int n) {
        if (n == 1) return 1;    // boolean operator
        return n * factRecur(n-1);
    }

    public static void main(String[] args) {
        System.out.println("iteration result = " + factorial(10));
        System.out.println("recursion result = " + factRecur(10));
    }
}
