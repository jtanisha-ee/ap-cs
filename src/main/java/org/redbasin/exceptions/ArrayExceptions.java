package org.redbasin.exceptions;

/**
 * Created by manojjoshi on 2/12/17.
 */
public class ArrayExceptions {

    public static void main(String[] args) {
        int[] someArr = new int[10];

        try {
            someArr[1] = 4;
            someArr[3] = 7;
            someArr[5] = 2;
            someArr[10] = 5;  // program died here
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Something went wrong: " + e.getMessage());
            System.exit(1);
        }

        for (int i = 0; i < 10; i++) {  // never reaches this line
            System.out.println(someArr[i]);
        }
    }
}
