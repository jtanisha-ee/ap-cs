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

package org.redbasin.castingbasics.casting.cast;

/**
 *
 * @author redbasin
 */
public class SimpleCast {

     public static double getDouble(int y, int x) {
         return y/x;
     }

     public static void main(String[] args) {
         int y = 5;
         int x = 3;
         double z = getDouble(y, x);
         System.out.println(getDouble(5, 3));

         double d1 = 4;
         x = (int)d1/2;
         System.out.println(x);

     }
}
