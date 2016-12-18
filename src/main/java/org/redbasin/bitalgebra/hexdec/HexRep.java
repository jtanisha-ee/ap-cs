package org.redbasin.bitalgebra.hexdec;

/**
 * Created by manojjoshi on 11/27/16.
 */
public class HexRep {

    public static int getOctalFromBinary(String binary) {
        int start = Math.max(binary.length() - 3, 2);
        int end = binary.length();
        while (true) {
            if (start == end) break;
            String s = binary.substring(start, end);
            System.out.println(new Integer("0" + s));
            end = Math.max(end - 3, 2);
            start = Math.max(start - 3, 2);
            //System.out.println(s);
        }
        return 0;
    }

    public static void main(String[] args) {
        /*int x = 0x1F;
        System.out.println(x);

        int y = 0x29E;
        System.out.println(y);

        int z = 0b1010011110;
        System.out.println(z);

        int a = 01236;
        System.out.println(a);*/

        System.out.println(getOctalFromBinary("0b1010011110"));
    }
}
