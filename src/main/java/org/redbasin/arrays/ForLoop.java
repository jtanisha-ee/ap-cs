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

package org.redbasin.arrays;

/**
 * The first time, the condition is checked after initialization.
 * Then the first iteration executes.
 * Then we increment the i like in i++
 * Then we check the condition i < 2 is still true
 *
 * @author redbasin
 */
public class ForLoop {

    public static void main(String[] args) {

        // dont need to initialize separately, happens within the loop
        for (int i = 0; i < 2; i++) {
            System.out.println(i);
        }
    }

}
