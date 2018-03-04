package org.redbasin.oo.superclasses;

/**
 * Created by manojjoshi on 1/7/18.
 */
public class SuperExample {
    public static void main(String[] args) {
        B b = new B();
        B b1 = new B(4);
        b.b();
        System.out.println("x = " + b.x);
        C c = new C();
        c.c();
        System.out.println("x = " + c.x);
    }
}
class A {
    public int x;
    A() {
        System.out.println("Enter A");
    }
    A(int i) {
        System.out.println("Enter A" + i);
    }
    A(int i, int j) {
        System.out.println("Enter A" + i + " " + j);
    }
    void a() {
        x = 1;
    }
    void c() {
       System.out.println("Called c in grand parent");
    }
}
class B extends A {
    B() {
        System.out.println("Enter B");
    }
    B(int i) {
        super(i, i);
        System.out.println("Enter B" + i);
        // super(i);  --> not allowed
    }
    void a() {
        x = 2;
    }
    void b() {
        a();
    }
}
class C extends B {
    void c() {
        super.c();
    }
}