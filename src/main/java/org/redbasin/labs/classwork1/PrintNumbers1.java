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
 * Output
 * 3 + 7 = 10
 * WRONG!!: 3 + 7 = 37
 * @author mjoshi
 */
public class PrintNumbers1 {

    public static void main(String args[]) {
        int x = 3;
        int y = 7;
        // Correct way of doing it
        System.out.println(x + " + " + y + " = " + (x+y));

        // Note the parenthesis around x+y! If you skip the paranthesis
        // what would the result look like
        // Wrong way of doing it
        System.out.println("WRONG!!: " + x + " + " + y + " = " + x+y);
    }
}