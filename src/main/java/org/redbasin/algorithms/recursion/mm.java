package org.redbasin.algorithms.recursion;

/**
 * Created by manojjoshi on 8/27/17.
 */
public class mm {
    public static int mm(int n) {
        if (n <= 0)
            return 10;
        else
            return n + mm(n-1);
    }

    public static void main(String[] args) {
        System.out.println(mm(6));
    }
}
