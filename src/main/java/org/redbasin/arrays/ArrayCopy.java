package org.redbasin.arrays;

/**
 * Created by manojjoshi on 1/22/17.
 */
public class ArrayCopy {

    public static void main(String[] args) {
        // public static void arraycopy(Object src, int srcPos, Object dest, int destPos, int length)

        int[] x = {1, 2, 3, 7, 5, 3};
        int[] y = new int[x.length];

        System.arraycopy(x, 0, y, 0, x.length);

        System.out.println(y);

        for (int i = 0; i < x.length; i++) {
            System.out.println(y[i]);
        }

        for (int i = 0; i < y.length; i++) {
            y[i] = -1;
        }

        System.arraycopy(x, 1, y, 0, 3);

        for (int i = 0; i < x.length; i++) {
            System.out.println(y[i]);
        }
    }
}
