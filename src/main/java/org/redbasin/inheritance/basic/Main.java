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

package org.redbasin.inheritance.basic;

/**
 * We created a Main class, but we don't have to. Just for convenience
 * and separation from the inheritance tree.
 *
 * @author redbasin
 */
public class Main {

    public static void main(String[] args) {
        // Create a specific human
        Human mary = new Human();

        System.out.println("limbs = " + mary.getLimbs());
        System.out.println("milk = " + mary.getMilkProduced());
        System.out.println("fingers = " + mary.getFingers());
    }
}
