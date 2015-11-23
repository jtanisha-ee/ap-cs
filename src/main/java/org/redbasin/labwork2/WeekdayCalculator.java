/*
 * Copyright (C) Tanisha  - All Rights Reserved.
 * Unauthorized copying of this file, via any medium is strictly prohibited.
 * Proprietary and confidential.
 */

package org.redbasin.labwork2;

import java.util.Scanner;

public class WeekdayCalculator {

  private static String[] monthName = {"", "Jan", "Feb", "Mar", "Apr", "May", "Jun", "Jul", "Aug", "Sep", "Oct", "Nov", "Dec"};

  private static int[] monthOffset = {-1, 1, 4, 4, 0, 2, 5, 0, 3, 6, 1, 4, 6};

  private static String[] weekdayName = {"", "Sun", "Mon", "Tue", "Wed", "Thu", "Fri", "Sat"};

  public static void main(String[] args) {
    Scanner keyboard = new Scanner(System.in);

    System.out.println("Welcome to Mr. Mitchell's fantastic birth-o-meter!");
    System.out.println();
    System.out.println("All you have to do is enter your birth date, and it will");
    System.out.println("tell you the day of the week on which you were born.");
    System.out.println();
    System.out.println("Some automatic tests....");
    System.out.println("12 10 2003 => " + weekday(12, 10, 2003));
    System.out.println(" 2 13 1976 => " + weekday(2, 13, 1976));
    System.out.println(" 2 13 1977 => " + weekday(2, 13, 1977));
    System.out.println(" 7  2 1974 => " + weekday(7, 2, 1974));
    System.out.println(" 1 15 2003 => " + weekday(1, 15, 2003));
    System.out.println("10 13 2000 => " + weekday(10, 13, 2000));
    System.out.println();

    System.out.println("Now it's your turn!  What's your birthday?");
    System.out.print("Birth date (mm dd yyyy): ");
    int mm = keyboard.nextInt();
    int dd = keyboard.nextInt();
    int yyyy = keyboard.nextInt();

    // put a function call for weekday() here
    System.out.println("You were born on " + weekday(mm, dd, yyyy));
  }

  public static String weekday(int mm, int dd, int yyyy) {
    int yy, total;
    String date = "";

    // bunch of calculations go here
    yy = yyyy - 1900;
    total = yy/4;
    total = total + yy;
    total = total + dd;
    total = total + monthOffset[mm];
    if (is_leap(yyyy) && (mm == 1 || mm == 2)) {
      total = total - 1;
    }
    String day = weekdayName[total % 8];

    date = day + ", " + monthName[mm] + ", " + dd + ", " +  yyyy;

    return date;
  }


  public static boolean is_leap(int year) {
    // years which are evenly divisible by 4 are leap years,
    // but years divisible by 100 are not leap years,
    // though years divisible by 400 are leap years
    boolean result;

    if (year % 400 == 0)
      result = true;
    else if (year % 100 == 0)
      result = false;
    else if (year % 4 == 0)
      result = true;
    else
      result = false;

    return result;
  }
}
