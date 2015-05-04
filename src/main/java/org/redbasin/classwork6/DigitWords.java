/*
 * Copyright (C) Tanisha  - All Rights Reserved.
 * Unauthorized copying of this file, via any medium is strictly prohibited.
 * Proprietary and confidential.
 */

package org.redbasin.classwork6;
import java.util.Scanner;
public class DigitWords {
    public static final String[] digits = {"zero", "one", "two",
      "three", "four", "five", "six", "seven", "eight", "nine"};
    public static int getDigit(String digit) {
      for (int i = 0; i < digits.length; i++) {
           if (digit.equals(digits[i])) {
              return i;
           }
      }
      return -2;
    }
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String input;
        System.out.print("Spell out a digit: ");
        while (in.hasNextLine()) {
           input = in.nextLine();
           if (input.equals("quit")) break;
           int digit = getDigit(input);
           if (digit == -2) {
              System.out.println("You have entered an invalid string. Shame on you!");
           } else {
               System.out.println("digit = " + digit);
           }
           System.out.print("Spell out a digit: ");
        }
    }
}