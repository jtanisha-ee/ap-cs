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
 * Reverse characters in the String “computation” and print it.
 * Reverse it a second time to get back the original String.
 * 
 * @author mjoshi
 */
public class ReverseString8 {
    
    public static void main(String[] args) {
        String input = "computation";
        String reversed = "";
        for (int i = input.length()-1; i >= 0; i--) {
            reversed += input.charAt(i);
        }
        System.out.println(reversed);
        
        String original = "";
        for (int i = reversed.length()-1; i >= 0; i--) {
            original += reversed.charAt(i);
        }
        System.out.println(original);
    }
}