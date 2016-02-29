/*
 * Copyright (C) Tanisha - All Rights Reserved.
 * Unauthorized copying of this file, via any medium is strictly prohibited.
 * Proprietary and confidential.
 */

package org.redbasin.lists;

import java.util.Scanner;

/**
 * @author tanisha on 1/31/16.
 */
public class PalindromeTest {

  public static boolean isPalindrome(String s) {
    for (int i = 0; i < s.length()/2; i++) {
      if (s.charAt(i) != s.charAt(s.length()-i-1)) {
        return false;
      }
    }
    return true;
  }

  public static void main(String[] args) {

    while (true) {
      System.out.print("Enter a word : ");
      Scanner sc = new Scanner(System.in);
      String s = sc.nextLine();
      boolean is_a_palindrome = isPalindrome(s);
      System.out.println("The word " + s + " is a palindrome " + is_a_palindrome);
    }
  }
}
