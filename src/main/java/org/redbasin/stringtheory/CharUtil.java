package org.redbasin.stringtheory;

/**
 * Created by manojjoshi on 12/10/17.
 */
public class CharUtil {

    public static int chooseType() {
       return 0;
    }

    public static long getDigit() {
        return (long)(9*Math.random());
    }

    public static char getUpperCase() {
        return 1;
    }

    public static char getLowerCase() {
        return 2;
    }

    public static void main(String[] args) {
        char c = 'a';
        String c1 = "a";
        System.out.println(c);
        int code = (int)c;
        System.out.println(code);
        System.out.println((int)'b');
        System.out.println((char)122);
        System.out.println((char)123);

        for (int i = 0; i <= 127; i++) {
            System.out.println("ord = " + i + ", char = " + (char)i);
        }

        double rnd = Math.random();
        System.out.println(rnd);
        // generate random numbers bet 7 and 7000
        System.out.println((long)(7 + rnd*6993));

        char d = 'c';
        String s = Character.toString(d);
        String a = s + s;
        System.out.println(a);



    }
}
