/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.redbasin.sequences;

/**
 *
 * @author redbasin
 */
public class Fibonacci {

  public static void main(String[] args) {

    int numTerms = 2;
    long x = 1;
    long y = 1;

    System.out.println(x);
    System.out.println(y);

    while (x > 0) {
      x = x + y;
      y = x - y;
      numTerms++;
      System.out.println("My " + numTerms + "th term is " + x);
    }
  }

}
