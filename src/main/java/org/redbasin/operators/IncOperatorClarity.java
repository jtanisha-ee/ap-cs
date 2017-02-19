package org.redbasin.operators;

/**
 * Created by manojjoshi on 2/19/17.
 * int x;    --> declaration
 * x = 2;    --> initialization
 */
public class IncOperatorClarity {
    public static void main(String[] args) {
        int x = 5;
        int y = x + 1;
        System.out.println("y = " + y);
        System.out.println("x = " + x);  // x never changed or mutated

        int a = 5;
        int z = ++a;  // initialization happens after the increment
        System.out.println("z = " + z);
        System.out.println("a = " + a); // a changed or mutated

        int b = 6;
        int c = ++b;  // increment happens before initialization
        System.out.println("c = " + c);

        // x+1 is not equivalent to x++ or even ++x
        // x+1 is an expression
        // x++ is a statement, ++x is a statement

        // x = y + 1
        // In above the RHS (y+1) is an expression
        // expressions never change anything
        // this is why x++ or ++x is a statement because x++ is equivalent to
        // x = x + 1
        // and ++x is equivalent to
        // x = x + 1
    }
}
