package org.redbasin.substrings;

/**
 * Created by manojjoshi on 8/28/16.
 */
public class ReverseString {

    public static String reverse1(String s) {
        String r = "";
        for (int i = s.length()-1; i >= 0; i--) {
            r = r + s.charAt(i);
            System.out.println(r);
        }
        return r;
    }

    public static void main(String[] args) {
        String s = "Live";

        System.out.println("reverse = " + reverse1(s));
    }
}
