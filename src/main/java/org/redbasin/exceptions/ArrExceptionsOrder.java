package org.redbasin.exceptions;

/**
 * Created by manojjoshi on 2/12/17.
 */
public class ArrExceptionsOrder {

    public static void main(String[] args) {
        int[] someArr = new int[10];

        try {
            someArr[1] = 4;
            someArr[3] = 7;
            someArr[5] = 2;
            someArr[10] = 5;  // program died here
        } catch (Exception e) {  // catch all exceptions
            System.out.println("Something went wrong: " + e.getMessage());
        /* } catch (ArrayIndexOutOfBoundsException e1) { // this does not work
            System.out.println("Got an array index problem: " + e1.getMessage());
        */ } // uncomment this to learn how this fails

        for (int i = 0; i < 10; i++) {  // never reaches this line
            System.out.println(someArr[i]);
        }
    }
}
