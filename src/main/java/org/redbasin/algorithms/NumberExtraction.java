package org.redbasin.algorithms;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by jtanisha-ee on 8/7/16.
 */
public class NumberExtraction {

    public static List<Integer> extractDigits(int x) {

        List<Integer> digits = new ArrayList<>();
        int i = 0;
        while (true) {
            int quotient = x/(int)Math.pow(10, i);
            if (quotient == 0) break;
            int remainder = quotient%10;
            i++;
            digits.add(0, remainder);
        }

        return digits;
    }

    public static int sumDigits(int x) {
       List<Integer> digits = extractDigits(x);

        int sum = 0;
        for (int i = 0; i < digits.size(); i++) {
            sum += digits.get(i);
        }
        return sum;
    }


    public static void main(String[] args) {
        int y = 73733373;

        System.out.println(extractDigits(y));

        System.out.println(sumDigits(y));

    }
}
