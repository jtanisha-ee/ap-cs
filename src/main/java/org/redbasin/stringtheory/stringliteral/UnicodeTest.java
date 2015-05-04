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

package org.redbasin.stringtheory.stringliteral;

/**
 * Print all the greek alphabets.
 * @author redbasin
 */
public class UnicodeTest {
   public static void main(String[] args) {
     for (char c = 0x0370; c <= 0x03FF; c++) {
        System.out.println(c);
     }
   }
}
