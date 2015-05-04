/*
 * Copyright (C) Tanisha  - All Rights Reserved.
 * Unauthorized copying of this file, via any medium is strictly prohibited.
 * Proprietary and confidential.
 */

package org.redbasin.arrays;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 * The ijth cell has i+j in it.
 *
 * @author redbasin
 */
public class SimpleArray {

    public static void main(String[] args) {
        int[][] x = new int[4][4];
        int i = 0;
        while (i < 4) {
            int j = 0;
            while (j < 4) {
                 x[i][j] = i + j;
                 j++;
            }
            i++;
        }

        i = 0;
        while (i < 4) {
            int j = 0;
            while (j < 4) {
                 System.out.print(x[i][j]);
                 j++;
            }
            System.out.println();
            i++;
        }
    }

}