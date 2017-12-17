package org.redbasin.castingbasics.casting.cast;

/**
 * Created by manojjoshi on 12/10/17.
 */
public class FruitExec {
    public static void process(Mango m) {
        AlphonsoMango a = (AlphonsoMango)m;
    }

    public static void main(String[] args) {
        AlphonsoMango alphonsoMango = new AlphonsoMango();
        Mango m = (Mango)alphonsoMango;
        AlphonsoMango a = (AlphonsoMango)m;
    }
}
