package org.redbasin.stringtheory.substrings;

/**
 * Created by manojjoshi on 8/28/16.
 */
public class SubPlay {

    public static void main(String[] args) {

        String m = "Hello World";
        System.out.println("\"" + m.substring(5) + "\"");
        System.out.println("\"" + m.substring(7) + "\"");
        System.out.println("\"" + m.substring(m.length()-1) + "\"");

        System.out.println("\"" + m.substring(5, 8) + "\"");
        System.out.println("\"" + m.substring(2, 7) + "\"");

        System.out.println("\"" + m.substring(5, 6) + "\"");
        System.out.println("\"" + m.substring(5, 15) + "\"");
    }
}
