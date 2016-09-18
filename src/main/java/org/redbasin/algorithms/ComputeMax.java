package org.redbasin.algorithms;

/**
 * Created by manojjoshi on 8/21/16.
 */
public class ComputeMax {

    public static int[] numbers = {3, 8, 1, 5, 4, 3};  // assume all positive numbers

    public static int maxValue(int[] numbers) {
        int max = 0;

        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] > max)
                max = numbers[i];
        }

        return max;
    }

    public static void main(String[] args) {
        System.out.println("Max value = " + maxValue(numbers));
    }
}
