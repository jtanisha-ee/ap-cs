package org.redbasin.arrays;

/**
 * Created by manojjoshi on 1/29/17.
 */
public class NestedLoops {

    public static void main(String[] args) {
        int q = 0;
        for (int i = 2; i < 10; i++) {
            for (int j = i; j < 4; j++) {
                q = q + 2;
            }
        }
        System.out.println(q);
    }
}
