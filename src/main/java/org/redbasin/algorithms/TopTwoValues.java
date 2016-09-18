package org.redbasin.algorithms;

/**
 * Created by manojjoshi on 8/21/16.
 */
public class TopTwoValues {

    public static int MILLION = 1000000;
    public static int HUNDRED = 100;
    public static int[] numbers = {3, 1, 8, 6, 5, 7,  9, 2};
    public static int[] manyNumbers = new int[MILLION];
    public static int[] someNumbers = new int[HUNDRED];

    public static int[] topTwoValues(int[] numbers) {
        int first = 0;  // assume positive numbers
        int second = 0;
        int[] rankers = new int[2];

        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] > first) {
                second = first;
                first = numbers[i];
            } else {
                if (numbers[i] > second) {
                    second = numbers[i];
                }
            }
        }
        rankers[0] = first;
        rankers[1] = second;
        return rankers;
    }

    public static void fillRandom(int[] numbers) {
        int rand;
        for (int i = 0; i < numbers.length; i++) {
            rand = (int) (Math.random() * 1000);
            numbers[i] = rand;
        }
    }

    public static void main(String[] args) {
        fillRandom(someNumbers);
        int[] rankers = topTwoValues(someNumbers);
        System.out.println("First = " + rankers[0]);
        System.out.println("Second = " + rankers[1]);
    }
}
