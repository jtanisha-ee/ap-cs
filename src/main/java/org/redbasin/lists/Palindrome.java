/*
 * Copyright (C) Tanisha - All Rights Reserved.
 * Unauthorized copying of this file, via any medium is strictly prohibited.
 * Proprietary and confidential.
 */

package org.redbasin.lists;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * @author tanisha on 1/31/16.
 */
public class Palindrome {

  public boolean isPalindrome(List<Character> word) {
     for (int i = 0; i < word.size()/2; i++) {
       if (!word.get(i).equals(word.get(word.size()-i-1))) {
         return false;
       }
     }
    return true;
  }

  public static void main(String[] args) {
    Palindrome palindrome = new Palindrome();
    List<Character> input = new ArrayList<>();

    while (true) {
      System.out.println("Enter a word: ");
      Scanner sc = new Scanner(System.in);
      String s = sc.nextLine();
      if (s != null) {
        for (int i = 0; i < s.length(); i++) {
          input.add(s.charAt(i));
        }
      }

      System.out.println(input + " Is a palindrome? " + palindrome.isPalindrome(input));
    }
  }
}
