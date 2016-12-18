package org.redbasin.oo.superex.super1;

/**
 * Created by manojjoshi on 7/24/16.
 */
public class SuperExample {
    public static void main(String[] args) {
        //B b = new B();
        B b = new B(4);
        System.out.println(b.x);
        //b.play();
        A a = new A();
        a.play();
    }
}

class A {
    public int x = 2;
    public A() {
        System.out.println("Enter A");
    }
    public A(int x) {
        System.out.println("Enter A: " + x);
        this.x = x;
        this.play();
    }
    public void play() {
        System.out.println("Entered play A");
    }
    public void run() {
        System.out.println("Entered run A");
    }
}

class B extends A {

    public B() {
        System.out.println("Enter B");
    }

    public B(int x) {
        super(x);
        this.x = 9;
        System.out.println("Enter B: " + this.x);
    }

    public void play() {
        //super.play();
        System.out.println("Entered play B");
        super.run();
    }
}