package org.redbasin.stringtheory;

/**
 * Created by manojjoshi on 5/14/17.
 */
public class StrUtil {

    public static void main(String[] args) {
        String s = "Dial " + 911;
        System.out.println(s);

        s = "Dial " + 911 + 1;
        System.out.println(s);

        s = "Dial " + (911 + 1);
        System.out.println(s);

        s = "\"Dial\"" + 911 + "\"";
        System.out.println(s);

    }
}
