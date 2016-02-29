/*
 * Copyright (C) Tanisha - All Rights Reserved.
 * Unauthorized copying of this file, via any medium is strictly prohibited.
 * Proprietary and confidential.
 */

package org.redbasin.lists;

import java.util.ArrayList;
import java.util.List;

/**
 * @author tanisha on 1/24/16.
 */
public class ListExperiment {

  public static void main(String[] args) {
    List<String> weekdays = new ArrayList<>();
    weekdays.add("Monday");   // "Monday" is a String
    weekdays.add("Wednesday");
    weekdays.add("Tuesday");
    weekdays.add("Thursday");
    weekdays.add("Friday");
    System.out.println(weekdays);

    System.out.println(weekdays.get(2));

    String tuesday = weekdays.get(2);
    weekdays.add(1, tuesday);
    System.out.println(weekdays);
    weekdays.remove(3);
    System.out.println(weekdays);
  }
}
