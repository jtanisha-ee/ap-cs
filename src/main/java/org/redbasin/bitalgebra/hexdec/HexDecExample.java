package org.redbasin.bitalgebra.hexdec;

/**
 * Created by manojjoshi on 4/30/17.
 */
public class HexDecExample {

    public static void main(String[] args) {
        // declaring a binary number
        int binNum = 0b11000111011;
        // any number base when printed, always prints as decimal
        System.out.println("binNum = " + binNum); // binNum in decimal

        String binStr = "0b11000111011";
        int sum = 0;
        for (int i = binStr.length()-1; i > 1; i--) {
            int digit = Character.getNumericValue(binStr.charAt(i));
            int exp = binStr.length()-1-i;
            sum = sum + digit * (int)Math.pow(2, exp);
        }
        System.out.println("sum = " + sum);
    }
}
