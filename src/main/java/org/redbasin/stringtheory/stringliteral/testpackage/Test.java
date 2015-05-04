/*
 * Copyright (C) Tanisha  - All Rights Reserved.
 * Unauthorized copying of this file, via any medium is strictly prohibited.
 * Proprietary and confidential.
 */

package org.redbasin.stringtheory.stringliteral.testpackage;

import org.redbasin.stringtheory.stringliteral.other.Other;
/**
 * The output it generates is:
    true 1
    true 2
    true 3
    true 4
    false 5
    true 6
    true 7
 * @author redbasin
 */
public class Test {
  public static void main(String[] args) {
        String hello = "Hello", lo = "lo", h = "Hello";
        System.out.println((hello == "Hello") + " 1");
        System.out.println((LocalOther.hello == hello) + " 2");
        System.out.println((Other.hello == hello) + " 3");
        System.out.println((hello == ("Hel"+"lo")) + " 4");
        System.out.println((hello == ("Hel"+lo)) + " 5");
        System.out.println((hello == ("Hel"+lo).intern()) + " 6");
        System.out.println((hello == h) + " 7");
    }

  class LocalOther {
    public static final String hello = "Hello";
  }
}