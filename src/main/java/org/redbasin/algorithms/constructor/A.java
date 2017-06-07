package org.redbasin.algorithms.constructor;

/**
 * Created by manojjoshi on 12/11/16.
 */
public class A {
    public A() {
        System.out.println("Entered constructor");
    }

    public A(int i) {
        System.out.println("Enter constructor with param");
    }

    public static void main(String[] args) {
        A a = new A();
        A a1 = new A(5);
    }
}
