package org.redbasin.recursion;

/**
 * Created by manojjoshi on 10/9/16.
 */
public class SearchChar {

    public static boolean searchChar(String s, char m) {
        int len = s.length();
        if (len == 1) {  // termination condition
            System.out.println("s = " + s);
            if (s.charAt(0) == m) {
                return true;
            } else
                return false;
        }
        int offset = len/2;
        String leftHalf = s.substring(0, offset);
        String rightHalf = s.substring(offset, len);
        System.out.println("leftHalf = " + leftHalf);
        System.out.println("rightHalf = " + rightHalf);
        boolean ret = searchChar(leftHalf, m);
        if (ret == true)
            return true;
        else {
            ret = searchChar(rightHalf, m);
            if (ret == true)
                return true;
            else
                return false;
        }
    }

    public static void main(String[] args) {
        String s = "1dfegk9a43cqm";
        System.out.println(searchChar(s, 'k'));
    }
}
