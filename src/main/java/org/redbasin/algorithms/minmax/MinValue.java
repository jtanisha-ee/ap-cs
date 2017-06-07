package org.redbasin.algorithms.minmax;

/**
 * Created by manojjoshi on 8/21/16.
 */
public class MinValue {

    public static int MILLION = 1000000;
    public static int HUNDRED = 100;
    public static int[] numbers = {3, 1, 8, 6, 5, 7,  9, 2};
    public static int[] manyNumbers = new int[MILLION];
    public static int[] someNumbers = new int[HUNDRED];

    public static int minValue(int[] numbers) {
        int min = Integer.MAX_VALUE;  // assume positive numbers

        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] < min) {
                min = numbers[i];
            }
        }
        return min;
    }

    public static void fillRandom(int[] numbers) {
        int rand;
        for (int i = 0; i < numbers.length; i++) {
            rand = (int) (Math.random() * 1000);
            numbers[i] = rand;
        }
    }

    public static void main(String[] args) {
        System.out.println("Min value = " + minValue(numbers));

        fillRandom(manyNumbers);

        System.out.println("Min value = " + minValue(manyNumbers));

        fillRandom(someNumbers);

        System.out.println("Min value = " + minValue(someNumbers));

    }
}
