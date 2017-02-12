package org.redbasin.exceptions;

/**
 * Created by manojjoshi on 2/12/17.
 */
public class ArrExceptionsMultiple {

    public static void main(String[] args) {
        int[] someArr = new int[10];

        try {
            someArr[1] = 4;
            someArr[3] = 7;
            someArr[5] = 2;
            someArr[10] = 5;  // program died here
        } catch (ArrayIndexOutOfBoundsException e1) { // specific exception always caught first
            System.out.println("Got an array index problem: " + e1.getMessage());
        } catch (Exception e) {  // catch all exceptions
            System.out.println("Something went wrong: " + e.getMessage());
        }

        for (int i = 0; i < 10; i++) {  // never reaches this line
            System.out.println(someArr[i]);
        }
    }
}
