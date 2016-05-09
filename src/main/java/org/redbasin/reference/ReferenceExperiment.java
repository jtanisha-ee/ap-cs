package org.redbasin.reference;

/**
 * Created by jtanisha-ee on 5/8/16.
 */
public class ReferenceExperiment {

    public static void testMethod(int x) {
        x = 5;
    }

    public static void testMethod(String s) {
        s = "world";
    }

    public static void testMethod(int[] arr) {
        arr[1] = 7;
    }

    public static void main(String[] args) {
        int x = 2;
        testMethod(x);
        System.out.println(x);   // passed by value

        String s = "hello";
        testMethod(s);      // passed by value
        System.out.println(s);

        int[] arr = new int[3];
        arr[1] = 3;
        testMethod(arr);
        System.out.println("arr[1] = " + arr[1]);

        int[] myArr = arr;
        arr[1] = 19;
        System.out.println("myArr[1] = " + myArr[1]);
    }
}
