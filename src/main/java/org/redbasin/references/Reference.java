package org.redbasin.references;

/**
 * Created by jtanisha-ee on 4/9/16.
 */
public class Reference {

    /**
     * Pass by value.
     * @param x
     */
    public static void fiddle(int x) {
        x = 2;
    }

    public static void fiddle1(int[] y) {
        y[1] = 7;
    }

    public static void fiddle2(Container c) {
        c.z = new int[4];
        c.z[2] = 12;
    }


    public static void main(String[] args) {
        int x = 5;
        fiddle(x);
        System.out.println(x);

        int[] y = new int[3];
        y[0] = 3;
        y[1] = 9;
        y[2] = 5;
        //fiddle1(y);

        //System.out.println(y[1]);

        int[] y1 = new int[3];

        System.arraycopy(y, 0, y1, 0, 3);

        fiddle1(y1);

        System.out.println(y[1]);

        int[] z = {3, 4, 3, 8};
        int[] z1 = z;

        System.out.println(z);
        System.out.println(z1);

        Container c = new Container();

        c.z = new int[4];
        c.z[0] = 3;
        c.z[1] = 1;
        c.z[2] = 0;
        c.z[3] = 7;
        int[] d = c.z;

        fiddle2(c);

        System.out.println(d[2]);

    }
}

class Container {
    public int[] z;
}
