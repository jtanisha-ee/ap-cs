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

package org.redbasin.classwork1;

/**
 * Given number compute the sum of digits. For example if the number is 419 the output should be 

14

 * @author mjoshi
 */
public class DigitPlay4 {
    
    public static final int BASE = 10;
    
    public static void main(String[] args) {
        
        // Pick an input number
        int number = 427;
        
        // Start with a divisor of 1, so we can multiply by BASE each time
        // resulting in 10, 100, 1000, and so on.
        int divisor = 1;
        
        // If number is equal to 0, we do not use the loop below. We just print
        // 0 as the sum and exit.
        if (number == 0) {
            System.out.println(number);
            System.exit(0);
        }
        
        /* We keep dividing the number by the divisor until the value is 0
           This is due to integer division where the fraction between 0 and 1
           is truncated to 0
           Inside the while loop we do a modulus to give us the remainder
           For instance 723%10 is 3 which gives us first digit
           723/10 = 72
           72%10 = 2 which gives us the second digit
           723/100 = 7
           7%10 = 7 which gives us the third digit
           723/1000 = 0, and we stop the while loop here
           At each step we compute the sum from the digit extracted.
        */
        int sum = 0;
        while (number/divisor != 0) {
            int digit = number/divisor % BASE;
            sum += digit;
            divisor *= BASE;
        }
        System.out.println(sum);
    }
}