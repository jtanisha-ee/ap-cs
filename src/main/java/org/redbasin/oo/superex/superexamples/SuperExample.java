package org.redbasin.oo.superex.superexamples;

/**
 * Created by jtanisha-ee on 7/24/16.
 */
public class SuperExample {
    public static void main(String[] args) {
       //B b = new B();
        B b1 = new B(4);
        b1.play();
    }
}

class A {
    public A() {  // default constructors, since no arguments
        System.out.println("Enter A");
    }
    public A(int x) {
      System.out.println("Enter A: " + x);
    }
    public void play() {
        System.out.println("Enter A play");
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
        super.play();
        System.out.println("Enter B play");
        super.run(); // this call can be anywhere in the method
        // you can have as many calls to super.play() as you want
    }
}
