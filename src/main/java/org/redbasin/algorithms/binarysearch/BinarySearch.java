package org.redbasin.algorithms.binarysearch;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * Created by jtanisha-ee on 7/31/16.
 */
public class BinarySearch {

    /**
     * Array is always assumed to be sorted when performing binary search
     */
    private static char[] letters = {'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h'};

    private static List<Integer> numbers = new ArrayList<>();
    private static final int HUNDRED = 100;
    private static final int MILLION = 1000000;


    public static void populate(List<Integer> numbers) {
        for (int i = 0; i < MILLION; i++) {
            double d = Math.random();  // this returns a random double between 0 and 1
            int j = (int) (d * HUNDRED);    // 1 billion fits in an int, so no overflow possible
            numbers.add(j);
        }
        Collections.sort(numbers);
    }

    public static int findLetter(char x) {
        int left = 0;
        int right = letters.length - 1;
        int middle = (left+right)/2;
        int newMiddle;

        int count = 0;

        while (true) {
            if (x < letters[middle]) {
                right = middle;
            } else if (x > letters[middle]) {
                left = middle;
            } else {
                return middle;
            }

            newMiddle = (left+right)/2;
            if (newMiddle == middle) {
                System.out.println("Did not find " + x);
                return -1;
            }
            middle = newMiddle;
        }
    }

    public static int findElement(int x) {
        int left = 0;
        int right = numbers.size() - 1;
        int middle = (left+right)/2;
        int newMiddle;

        int count = 0;

        while (true) {
            if (x < numbers.get(middle).intValue()) {
                right = middle;
            } else if (x > numbers.get(middle).intValue()) {
                left = middle;
            } else {
                return middle;
            }

            newMiddle = (left+right)/2;
            if (newMiddle == middle) {
                System.out.println("Did not find " + x);
                return -1;
            }
            middle = newMiddle;
        }
    }

    public static void main(String[] args) {

        populate(numbers);
        int ind1 = findElement(67);
        System.out.println("Found the index of the number " + ind1);

        int ind = findLetter('A');
        System.out.println("The letter index is " + ind);
    }

}
