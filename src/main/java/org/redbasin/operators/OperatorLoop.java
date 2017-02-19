package org.redbasin.operators;

/**
 * Created by manojjoshi on 2/19/17.
 */
public class OperatorLoop {
    public static void main(String[] args) {
        int z = 0;
        int i;
        for (i = 0; i < 4; i++) {
            z++;
            System.out.println("i = " + i + ", z = " + z);
        }
        System.out.println("i = " + i + ", z = " + z);
    }
}
