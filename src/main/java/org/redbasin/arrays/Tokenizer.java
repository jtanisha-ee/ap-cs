/*
 * Copyright (C) Tanisha - All Rights Reserved.
 * Unauthorized copying of this file, via any medium is strictly prohibited.
 * Proprietary and confidential.
 */

package org.redbasin.arrays;

/**
 * Take a sentence and tokenize it by words. Put the words in an array.
 *
 * @author tanisha on 1/24/16.
 */
public class Tokenizer {

  public String[] tokenize(String sentence) {
     String[] words = new String[10];
     int j = 0;
     String currentWord = "";
     for (int i = 0; i < sentence.length(); i++) {
       //System.out.print(sentence.charAt(i) + " ");
       if (sentence.charAt(i) != ' ' && sentence.charAt(i) != '.') {
         currentWord = currentWord + sentence.charAt(i);
       } else {
         words[j] = currentWord;
         currentWord = "";
         j++;
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
    String s = "Jack in the box.";

    //System.out.println(s.charAt(3));

    Tokenizer tokenizer = new Tokenizer();
    String[] s1 = tokenizer.tokenize(s);
    tokenizer.dumpArray(s1);
  }


}
