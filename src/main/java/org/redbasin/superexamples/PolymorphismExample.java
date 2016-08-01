package org.redbasin.superexamples;

/**
 * Created by jtanisha-ee on 7/24/16.
 */
public class PolymorphismExample {
    public static void main(String[] args) {
        Y y = new Y();
        //X x = new X();
    }
}

class X {
    public X() {
        System.out.println("Enter X");
        play();
    }
    public void run() {
        play();
    }
    public void play() {
        System.out.println("Enter X play");
    }
}

class Y extends X {
    public Y() {
        System.out.println("Enter Y");
    }
    public void play() {
        super.play();
        System.out.println("Enter Y play");
    }
}
