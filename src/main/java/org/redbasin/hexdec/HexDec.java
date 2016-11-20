package org.redbasin.hexdec;

/**
 * Created by manojjoshi on 11/20/16.
 */
public class HexDec {

    /**
     * Takes decimal as input and converts to binary
     * representation which starts with "0b"
     * The binary representation is not a number but
     * a String.
     *
     * @param input
     * @return
     */
    public static String getBinaryRep(int input) {
        String bin = "";
        int r = 1;
        int q = 1;
        while (q != 0) {
            q = input / 2;
            r = input % 2;
            bin = r + bin;
            input = q;
        }
        return bin;
    }

    public static String getHexChar(int number) {
        if (number <= 9) {
            return new Integer(number).toString();
        } else {
            switch (number) {
                case 10:
                    return "a";
                case 11:
                    return "b";
                case 12:
                    return "c";
                case 13:
                    return "d";
                case 14:
                    return "e";
                case 15:
                    return "f";
            }
        }
        return "";
    }

    public static String getHexRep(int input) {
        String bin = "";
        int r = 1;
        int q = 1;
        while (q != 0) {
            q = input / 16;
            r = input % 16;
            bin = getHexChar(r) + bin;
            input = q;
        }
        return bin;
    }

    public static void main(String[] args) {
        int a = 0xff;
        System.out.println(a);

        int b = 0b0100111;
        System.out.println(b);

        String bin = getBinaryRep(23424452);
        System.out.println("0b" + bin);

        String hex = getHexRep(522252223);
        System.out.println("0x" + hex);
    }
}
