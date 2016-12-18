package org.redbasin.algorithms;

/**
 * Created by manojjoshi on 12/11/16.
 */

class Y {
    public int y;
}

public class Review {

    // This is a constructor, it's name is same as the name of class
    // We know it is a constructor because it does not return anything
    // A constructor is usually public
    // constructor can take parameters
    public Review() {
        System.out.println("Entered constructor");
    }

    public static void someMethod(int y) {
        y++;
        System.out.println(y);
    }

    public static void anotherMethod(Y z) {
        z.y++;
    }

    public static void main(String[] args) {
        int x; // scope is wider as decl outside loop

        for (x = 0; x < 10; x++) {
            //
        }
        System.out.println(x);

        // reusing variables in sibling blocks
        { // stack pushes the variable y
            int y = 2;
        } // stack pops the variable y
        { // y is not available to be used
            int y = 3;  // this is allowed and not duplicate
        } // scope of y is closed

        int y = 5; // pass by value
        someMethod(y); // this y has nothing to do with the parameter y to the method

        System.out.println(y);

        Y y1 = new Y();
        y1.y = 5;
        anotherMethod(y1);  // pass by reference
        System.out.println(y1.y);

        Review review = new Review(); // this calls the constructor
    }
}
