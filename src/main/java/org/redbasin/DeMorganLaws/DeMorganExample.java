package org.redbasin.DeMorganLaws;

/**
 * Created by manojjoshi on 4/16/17.
 */
public class DeMorganExample {

    public static void main(String[] args) {
        // first test
        boolean m = true;
        boolean a = false;
        boolean exp1 = !(m && a);
        boolean exp2 = !m || !a;
        System.out.println(exp1 == exp2);

        // second test
        exp1 = !m && !a;
        exp2 = !(m || a);
        System.out.println(exp1 == exp2);

        // third test
        int x = 5;
        int y = 3;
        int z = 2;
        m = (x == (y + z));
        a = (y == (x - z));
        System.out.println((!(m && a)) == (!m || !a));
        System.out.println((!((x == (y + z)) && (y == (x - z)))) == (!(x == (y + z)) || !(y == (x - z))));

        // fourth test
        x = 11;
        y = 5;
        z = 9;
        System.out.println((!((x == (y + z)) && (y == (x - z)))) == (!(x == (y + z)) || !(y == (x - z))));

        // fifth test
        boolean f1 = ((x == (y + z)) && (y == (x - z)));
        boolean f2 = (!(x == (y + z)) || !(y == (x - z)));
        boolean f3 = ((x + y) == z) && ((x - y) == z);
        m = f1 && (f2 || f3);
        a = (f1 || f2) && f3;
        System.out.println((!(m && a)) == (!m || !a));
        System.out.println((!(f1 && (f2 || f3) && (f1 || f2) && f3)) == (!f1 && (f2 || f3) || !(f1 || f2) && f3));
        System.out.println((!(((x == (y + z)) && (y == (x - z))) && ((!(x == (y + z)) ||
                !(y == (x - z))) || ((x + y) == z) && ((x - y) == z)) && (((x == (y + z))
                && (y == (x - z))) || (!(x == (y + z)) || !(y == (x - z)))) && ((x + y) == z)
                && ((x - y) == z))) == (!((x == (y + z)) && (y == (x - z)))
                && ((!(x == (y + z)) || !(y == (x - z))) || ((x + y) == z)
                && ((x - y) == z)) || !(((x == (y + z)) && (y == (x - z)))
                || (!(x == (y + z)) || !(y == (x - z)))) && ((x + y) == z)
                && ((x - y) == z)));
        boolean A = (x == (y + z));
        boolean B = (y == (x - z));
        boolean C = ((x + y) == z);
        boolean D = ((x - y) == z);
        System.out.println((!((A && B) && ((!A || !B) || C && D) && ((A
                && B) || (!A || !B)) && C && D)) == (!(A && B)
                && ((!A || !B) || C && D) || !((A && B) || (!A || !B)) && C && D));

    }
}
