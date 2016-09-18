package org.redbasin.algorithms;

/**
 * Created by manojjoshi on 9/18/16.
 */
public class ArrayProduct {

    public static int computeProduct(int[] x) {
        int sum = 1;
        for (int i = 0; i < x.length; i++) {
            sum = sum * x[i];
        }
        return sum;
    }

    public static void main(String[] args) {
        int[] x = new int[4];   // declared on the heap
        int[] y = {1, 4, 2, 8, -3, 6};  // static initialization

        System.out.println("sum = " + computeProduct(y));
    }
}
