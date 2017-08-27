package org.redbasin.algorithms.numberbases;

/**
 * Created by manojjoshi on 7/2/17.
 */
public class FractionBases {

    public static int foo(int i, int j) {
        return i*j;
    }

    public static void main(String[] args) {
        // represent binary whole numbers
        int binNum = 0b1101;
        // could not find a way to represent binary fractions
        //int binFraction = 0b0.1101; - this did not work
        String binStr = "0.110111011";
        int len = binStr.length();
        //System.out.println(binStr.charAt(len-1));
        //System.out.println(binStr.charAt(len-2));
        int offset = 0;
        char nextChar = binStr.charAt(offset);
        while (nextChar != '.') {
            offset++;
            nextChar = binStr.charAt(offset);
        }
        offset++;
        // Note that for loop declaration have 3 parts
        // separated by semi-colon.
        // 1. Initialization: This can initialize multiple variables
        //        but they all must be the same type. They are
        //        separated by comma. The type is not explicitly
        //        declared for the second variable onwards. You
        //        can have multiple variables initialized here, not
        //        limited to 2.
        // 2. Condition: You can have multiple conditions separated
        //        by comma.
        //
        // 3. Increment/Decrement: You can have multiple increments separated
        //        by comma.
        double sum = 0;
        for (int j = 1, i = offset; i < binStr.length(); i++, j++){
            double fraction = 1/Math.pow(2, j);
            String digit = binStr.substring(i, i+1);
            double term = new Double(digit) * fraction;
            sum = sum + term;
        }
        System.out.println("sum = " + sum);

    }
}
