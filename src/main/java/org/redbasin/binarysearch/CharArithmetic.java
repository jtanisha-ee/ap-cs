package org.redbasin.binarysearch;

/**
 * Created by jtanisha-ee on 7/31/16.
 */
public class CharArithmetic {

    public static void main(String[] args) {
        char c = 'd';

        System.out.println(c);

        int i = c;  // implicit cast to an int

        System.out.println(i);

        char j = (char)(c + 1);
        System.out.println(j);

        if ('z' > 'd') {
            System.out.println("I am confused");
        } else {
            System.out.println("Which is good");
        }
    }
}
