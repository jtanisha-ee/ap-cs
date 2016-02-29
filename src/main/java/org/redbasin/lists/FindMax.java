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
public class FindMax {

  public static final int ELEMENTS = 20;

  public static void main(String[] args) {
    List<Integer> list = new ArrayList<>();
    for (int i = 0; i < ELEMENTS; i++) {
      list.add((int)(Math.random() * 100));
    }
    System.out.println(list);

    Integer max = 0;
    for (int i = 0; i < ELEMENTS; i++) {
      if (list.get(i) > max)
        max = list.get(i);
    }

    System.out.println(max);


  }
}
