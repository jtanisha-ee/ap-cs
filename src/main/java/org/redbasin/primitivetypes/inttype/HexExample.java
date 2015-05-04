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

package org.redbasin.primitivetypes.inttype;

/**
 * A hex number is represented as starting from "0x" followed by the actual hex
 * digits. Both "ff" and "FF" are allowed. When printed the actual decimal number
 * is printed.
 *
 * Example output:
 * dec rep = 255
 *
 * @author redbasin
 */
public class HexExample {
     public static void main(String[] args) {
        int i = 0xff;
        System.out.println("dec rep = " + i);
    }
}
