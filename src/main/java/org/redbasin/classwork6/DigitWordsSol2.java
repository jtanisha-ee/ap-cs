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

package org.redbasin.classwork6;
import java.util.Scanner;

public class DigitWordsSol2 {
    
    public static final String[] digits = {"zero", "one", "two", "three", "four", 
        "five", "six", "seven", "eight", "nine"};
    
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String input;
        int counter = 0;
        System.out.print("Enter a digit: ");
        while (in.hasNextLine()) {
           input = in.nextLine();
           if (input.equals("quit")) break;
           int digit = Integer.parseInt(input);
           if (digit > digits.length) {
               System.out.println("Digit too large");
           } else {
               System.out.println("digit = " + digits[digit]);
               System.out.print("Enter a digit: ");
           }
        }
    }   
}