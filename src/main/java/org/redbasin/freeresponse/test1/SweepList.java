/*
 * Copyright (C) Tanisha (aceso1999@gmail.com) - All Rights Reserved.
 * Unauthorized copying of this file, via any medium is strictly prohibited.
 * Proprietary and confidential.
 */

package org.redbasin.freeresponse.test1;

import java.util.ArrayList;
import java.util.List;

/**
 * @author tanisha on 4/19/15.
 */
public class SweepList {
  private Palindrome palindrome = new Palindrome();

  public List<String> sweepList(List<String> list) {
    for (int i = list.size()-1; i >= 0; i--) {
      if (palindrome.isPalindrome(list.get(i))) {
        list.remove(i);
      }
    }
    return list;
  }

  public static void main(String[] args) {
    List<String> list = new ArrayList<String>();
    list.add("level");
    list.add("garage");
    list.add("radar");
    list.add("system");
    list.add("radio");
    list.add("rotator");
    System.out.println("Original List = " + list.toString());
    List<String> modifiedList = new SweepList().sweepList(list);
    System.out.println("Modified List = " + modifiedList.toString());
  }
}
