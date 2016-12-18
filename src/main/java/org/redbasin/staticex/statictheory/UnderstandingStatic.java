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

package org.redbasin.staticex.statictheory;

/**
 * Understanding static variables.
 * Note that the static color variable is shared across two instances of
 the UnderstandingStatic class.
 *
 * @author redbasin
 */
class UnderstandingStatic {

    static public String color = "red";

    public static void main(String[] args) {
        UnderstandingStatic m1 = new UnderstandingStatic();
        m1.color = "green";
        System.out.println(m1.color);
        UnderstandingStatic m2 = new UnderstandingStatic();
        m2.color = "yellow";
        System.out.println(m2.color);
         System.out.println(m1.color);

    }

}
