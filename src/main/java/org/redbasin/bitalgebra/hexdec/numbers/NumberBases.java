package org.redbasin.bitalgebra.hexdec.numbers;

/**
 * Created by jtanisha-ee on 4/16/16.
 */
public class NumberBases {

    public static int hex2decimal(String s) {
        String digits = "0123456789ABCDEF";
        s = s.toUpperCase();
        int val = 0;
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            int d = digits.indexOf(c);
            val = 16*val + d;
        }
        return val;
    }

    public static int dec2decimal(String s) {
        String digits = "0123456789";
        int val = 0;
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            int d = digits.indexOf(c);
            val = 10*val + d;
            System.out.println("val = " + val);
        }
        return val;
    }

    public static void main(String[] args) {
        System.out.println(dec2decimal("9246"));
        int x = 0x1F3E;
        int y = hex2decimal("1F3E");
        System.out.println(x == y);
    }
}
