package org.redbasin.recursion;

/**
 * Created by manojjoshi on 1/15/17.
 */
public class RecursionExamples {

    public void f(int z) {
        if (z == 0)
            System.out.print ("x");
        else {
            System.out.print("{");
                f(z-1);
                System.out.print("}");
        }
    }

    public void g(int x, int y) {
        if (x/y != 0)
            g(x/y, y);
        System.out.print(x/y + 1);
    }

    public void g1(int x, int y) {
        if (x/y != 0)
            g1(x/y, y);
        else
            System.out.print(x/y + 1);
    }

    public int rig(int n) {
        if (n == 0)
            return 5;
        else if (n == 1)
            return 8;
        else
            return rig(n-1) - rig(n-2);
    }

    public static int mm(int n) {
        if (n <= 0)
            return 10;
        else
            return n + mm(n-1);
    }

    public static void main(String[] args) {
        RecursionExamples r = new RecursionExamples();
        r.f(4);
        System.out.println("Calling g");
        r.g(4, 2);
        System.out.println("Calling g1");
        r.g1(4, 2);
        System.out.println("Calling rig");
        System.out.println(r.rig(4));
        System.out.println("Calling mm");
        System.out.println(mm(6));
        
    }

}
