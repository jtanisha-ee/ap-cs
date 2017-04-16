package org.redbasin.operators;

/**
 * Created by manojjoshi on 3/26/17.
 */
public class BooleanExpressions {
    public static void main(String[] args) {
        int x = 1;
        int y = 2;
        int z = 3;
        boolean result1 = (x == y && x != z) || (x != y && x == z);
        System.out.println(result1);
    }
}
