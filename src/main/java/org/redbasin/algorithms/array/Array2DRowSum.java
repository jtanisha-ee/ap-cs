package org.redbasin.algorithms.array;

/**
 * Created by manojjoshi on 2/5/17.
 */
public class Array2DRowSum {

    /**
     * Outer for loop iterates through rows.
     * Inner for loop iterates through columns in each row.
     * Compute row wise sums and print each row sum
     * Compute the grand total sum of all row sums and print that one too.
     * @param arr
     */
    public static void sum(int[][] arr) {
        int total = 0;
        for (int i = 0; i < arr.length; i++) {
            int rowsum = 0;
            for (int j = 0; j < arr[0].length; j++) {
                rowsum = rowsum + arr[i][j];
            }
            System.out.println("rowsum[" + i + "]" + " = " + rowsum);
            total = total + rowsum;
        }
        System.out.println("total = " + total);
    }

    /**
     * Add all numbers in the 2D array.
     * @param args
     */
    public static void main(String[] args) {

        int[][] x = {
                {2, 4, 3, 2, 6, 7, 1, 3},
                {4, 2, 7, 6, 1, 3, 4, 0},
                {3, 5, 2, 6, 3, 7, 3, 4}
        };
        sum(x);
    }
}
