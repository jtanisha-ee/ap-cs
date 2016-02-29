/*
 * Copyright (C) Tanisha - All Rights Reserved.
 * Unauthorized copying of this file, via any medium is strictly prohibited.
 * Proprietary and confidential.
 */

package org.redbasin.lists;


import java.util.ArrayList;
import java.util.List;

/**
 * Step 1: Generate a set of 20 random numbers between 1..100.
 * Step 2: Output the numbers to the console.
 * Step 3: Compute avg of elements.
 * Step 4: Output the avg to the console.
 *
 * @author tanisha on 2/28/16.
 */
public class FindTopThree {

  public static final int ELEMENTS = 20;

  public static void main(String[] args) {
    List<Integer> list = new ArrayList<>();
    for (int i = 0; i < ELEMENTS; i++) {
      list.add((int)(Math.random() * 100));
    }
    System.out.println(list);

    int first = 0;
    int second = 0;
    int third = 0;
    for (int i = 0; i < ELEMENTS; i++) {
      int current = list.get(i);
      if (current > first) {
        third = second;
        second = first;
        first = current;
      } else {  // <= first
        if (current > second) {
          third = second;
          second = current;
        } else {  // <= second
          if (current > third) {
            third = current;
          }
        }
      }
    }
    System.out.println("first = " + first + ", second = " + second + ", third = " + third);

  }
}
