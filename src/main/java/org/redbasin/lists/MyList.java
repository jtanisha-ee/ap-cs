/*
 * Copyright (C) Tanisha - All Rights Reserved.
 * Unauthorized copying of this file, via any medium is strictly prohibited.
 * Proprietary and confidential.
 */

package org.redbasin.lists;

/**
 * @author tanisha on 1/24/16.
 */
public class MyList {

  Node head = null;
  int len = 0;

  public void add(String weekday) {
    if (head == null) {
      head = new Node(weekday);
      head.prev = null;
      head.next = null;
      len = 1;
    } else {
      Node temp = head;
      while (temp.next != null) {
        temp = temp.next;
      }
      temp.next = new Node(weekday);
      temp.next.next = null;
      temp.next.prev = temp.next;
    }
  }

  public static void main(String[] args) {
    MyList weekdays = new MyList();
    weekdays.add("Monday");
    weekdays.add("Tuesday");
    weekdays.add("Wednesday");

  }
}

class Node {
  public Node prev;
  public Node next;
  public String text;

  public Node(String text) {
    this.text = text;
  }
}
