/*
 * Copyright (C) Tanisha - All Rights Reserved.
 * Unauthorized copying of this file, via any medium is strictly prohibited.
 * Proprietary and confidential.
 */

package org.redbasin.cast;

/**
 * @author tanisha on 1/17/16.
 */
public class CastTest {
  public static void main(String[] args) {
    double d;

    d = 5/2;
    System.out.println("Integer Division: d = " + d);

    // how do we do double division?
    // here are the following ways
    d = 5.0/2;
    System.out.println("Only Num hints d = " + d);   // den gets promoted to double

    d = 5/2.0;
    System.out.println("Only Den hints d = " + d);

    d = 5.0/2.0;
    System.out.println("Num and Den hints d = " + d);

    d = (double)5/2;
    System.out.println("explicit casting num d = " + d);

    d = 5/(double)2;
    System.out.println("explicit casting den d = " + d);

  }
}
