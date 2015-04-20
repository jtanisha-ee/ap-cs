/*
 * Copyright (C) Tanisha (aceso1999@gmail.com) - All Rights Reserved.
 * Unauthorized copying of this file, via any medium is strictly prohibited.
 * Proprietary and confidential.
 */

package org.redbasin.freeresponse.test1;

/**
 * @author tanisha on 4/19/15.
 */
public class TreeSum {

  public double sum(Node seed) {
    double total = seed.getValue();
    if (seed.leftChild != null) {
      total += sum(seed.leftChild);
    }
    if (seed.rightChild != null) {
      total += sum(seed.rightChild);
    }
    return total;
  }



  public static void main(String[] args) {
    Node a = new Node(4.0);
    Node b = new Node(5.1);
    a.leftChild = b;
    Node c = new Node(3.3);
    a.rightChild = c;
    Node g = new Node(2.0);
    Node f = new Node(4.3);
    b.leftChild = g;
    b.rightChild = f;
    Node h = new Node(5.1);
    f.leftChild = h;
    Node e = new Node(6.0);
    Node d = new Node(7.5);
    Node i = new Node(7.0);
    c.leftChild = e;
    c.rightChild = d;
    d.rightChild = i;
    System.out.println(new TreeSum().sum(a));
  }
}

class Node {
  public double value;
  public Node leftChild;
  public Node rightChild;
  public Node(double value) {
    this.value = value;
  }
  public boolean isWhole(double d) {
    return Math.ceil(d) == d;
  }
  public double getValue() {
    if (isWhole(value)) return value;
    return 0;
  }
}
