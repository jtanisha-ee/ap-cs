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
 * A Human is_a_type_of Mammal.
 *
 * @author redbasin
 */
public class Human extends Mammal {

    /**
     * Note we know the number of limbs, fingers and milk produced
     * only when we create the instance of Human, even though the actual
     * attributes are defined in the base class.
     */
    public Human() {
        setLimbs(2);
        setFingers(5);
        setMilkProduced(1000);
    }

    int numFingers; // volume in cc

    public int getFingers() {
        return numFingers;
    }

    public void setFingers(int digits) {
        numFingers = digits;
    }

}

