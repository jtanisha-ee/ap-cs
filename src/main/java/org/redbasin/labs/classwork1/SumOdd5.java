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

package org.redbasin.labs.classwork1;

/**
 * Compute the sum of odd numbers between 1 and 100, including 1.
 * 
 * It should print
 * 2500
 * 
 * @author mjoshi
 */
public class SumOdd5 {
    
    public static void main(String[] args) {
        int min = 1;
        int max = 100;
        int sum = 0;
        for (int i = min; i <= max; i++) {
            if (i % 2 == 1)
                sum += i;
        }
        System.out.println(sum);
    }
    
}