/*
 * Copyright (C) Tanisha - All Rights Reserved.
 * Unauthorized copying of this file, via any medium is strictly prohibited.
 * Proprietary and confidential.
 */

package org.redbasin.arrays;

import java.util.Scanner;

/**
 * @author tanisha on 1/17/16.
 */
public class ArrayFun {

  // test commit
  // 1 dim array that stores weekdays
  static String[] weekdays = {"Mon", "Tue", "Wed", "Thu", "Fri", "Sat"};

  public static String getWeekDay(int weekdayNo) {
    return weekdays[weekdayNo];
  }

  public static void main(String[] args) {
    for (int i = 0; i < weekdays.length; i++) {
      System.out.println(getWeekDay(i));
    }

  }
}
