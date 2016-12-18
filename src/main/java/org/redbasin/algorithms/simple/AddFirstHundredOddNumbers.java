/*
 * Copyright (C) Tanisha  - All Rights Reserved.
 * Unauthorized copying of this file, via any medium is strictly prohibited.
 * Proprietary and confidential.
 */

package org.redbasin.algorithms.simple;
public class AddFirstHundredOddNumbers {
    public static final int START_NUMBER = 1;
    public static final int NUM_ADDITIONS = 100;
    public static int addOddNumbers() {
        int number = START_NUMBER;
        int sum = 0;
        int additions = 0;
        while (additions <= NUM_ADDITIONS) {
           sum += number;
           additions++;
           number += 2;
        }
        System.out.println("additions = " + (additions-1));
        return sum;
    }
    public static void main(String[] args) {
        int mySum = addOddNumbers();
        System.out.println("Correct Sum = " + mySum);
    }
}