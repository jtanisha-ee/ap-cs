/*
 * Copyright (C) Tanisha  - All Rights Reserved.
 * Unauthorized copying of this file, via any medium is strictly prohibited.
 * Proprietary and confidential.
 */

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package org.redbasin.algorithms.words;

import java.util.Scanner;
import java.util.StringTokenizer;

/**
 *
 * @author mjoshi
 */
public class DigitWords {
    
    public static final String[] digits = {"zero", "one", "two", "three", "four"};
    
    public static int getDigit(String digit) {
        for (int i = 0; i < digits.length; i++) {
            if (digits[i].equals(digit)) {
                return i;
            }
        }
        return 0;
    }
    
/**
 * Reverse characters in the input String and print it.
 * 1. Type thi
 * 2. 
 * @author mjoshi
 */
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String input;
        int counter = 0;
        System.out.print("Can I help you? ");
        while (in.hasNextLine()) {
           input = in.nextLine();
           if (input.equals("quit")) break;
           
           StringTokenizer st = new StringTokenizer(input, " ");
           int numTokens = 0;
           int sum = 0;
           while (st.hasMoreTokens()) {
               numTokens++;
               if (numTokens > 3) {
                   System.out.println("Too many tokens");
               }
               String token = st.nextToken();
               if (numTokens == 1 || numTokens == 3) {
                   System.out.println("token = " + token);
                   sum += getDigit(token);
               } else {
                   if (!token.equals("+")) {
                       System.out.println("Only + operator supported ");
                       break;
                   }
                   
               }
           }
           System.out.println("Sum = " + digits[sum]);
           System.out.print("Can I help you? ");
        }
    }
    
}
