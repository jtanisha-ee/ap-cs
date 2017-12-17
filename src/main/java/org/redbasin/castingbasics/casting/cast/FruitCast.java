package org.redbasin.castingbasics.casting.cast;

/**
 * Created by manojjoshi on 12/10/17.
 */
public class FruitCast {
    public static void main(String[] args) {
        Mango1 mango1 = new Mango1();
        AlphonsoMango1 am = (AlphonsoMango1)mango1;
        System.out.println(am.b);

        AlphonsoMango1 am1 = new AlphonsoMango1();
        Mango1 m1 = (Mango1)am1;
        System.out.println(m1.a);
    }
}

class Mango1 {
    public int a;
}

class AlphonsoMango1 extends Mango1 {
    public int b;
}
