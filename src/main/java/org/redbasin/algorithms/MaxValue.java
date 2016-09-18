package org.redbasin.algorithms;

/**
 * Created by manojjoshi on 8/21/16.
 */
public class MaxValue {

    public static int MILLION = 1000000;
    public static int HUNDRED = 100;
    public static int[] numbers = {3, 1, 8, 6, 5, 7,  9, 2};
    public static int[] manyNumbers = new int[MILLION];
    public static int[] someNumbers = new int[HUNDRED];

    public static int maxValue(int[] numbers) {
        int max = 0;  // assume positive numbers

        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] > max) {
                max = numbers[i];
            }
        }
        return max;
    }

    public static void fillRandom(int[] numbers) {
        int rand;
        for (int i = 0; i < numbers.length; i++) {
            rand = (int) (Math.random() * 1000);
            numbers[i] = rand;
        }
    }

    public static void main(String[] args) {
        System.out.println("Max value = " + maxValue(numbers));

        fillRandom(manyNumbers);

        System.out.println("Max value = " + maxValue(manyNumbers));

        fillRandom(someNumbers);

        System.out.println("Max value = " + maxValue(someNumbers));

    }
}
