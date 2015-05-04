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

package org.redbasin.stringtheory;

/**
 * The char type is unsigned, and can be used to store positive numbers.
 * The ordinal of the specific character is the number corresponding to that
 * char. char is represented as a literal using single quote.
 *
 * The output is:
 *
 * Char = )
 * Number = 41
 *
 * @author redbasin
 */
public class MyChar {
     public static void main(String[] args) {
        // The char c when set to 41 really represents the ')'
        char c = 41;
        System.out.println("Char = " + c);

        c = ')';

        // Alternatively can convert a character ')' to a number 41.

        int i = (int)c;
        System.out.println("Number = " + i);
    }
}
