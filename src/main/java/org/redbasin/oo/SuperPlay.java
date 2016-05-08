package org.redbasin.oo;

/**
 * Created by jtanisha-ee on 4/24/16.
 */
public class SuperPlay extends Parent {

    public SuperPlay() {
        super(7);
        System.out.println("x = " + x);
    }

    public void trigger() {
        super.trigger();
        System.out.println("SuperPlay trigger called");
    }

    public void mas() {
        System.out.println("SuperPlay mas called");
        super.mas();
    }

    public static void main(String[] args) {
        SuperPlay superPlay = new SuperPlay();
        superPlay.trigger();
    }
}

class Parent {
    int x = 4;
    public Parent() {
        x = 5;
    }
    public Parent(int z) {
        x = z;
    }
    public void trigger() {
        System.out.println("Parent trigger called");
        mas();
    }
    public void mas() {
        System.out.println("Parent mas called");
    }

}
