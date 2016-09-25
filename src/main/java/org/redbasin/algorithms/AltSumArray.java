package org.redbasin.algorithms;

/**
 * Created by manojjoshi on 9/18/16.
 */
public class AltSumArray {

    public static int computeSum(int[] x) {
        int sum = 0;
        for (int i = 0; i < x.length; i++) {
            sum = sum + x[i] * (int)Math.pow(-1, i);
        }
        return sum;
    }

    public static void main(String[] args) {
        //int[] y = new int[4];   // decl on the heap
        int[] y = {2, 1, 1, -3, 0, 2, -4};  // static initialization
        System.out.println("sum = " + computeSum(y));

    }
}
