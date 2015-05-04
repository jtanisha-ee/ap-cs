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

package org.redbasin.wizards.Fibonacci;

/**
 *
 * @author redbasin
 */
public class Fibonacci {

  int first = 0;
  int second = 1;

  public void generate() {
    for (int i = 0; i < 25; i++) {
       second = first + second;
       first = second;
       System.out.println(first);
    }

  }

  public static void main(String[] args) {
     Fibonacci fibonacci = new Fibonacci();
     fibonacci.generate();
  }

}
