/*
 * Copyright (C) Tanisha - All Rights Reserved.
 * Unauthorized copying of this file, via any medium is strictly prohibited.
 * Proprietary and confidential.
 */

package org.redbasin.arrays;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * Take a sentence and tokenize it by words. Put the words in an array.
 *
 * @author tanisha on 1/24/16.
 */
public class ListTokenizer {

  public List<String> tokenize(String sentence) {
     List<String> words = new ArrayList<>();
     String currentWord = "";
     for (int i = 0; i < sentence.length(); i++) {
       if (sentence.charAt(i) != ' ' && sentence.charAt(i) != '.') {
         currentWord = currentWord + sentence.charAt(i);
       } else {
         words.add(currentWord);
         currentWord = "";
       }
     }
    return words;
  }

  public void dumpArray(String[] words) {
    for (int i = 0; i < words.length; i++) {
      if (words[i] != null)
        System.out.print(words[i] + " ");
    }
  }

  public static void main(String[] args) {
    //String s = "Jack in the box.";
    System.out.print("Please type a sentence: ");
    Scanner in = new Scanner(System.in);
    String s = "";
    if (in.hasNextLine()) {
      s = in.nextLine();
    }
    ListTokenizer tokenizer = new ListTokenizer();
    List<String> s1 = tokenizer.tokenize(s);
    System.out.println(s1);
    //tokenizer.dumpArray(s1);
  }


}
