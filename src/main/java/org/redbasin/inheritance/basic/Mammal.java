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
 * A Mammal is_a_type_of Animal.
 *
 * @author redbasin
 */
public class Mammal extends Animal {

    double milkProduced; // volume in cc

    /**
     * All mammals produce milk.
     *
     * @return double
     */
    protected double getMilkProduced() {
        return milkProduced;
    }

    /**
     * The milk produced is not known unless we have a specific mammal.
     *
     * @param m
     */
    protected void setMilkProduced(double m) {
        milkProduced = m;
    }
}
