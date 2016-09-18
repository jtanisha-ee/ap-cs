package org.redbasin.super2;

/**
 * Created by manojjoshi on 7/24/16.
 */
public class SuperExample {
    public static void main(String[] args) {
        B b = new B(4);
        //b.play();
        A a = new A(5);
        //a.play();
    }
}

class A {
    public A() {
        System.out.println("Enter A");
    }
    public A(int x) {
        System.out.println("Enter A: " + x);
        play();
    }
    public void play() {
        System.out.println("Enter A play ");
    }
    public void run() {
        System.out.println("Enter A run");
    }
}

class B extends A {
    public B() {
        System.out.println("Enter B");
    }
    public B(int x) {
        super(x);
        System.out.println("Enter B: " + x);
    }
    public void play() {
        //super.play();
        //super.run();
        System.out.println("Enter B play");
        //super.run();
    }
}
