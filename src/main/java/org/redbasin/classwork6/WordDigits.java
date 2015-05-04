/*
 * Copyright (C) Tanisha  - All Rights Reserved.
 * Unauthorized copying of this file, via any medium is strictly prohibited.
 * Proprietary and confidential.
 */

package org.redbasin.classwork6;
import java.util.Scanner;
public class WordDigits {
    public static final String[] digits = {"zero", "one", "two",
      "three", "four", "five", "six", "seven", "eight", "nine"};

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String input;
        System.out.print("Spell out a digit: ");
        while (in.hasNextLine()) {
           input = in.nextLine();
           if (input.equals("quit")) break;
           int digit = Integer.parseInt(input);
           if (digit >= digits.length-1) {
              System.out.println("You have entered too big a number");
           } else {
              System.out.println("digit = " + digits[digit]);
           }
           System.out.print("Spell out a digit: ");
        }
    }
}