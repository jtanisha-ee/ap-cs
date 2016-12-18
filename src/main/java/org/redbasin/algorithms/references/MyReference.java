package org.redbasin.algorithms.references;

/**
 * Created by jtanisha-ee on 4/10/16.
 */
public class MyReference {

    /**
     * methodX - Pass by value
     * int - primitive int
     */
    public static void methodX(int x) {
        x = 100;
        System.out.println("x =" + x);
    }

    /**
     * methodArr
     * Pass by reference
     * int[] - primitive int array
     */
    public static void methodArr(int[] arrX) {
        arrX[0] = 99;
        System.out.println("arrX[0]=" + arrX[0]);
    }

    public static void passByValue(String s) {
        s = "Moon";
        System.out.println("passByValue =" +s );
    }

    /**
     * example for pass by value and pass by reference
     * @param args
     */
    public static void main(String[] args) {
       int x = 10;
       methodX(x);
       System.out.println("x =" + x);
       int numbers[] = {0, 1, 2};
       methodArr(numbers);
       System.out.println("numbers[0]=" + numbers[0]);
       System.out.println("numbers[1] =" + numbers[1]);

       String s = "Sun";
       passByValue(s);
       System.out.println("passByValue did not change the value of s =" + s);

    }
}
