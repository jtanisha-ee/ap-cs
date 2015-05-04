/*
 * Copyright (C) Tanisha (aceso1999@gmail.com) - All Rights Reserved.
 * Unauthorized copying of this file, via any medium is strictly prohibited.
 * Proprietary and confidential.
 */

package org.redbasin.freeresponse.test2;

/**
 * Prints the following output:
 *
 * 34:THIRTY FOUR
 35:THIRTY FIVE
 36:THIRTY SIX
 37:THIRTY SEVEN
 38:THIRTY EIGHT
 39:THIRTY NINE
 40:FORTY
 41:FORTY ONE
 42:FORTY TWO
 43:FORTY THREE
 44:FORTY FOUR
 45:FORTY FIVE
 46:FORTY SIX
 47:FORTY SEVEN

 * @author tanisha on 4/26/15.
 */
public class PrintNumbers {

  public static final String[] TENS_STRINGS = {"", "", "TWENTY", "THIRTY", "FORTY", "FIFTY", "SIXTY", "SEVENTY", "EIGHTY", "NINETY"};
  public static final String[] UNITS_STRINGS = {"", "ONE", "TWO", "THREE", "FOUR", "FIVE", "SIX", "SEVEN", "EIGHT", "NINE"};
  public static final int LOWER = 20;
  public static final int UPPER = 99;

  public static int firstDigit(int no) {
    return no/10;
  }

  public static int secondDigit(int no) {
    return no%10;
  }

  public static void printNumbers(int lower, int upper) {
    if ((lower < LOWER) || (upper > UPPER)) throw new IllegalArgumentException("Invalid range");
    for (int i = lower; i <= upper; i++) {
      System.out.println(i + ":" + TENS_STRINGS[firstDigit(i)] + " " + UNITS_STRINGS[secondDigit(i)]);
    }
  }

  public static void main(String[] args) {
    printNumbers(34, 47);
    //printNumbers(19, 45);
  }
}
