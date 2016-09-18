package org.redbasin.algorithms;

/**
 * Created by manojjoshi on 9/18/16.
 */
public class VarPlay {

    // this is true with int, short, float, double
    static int m;   // auto initialized to 0
    static char c;  // initialized to null (square box symbol)
    static String s;  // initialized to null


    public static void main(String[] args) {
        int z;   // not automatically initialized

        System.out.println(m);
        System.out.println(c);

        z = 1;   // requires explicit initialization
        System.out.println(z);

        System.out.println(s);
    }
}
