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

package org.redbasin.labs.labwork1;

import java.util.Scanner;

/**
 *
 * @author redbasin
 */
public class ReverseInputStringDone {
   public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String input;
        int j = 0;
        while (in.hasNextLine()) {
           // Reads a single line from the console
           // and stores into name variable
           input = in.nextLine();
           if (input.equals("quit")) break;
           if (++j > 4) break;
           String s = "";
           for (int i = input.length()-1; i >= 0; i--) {
               s += input.charAt(i);
           }
           System.out.println(s);
           String q = "";
           for (int i = s.length()-1; i >= 0; i--) {
               q += s.charAt(i);
           }
           System.out.println(q);
        }
    }
}
