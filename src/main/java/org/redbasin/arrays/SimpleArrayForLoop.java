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
public class SimpleArrayForLoop {

    public static void main(String[] args) {
        int[][] x = new int[4][4];

        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                 x[i][j] = i + j;
            }
        }

        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                 System.out.print(x[i][j]);
            }
            System.out.println();
        }
    }

}
