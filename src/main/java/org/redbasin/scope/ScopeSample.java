package org.redbasin.scope;

/**
 * Created by manojjoshi on 6/18/17.
 * ScopeSample is a class.
 */
public class ScopeSample {

    int x;  // instance variable, scope is whole class

    public void doNothing() {
        int y = 2;  // local variables
        System.out.println(x);
        System.out.println(y);
    }

    public static void main(String[] args) {
        //System.out.println(x);
        // scopeSample, scopeSample1 are objects
        ScopeSample scopeSample = new ScopeSample();
        scopeSample.doNothing();
        ScopeSample scopeSample1 = new ScopeSample();
        scopeSample1.doNothing();
        System.out.println(scopeSample.x);

    }
}
