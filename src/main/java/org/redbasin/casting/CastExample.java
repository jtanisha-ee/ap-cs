/*
 * Copyright (C) Tanisha  - All Rights Reserved.
 * Unauthorized copying of this file, via any medium is strictly prohibited.
 * Proprietary and confidential.
 */

package org.redbasin.casting;

/**
 * It is necessary to learn how to do casting with an example that shows how the integer truncation can make it hard
 * to compute average.
 */
public class CastExample {

   /**
    * Compute the average age.
    */
   public static double avgAge(int[] ages) {
      int sum = 0;
      for (int i = 0; i < ages.length; i++) {
         sum += ages[i];
      }
      return (double)sum/ages.length;   // we cast here with double so the truncation does not happen
   }
   
   /**
    * Pick an example set of students in a class with representative ages.
    * We will compute the average age which needs to be a double and not an int.
    */
   public static void main(String[] args) {
      int[] ages = {12, 11, 12, 12, 11, 11};
      System.out.println(avgAge(ages));
   }
}
