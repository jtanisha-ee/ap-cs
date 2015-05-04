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
 * Compute the product of even numbers between 1 and 100. Figure out 
 * the largest correct product possible. The correct answer is:
 * 185794560
 * 
 * @author mjoshi
 */
public class ProductEven6 {
    
    public static void main(String[] args) {
        int min = 1;
        int max = 100;
        int product = 1;
        for (int i = min; i <= max; i++) {
            if (i % 2 == 0) {
                int aProduct = product * i;
                if (aProduct < 0) {
                    System.out.println("overflow occurs when i = " + i);
                    System.out.println("largest correct product = " + product);
                    break;
                }
                product = aProduct;
            }
        }
    }
}