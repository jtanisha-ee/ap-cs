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

package org.redbasin.sequences;

/**
 *
 * @author redbasin
 */
public class MyOverflowingByte {

  public static void main(String[] args) {
    byte b = 127;
    byte b1 = 2;
    b += b1;
    System.out.println(b);
  }

}
