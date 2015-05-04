/*
 * Copyright (C) Tanisha  - All Rights Reserved.
 * Unauthorized copying of this file, via any medium is strictly prohibited.
 * Proprietary and confidential.
 */

package org.redbasin.operators;

/**
 * Notice positioning of space between the operator symbols changes the answer drastically.
 * Here we check out how the precedence changes based on the space, ordering and paranthesis.
 * 
 * Output
 * h = 2, d = 5
   h+ ++d: 8
   h++ +d: 7
   h+++d: 7
   h+(++d): 8
*/
public class PrePostIncreDecreOperators {
    public static void main(String[] args) {
        int h = 2;
        int d = 5;

        System.out.println("h = " + h + ", d = " + d);

        System.out.println("h+ ++d: " + (h+ ++d));

        h = 2;
        d = 5;
        System.out.println("h++ +d: " + (h++ +d));

        h = 2;
        d = 5;
        System.out.println("h+++d: " + (h+++d));

        h = 2;
        d = 5;
        System.out.println("h+(++d): " + (h+(++d)));
    }
}
