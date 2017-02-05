package org.redbasin.arrays;

/**
 * Created by manojjoshi on 1/22/17.
 */
public class ArrayPlay {

    public static void main(String[] args) {
        // public static void arraycopy(Object src, int srcPos,
        // Object dest, int destPos, int length)

        int[] a = {3, 8, 1, 7, 9, 2, 6};  // static init
        // int[] a = new int[7];  // heap allocation
        int[] b = new int[5];
        System.arraycopy(a, 2, b, 0, 5);

        System.out.println(b);

        for (int i = 0; i < b.length; i++) {
            System.out.println(b[i]);
        }

        String[] s1 = {"abc", "bce", "cef", "efg", "fgh"};

        String[] s2 = new String[s1.length];

        // public static void arraycopy(Object src, int srcPos,
        // Object dest, int destPos, int length)
        System.arraycopy(s1, 0, s2, 0, s1.length);

        for (int i = 0; i < s2.length; i++) {
            System.out.println(s2[i]);
        }

        //int[][] x = new int[2][4];   // 2rows, 4 columns
        int[][] x = { // symmetric arrays
                      {8, 7, 3, 6},
                      {1, 3, 4, 8}
        };

        int[][] y = new int[2][4];

        System.arraycopy(x, 0, y, 0, x.length);

        for (int i = 0; i < x.length; i++) {
            for (int j = 0; j < x[0].length; j++) {
                System.out.print(y[i][j]);
            }
            System.out.println();
        }


    }
}
