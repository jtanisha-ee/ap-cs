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
 * Step 2: Insert them into a list (Java List object)
 * Step 3: Output the List to the console.
 * Step 4: Create a reverse List from the generated List.
 * Step 5: Output the reverse List to the console.
 *
 * @author tanisha on 2/28/16.
 */
public class ReverseList {

  public static void main(String[] args) {

    List<Integer> list = new ArrayList<>();

    for (int i = 0; i < 20; i++) {
      list.add((int) (Math.random() * 100));
    }
    System.out.println(list);
    
    List<Integer> reverseList = new ArrayList<>();
    for (int i = 19; i >= 0; i--) {
      reverseList.add(list.get(i));
    }
    System.out.println(reverseList);
  }
}
