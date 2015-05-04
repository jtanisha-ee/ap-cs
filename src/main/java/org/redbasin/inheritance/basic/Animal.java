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
 * This is the super base class.
 *
 * @author redbasin
 */
public class Animal {

    int numberOfLimbs;

    /**
     * All animals have limbs.
     *
     * @return
     */
    protected int getLimbs() {
        return numberOfLimbs;
    }

    /**
     * These limbs are not settable until we have a specific animal in mind.
     *
     * @param limbs
     */
    protected void setLimbs(int limbs) {
        numberOfLimbs = limbs;
    }
}
