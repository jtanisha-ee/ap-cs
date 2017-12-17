package org.redbasin.basics.reference;

/**
 * Created by manojjoshi on 11/26/17.
 */
public class ValueVsReference {
    // x is passed by reference, so it does not get modified
    public void modify(int x) {
        x = x + 1;
    }

    public static void main(String[] args) {
        int x = 5;
        ValueVsReference valueVsReference = new ValueVsReference();
        valueVsReference.modify(x);
        System.out.println(x);
    }
}
