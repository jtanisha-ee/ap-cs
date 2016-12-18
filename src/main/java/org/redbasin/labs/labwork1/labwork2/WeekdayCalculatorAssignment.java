/*
 * Copyright (C) Tanisha - All Rights Reserved.
 * Unauthorized copying of this file, via any medium is strictly prohibited.
 * Proprietary and confidential.
 */

package org.redbasin.labs.labwork1.labwork2;

import java.util.Scanner;

public class WeekdayCalculatorAssignment {

  private static String[] monthName = {"", "Jan", "Feb", "Mar", "Apr", "May", "Jun", "Jul", "Aug", "Sep", "Oct", "Nov", "Dec"};

  private static int[] monthOffset = {-1, 1, 4, 4, 0, 2, 5, 0, 3, 6, 1, 4, 6};

  private static String[] weekdayName = {"Sat", "Sun", "Mon", "Tue", "Wed", "Thu", "Fri"};

  public static void main(String[] args) {
    Scanner keyboard = new Scanner(System.in);

    System.out.println("Welcome to the Birthday Calculator!");
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

    // bunch of calculations go here, please read the following steps and implementing the logic

    /*
    1. Find the number of years since 1900, and put it into a variable called yy. Simply subtract 1900 from the year to get this.
    2. Divide the number of years since 1900 by 4. Put the quotient in a variable called total. For example, if the person was born in 1983, divide 83 by 4 and store 20 in total.
    3. Also add the number of years since 1900 to total.
    4. Add the day of the month to total.
    5. Using the array monthOffset, find the "month offset" and add it to total.
    6. If the year is a leap year and if the month you are working with is either January or February, then subtract 1 from the total. You can use the function is_leap() provided to determine if the year is a leap year.
    7. Find the remainder when total is divided by 7. Pass this remainder to the array weekdayName you wrote to determine the day of the week the person was born.
    8. Finally, build up a single String value containing the whole date (day of week, month, day, year). You'll need to use the array monthName to show the month name rather than its number.
    9. Return that String value.
     */

    yy = yyyy - 1900;
    total = yy/4;
    total = yy + total;
    total = dd + total;
    total = monthOffset[mm] + total;
    if (is_leap(yyyy) && (mm == 1 || mm == 2)) {
      total = total - 1;
    }
    String day = weekdayName[total % 7];

    date = day + ", " + mm + ", " + dd + ", " + yyyy;

    return date;
    //return "Haha! You need to implement this :-)";
  }


  public static boolean is_leap(int year) {
    // years which are evenly divisible by 4 are leap years,
    // but years divisible by 100 are not leap years,
    // though years divisible by 400 are leap years

    boolean result = false;

    if (year % 400 == 0)
      result = true;
    else if (year % 100 == 0)
      result = false;
    else if (year % 4 == 0)
      result = true;
    else result = false;

    return result;
  }
}
