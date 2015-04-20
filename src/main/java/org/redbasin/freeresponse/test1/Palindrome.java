/*
 * Copyright (C) Tanisha (aceso1999@gmail.com) - All Rights Reserved.
 * Unauthorized copying of this file, via any medium is strictly prohibited.
 * Proprietary and confidential.
 */

package org.redbasin.freeresponse.test1;

/**
 * @author tanisha on 4/19/15.
 */
public class Palindrome {
  public boolean isPalindrome(String word) {
    int len = word.length();
    for (int i = 0; i < len; i++) {
      if (i > (len+1)/2) break;
      String char1 = word.substring(len-i-1, len-i);
      String char2 = word.substring(i, i+1);
      if (!char1.equals(char2)) return false;
    }
    return true;
  }

  public static void main(String[] args) {
    Palindrome p = new Palindrome();
    System.out.println(p.isPalindrome("level"));

  }
}
