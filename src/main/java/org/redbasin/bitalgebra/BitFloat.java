/*
 * Copyright (C) Tanisha  - All Rights Reserved.
 * Unauthorized copying of this file, via any medium is strictly prohibited.
 * Proprietary and confidential.
 */

package org.redbasin.bitalgebra;

public class BitFloat {
   public static void main(String[] args) throws NumberFormatException {
       if (args.length == 0) {
          System.out.println("Usage: java BitFloat <float>");
          System.exit(1);
       }
       System.out.println(Integer.toBinaryString(Float.floatToRawIntBits(new Float(args[0]))));
   }
}
