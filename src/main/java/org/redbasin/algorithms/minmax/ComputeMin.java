package org.redbasin.algorithms.minmax;

/**
 * Created by manojjoshi on 8/21/16.
 */
public class ComputeMin {

    public static int[] numbers = {3, 8, 1, 5, 4, 3};  // assume all positive numbers
    public static int[] manyNumbers = new int[1000];

    public static int minValue(int[] numbers) {
        int min = Integer.MAX_VALUE;

        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] < min)
                min = numbers[i];
        }

        return min;
    }

    public static void fillRandom(int[] manyNumbers) {
        for (int i = 0; i < manyNumbers.length; i++) {
            int rand = (int) (Math.random() * 1000000);
            manyNumbers[i] = rand;
        }
    }

    public static void main(String[] args) {

        System.out.println("Min value = " + minValue(numbers));

        fillRandom(manyNumbers);

        System.out.println("Min value = " + minValue(manyNumbers));


    }
}
