/*
 * Copyright (C) Tanisha  - All Rights Reserved.
 * Unauthorized copying of this file, via any medium is strictly prohibited.
 * Proprietary and confidential.
 */

package org.redbasin.bitalgebra;

class BitAlgebra {

   public static final int LONG_SIZE = 64;
   public static final int INT_SIZE = 32;
   public static final int SHORT_SIZE = 16;
   public static final int BYTE_SIZE = 8;

   /**
    * Get the bit representation for a int type in Java as
    * a String of 0's and 1's that is in binary notation.
    * The left most
    * bit will be 0, if the number is positive,
    * by definition of numeric types in Java. The left most bit will be 1
    * otherwise.
    */
   public static String getBits(int f, int size) {
      StringBuffer sb = new StringBuffer();
      sb = f < 0 ? sb.append("1") : sb.append("0");
      int mask = 1;
      for (int i = size; i >= 0; i--) {
          int x = (mask<<i & f) == 0 ? 0 : 1;
          sb.append(x);
      }
      return sb.toString();
   }

   /**
    * Get the bit representation for a long type in Java as
    * a String of 0's and 1's that is in binary notation.
    * The left most bit will be 0, if the number is positive,
    * by definition of numeric types in Java. The left most bit will be 1
    * otherwise.
    */
   public static String getBits(long f, int size) {
      StringBuffer sb = new StringBuffer();
      sb = f < 0 ? sb.append("1") : sb.append("0");
      long mask = 1;
      for (int i = size; i >= 0; i--) {
          int x = (mask<<i & f) == 0 ? 0 : 1;
          sb.append(x);
      }
      return sb.toString();
   }

   /**
    * Get the bit representation for a short type in Java as
    * a String of 0's and 1's that is in binary notation.
    * The left most bit will be 0, if the number is positive,
    * by definition of numeric types in Java. The left most bit will be 1
    * otherwise.
    */
   public static String getBits(short f, int size) {
      StringBuffer sb = new StringBuffer();
      sb = f < 0 ? sb.append("1") : sb.append("0");
      short mask = 1;
      for (int i = size; i >= 0; i--) {
          int x = (mask<<i & f) == 0 ? 0 : 1;
          sb.append(x);
      }
      return sb.toString();
   }
   
      /**
    * Get the bit representation for a byte type in Java as
    * a String of 0's and 1's that is in binary notation.
    * The left most bit will be 0, if the number is positive,
    * by definition of numeric types in Java. The left most bit will be 1
    * otherwise.
    */
   public static String getBits(byte f, int size) {
      StringBuffer sb = new StringBuffer();
      sb = f < 0 ? sb.append("1") : sb.append("0");
      byte mask = 1;
      for (int i = size; i >= 0; i--) {
          int x = (mask<<i & f) == 0 ? 0 : 1;
          sb.append(x);
      }
      return sb.toString();
   }

   public static String getBits(long f) {
      return getBits(f, LONG_SIZE-2);
   }

   public static String getBits(int f) {
      return getBits(f, INT_SIZE-2);
   }

   public static String getBits(short f) {
      return getBits(f, SHORT_SIZE-2);
   }

   public static String getBits(byte f) {
      return getBits(f, BYTE_SIZE-2);
   }
   
      /**
    * If we have a string representation of binary digits, and
    * would like to convert them to a decimal, this is a method.
    * for instance "101" converts to decimal 5.
    */
   public static int stringBinaryToDecimal(String s) {
      int sum = 0;
      for (int i = s.length(); i > 0; i--) {
          int num = new Integer(s.substring(i-1,i)).intValue();
          sum += num*Math.pow(2, s.length()-i);
      }
      return sum;
   }
   
      /**
    * The idea is to print out the binary representation of any
    * int that is input in decimal form. If the input is a negative
    * number, please note that we are taken a 1's complement of the
    * number and then adding 1 to it, before attempting to get it's
    * binary digits. But in case of negative input, we also print
    * the 2's complement representation of the digits in binary so
    * we know how it looks.
    */
   public static void main(String[] args) {
      if (args.length == 0) {
         System.out.println("Usage: java BitAlgebra <number>");
         System.exit(1);
      }
      int i = new Integer(args[0]);
      System.out.println("input number = " + i);
      int num;
      int sign = 1;
      String s;
      if (i < 0) {
         s = getBits(i);
                  System.out.println("2's complement bits for negative integer i = " + s);
         sign = -1;
         i = ~i + 1;  // 1's complement + 1
      }
      s = getBits(i);
      System.out.println("bits for positive integer i = " + s);
      System.out.println("original number = " + (sign*stringBinaryToDecimal(s)));
   }
}
