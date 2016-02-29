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

package org.redbasin.lists;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author tanisha
 */
public class ListPlay {

    public static void main(String[] args) {
      List<Integer> l = new ArrayList<>();
      l.add(10);
      l.add(20);
      l.add(30);
      l.set(1, 50);
      System.out.println(l);
    }

}
