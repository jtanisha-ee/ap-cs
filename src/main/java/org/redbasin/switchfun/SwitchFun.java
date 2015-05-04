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
package org.redbasin.switchfun;

/**
 *
 * @author mjoshi
 */
public class SwitchFun {
    
    public static void main(String[] args) {
        String weekday = "Mon";
        
        switch (weekday) {
            
            case "Sun" :
                System.out.println("Sunday");
                break;
            case "Mon": case "Tue": case "Wed":
                System.out.println("Chipla");
            default:
                System.out.println("Other day");
                break;
            
        }
        
        int day = 4;
        switch (day) {
            case 0:
                System.out.println("Monday");
                break;
            case 1:
                System.out.println("Tuesday");
                break;
            default:
                System.out.println("Lalla");
        }
        
        // convert above to if else statement
        if (day == 0) {
           System.out.println("Monday"); 
        } else {
            if (day == 1) {
               System.out.println("Tuesday");
            } else {
                System.out.println("Lalla");
            } 
        }
        
        switch (day) {
            case 0:
                System.out.println("Monday");
                break;
            case 1:
                System.out.println("Tuesday");
            default:
                System.out.println("Lalla");
        }
        
        if (day == 0) {
            System.out.println("Monday");
        } else {
            if (day == 1) {
                System.out.println("Tuesday");
                System.out.println("Lalla");
            }
        }
        
        switch (day) {
            case 0:
                System.out.println("Monday");
            case 1:
                System.out.println("Tuesday");
            default:
                System.out.println("Lalla");
        }
        
        if (day == 0) {
            System.out.println("Monday");
            System.out.println("Tuesday");
            System.out.println("Lalla");
        } else if (day == 1) {
            System.out.println("Tuesday");
            System.out.println("Lalla");
        } else {
            System.out.println("Lalla");
        }
        
    }
    
}
