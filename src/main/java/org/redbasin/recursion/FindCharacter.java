package org.redbasin.recursion;

/**
 * Created by manojjoshi on 10/9/16.
 */
public class FindCharacter {

    /**
     * Find the location of a char in a string using recursion.
     * @param s is the input string
     * @param m the char to find
     * @return false if the char is not found
     */
    public static boolean findCharLoc(String s, char m) {
        int len = s.length();
        if (len == 1) {
            if (s.charAt(0) == m) {  // termination condition
                return true;
            } else return false;
        }
        int offset = len/2;
        String leftHalf = s.substring(0, offset);
        String rightHalf = s.substring(offset, len);
        boolean ret1 = findCharLoc(leftHalf, m);
        if (ret1 == false) {
            boolean ret2 = findCharLoc(rightHalf, m);
            if (ret2 == false) {
                return false;
            } else return true;
        } else {
            return true;
        }
    }

    public static void main(String[] args) {
        String s = "1adefl79gq";
        System.out.println(findCharLoc(s, '1')); // example invocation
    }
}
