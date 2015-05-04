/*
 * Copyright (C) Tanisha  - All Rights Reserved.
 * Unauthorized copying of this file, via any medium is strictly prohibited.
 * Proprietary and confidential.
 */

package org.redbasin.math;

/**
 * How do you generate 200 random numbers between 3 and 10?
 */
public class RandomNumbers {

   public static void main(String[] args) {
      for (int i = 0; i < 200; i++) {
         System.out.println(3 + 7*Math.random());
      }
   }
}
