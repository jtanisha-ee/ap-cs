package org.redbasin.references;

/**
 * Created by jtanisha-ee on 5/8/16.
 */
public class ReferenceExperiment {
    int z = 2;  // instance variables

    public void testMethod(int x) {
        x = 3;
    }

    public void testMethod(String s) {
        s = "hello";
    }

    public void testMethod(A a) {
        a.z = 5;
    }

    public void testMethod(int[] arr) {
        arr[1] = 11;
    }

    public static void main(String[] args) {
        int x = 2;
        new ReferenceExperiment().testMethod(x);  // pass by value
        System.out.println(x);

        String s = "world";  // String object is immutable, pass by value
        new ReferenceExperiment().testMethod(s);
        System.out.println(s);

        A a = new A(x);
        System.out.println("x = " + x);
        System.out.println("a.z = " + a.z);

        int y = 7;
        A b = new A(y);
        new ReferenceExperiment().testMethod(b);   // pass by reference
        System.out.println(b.z);

        int[] arr = new int[4];
        arr[1] = 2;
        new ReferenceExperiment().testMethod(arr);  // pass by reference
        System.out.println("arr[1] = " + arr[1]);

        int[] myArr = arr;
        myArr[1] = 15;
        System.out.println("arr[1] = " + arr[1]);   // two arrays pointing to same loc

        int[] m1;   // scope of variable lives outside the block
        {
            int[] m = new int[5];   // local variable inside the block
            m[2] = 7;
            m1 = m; // external variable points to local variable
        }
        System.out.println(m1[2]);  // external variable still has scope

        int[] n = new int[2];
        int[] n1 = n;
        n[1] = 5;
        System.out.println(n1[1]);
    }
}

class A {
    public int z;
    public A(int z) {
        this.z = z;
    }
}
