package org.redbasin.polymorphism;

/**
 * Created by manojjoshi on 12/18/16.
 */
public class Polymorphism {
    public static void main(String[] args) {
        Homosapien homosapien = new Homosapien();
        Bostaurus bostaurus = new Bostaurus();
        Mammal mammal = (Mammal)homosapien;
        System.out.println("Calling milk() on homosapien casted to mammal");
        mammal.milk();

        Mammal anotherMammal = new Mammal();
        System.out.println("Calling milk() in a mammal instance");
        anotherMammal.milk();

        // the below statement fails when running with following exception:
        // Exception in thread "main" java.lang.ClassCastException: org.redbasin.polymorphism.Mammal cannot be cast to org.redbasin.polymorphism.Homosapien
        //at org.redbasin.polymorphism.Polymorphism.main(Polymorphism.java:18)
        Homosapien anotherHomosapien = (Homosapien)anotherMammal;
        anotherHomosapien.milk();
    }
}


class Mammal {
    public void milk() {
        System.out.println("Mammal: milk");
    }
}

class Homosapien extends Mammal {
    public void speak() {

    }
    public void milk() {
        System.out.println("Homosapien: milk");
    }
}

/**
 * Cow
 */
 class Bostaurus extends Mammal {
    /**
     * Quantity of grass grazed
     */
    public void grassEaten() {

    }
    public void milk() {
        System.out.println("Bostaurus: milk");
    }

 }
