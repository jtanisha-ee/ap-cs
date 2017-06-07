package org.redbasin.castingbasics.casting;

/**
 * Created by manojjoshi on 5/21/17.
 */
public class CastOperators {

    public static double getAvgAge(int[] ages) {
        int sum = 0;
        for (int i = 0; i < ages.length; i++) {
            sum = sum + ages[i];
        }
        return (double)sum/ages.length;
    }

    public static void main(String[] args) {
        // primitive data type implicit casting

        // no casting happens on this one
        double fraction = 5/3;
        System.out.println("double fraction = 5/3 gives " + fraction);

        // adding a decimal point suggests a cast to the compiler
        // as long as parenthesis operator precedence does not kick in

        // implicit casting, denom was double, numerator promoted to double
        fraction = 5/3.0;
        System.out.println("double fraction = 5/3.0 gives " + fraction);

        // implicit casting, numerator was double, denom promoted to double
        fraction = 5.0/3;
        System.out.println("double fraction = 5.0/3 gives " + fraction);

        // implicit casting, numerator and denom were double
        fraction = 5.0/3.0;
        System.out.println("double fraction = 5.0/3.0 gives " + fraction);

        // primitive data type explicit casting
        fraction = (double)5/3;
        System.out.println("double fraction = (double)5/3 gives " + fraction);

        fraction = 5/(double)3;
        System.out.println("double fraction = 5/(double)3 gives " + fraction);

        // both do not need to be casted to double, but it does not hurt
        fraction = (double)5/(double)3;
        System.out.println("double fraction = (double)5/(double)3 gives " + fraction);

        // PEMDAS implies parenthesis takes precedence
        fraction = (double)(5/3);
        System.out.println("double fraction = (double)(5/3) gives " + fraction);

        int [] ages = {10, 11, 11, 9, 10, 9, 10, 10, 11, 10};
        double x = getAvgAge(ages);
        System.out.println("avg age = " + x);
    }
}
