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

package org.redbasin.labs.classwork7;

/**
 *
 * @author redbasin
 */
public class GeometryUtils {
   public static double distance(Coordinate d1, Coordinate d2) {
      return Math.sqrt(Math.pow(d1.x-d2.x, 2) + Math.pow(d1.y-d2.y, 2));
   }
}
