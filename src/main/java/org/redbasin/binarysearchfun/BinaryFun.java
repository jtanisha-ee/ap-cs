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
package org.redbasin.binarysearchfun;

/**
 * Print the index of the target within a list.
 * ``
 * @author mjoshi
 */
public class BinaryFun {
    
    public static void main(String[] args) {
        // assume they are sorted, and the numbers are unique
        int[] pages = {1, 4, 8, 9, 13, 21, 24, 25, 29, 31, 37, 71, 83, 94};

        int target = 216;  // actual value to be searched

        // left, right and middle are indices
        int left = 0;                // index and not value
        int right = pages.length;
        int middle;
        while (left < right) {
            middle = (left + right)/2;
            System.out.println("left = " + left + ", right = " + right + ", middle = " + middle);
            if (target > pages[middle]) {
                left = middle;
            } else if (target < pages[middle]) {
                right = middle;
            } else {
                // we found the number
                System.out.println("index of " + target + " = " + middle);
                break;
            }
            if ((left == right) || ((left+1) == right)) {
                System.out.println("Did not find the target.");
                break;
            }
        }
    }

}
