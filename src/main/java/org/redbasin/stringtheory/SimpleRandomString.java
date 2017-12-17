package org.redbasin.stringtheory;
import java.util.UUID;

/**
 * Created by manojjoshi on 12/10/17.
 */
public class SimpleRandomString {

    /**
     * Make a decision to generate either digit, or lowercase
     * or uppercase.
     * 0 - digit
     * 1 - lowercase
     * 2 - uppercase
     * @return
     */
    public static int decision() {
        int minDigit = 0;
        int maxDigit = 2;
        int r = (int)(minDigit + Math.random()*(maxDigit-minDigit+1));
        char c = (char)r;
        return c;
    }

    public static char genDigit() {
        int minDigit = 48;
        int maxDigit = 57;
        int r = (int)(minDigit + Math.random()*(maxDigit-minDigit+1));
        char c = (char)r;
        return c;
    }

    public static char genUppercase() {
        int minDigit = 65;
        int maxDigit = 90;
        int r = (int)(minDigit + Math.random()*(maxDigit-minDigit+1));
        char c = (char)r;
        return c;
    }

    public static char genLowercase() {
        int minDigit = 97;
        int maxDigit = 122;
        int r = (int)(minDigit + Math.random()*(maxDigit-minDigit+1));
        char c = (char)r;
        return c;
    }

    public static void main(String[] args) {
        int minDigit = 48;
        int maxDigit = 57;
        int minUpperAlpha = 65;
        int maxUpperAlpha = 90;
        int minLowerAlpha = 97;
        int maxLowerAlpha = 122;

        for (int i = minDigit; i <= maxDigit; i++) {
            char c = (char)i;
            System.out.println("ordinal = " + i + ", char = " + c);
        }
        for (int i = minUpperAlpha; i <= maxUpperAlpha; i++) {
            char c = (char)i;
            System.out.println("ordinal = " + i + ", char = " + c);
        }
        for (int i = minLowerAlpha; i <= maxLowerAlpha; i++) {
            char c = (char)i;
            System.out.println("ordinal = " + i + ", char = " + c);
        }

        String uuid = "";

        for (int i = 0; i <= 100; i++) {
            int d = decision();
            System.out.println("decision = " + d);
            char c;
            switch (d) {
                case 0:
                    c = genDigit();
                    uuid = uuid + c;
                    break;
                case 1:
                    c = genUppercase();
                    uuid = uuid + c;
                    break;
                case 2:
                    c = genLowercase();
                    uuid = uuid + c;
            }
        }

        //uuid = uuid + getUuidPart(8) + '-' + getUuidPart(4) + "-";

        System.out.println("random string = " + uuid);

        System.out.println("uuid = " + UUID.randomUUID());
    }
}
