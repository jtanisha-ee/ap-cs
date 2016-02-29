/*
 * Copyright (C) Tanisha - All Rights Reserved.
 * Unauthorized copying of this file, via any medium is strictly prohibited.
 * Proprietary and confidential.
 */

package org.redbasin.maps;

import java.util.*;

/**
 * @author tanisha on 2/28/16.
 */
public class MapTest {

  public static void main(String[] args) {
    Map<Integer, String> map = new HashMap<>();
    map.put(83056, "John Doe");
    map.put(83057, "Frank Zappa");
    map.put(83058, "Manoj Joshi");
    map.put(83061, "Ethan Li");
    map.put(83064, "Jonathan Zhao");
    map.put(83068, "John Ceena");
    System.out.println(map);   // only 2 entries in the map

    String name = map.get(83057);
    System.out.println("name = " + name);

    List<Integer> keys = new ArrayList<>();

    // how do you remove an entry by name and not by id?
    Iterator<Integer> iter = map.keySet().iterator();
    while (iter.hasNext()) {
      Integer studentId = iter.next();
      String studentName = map.get(studentId);
      if (studentName.equals("John Doe")) {
        keys.add(studentId);
      }
    }

    for (Integer studentId : keys) {
      map.remove(studentId);
    }

    System.out.println(map);

  }
}
