package org.redbasin.castingbasics.casting;

/**
 * Created by manojjoshi on 6/11/17.
 * Only one class or interface can be declared public in a single file.
 */
public interface Fruit {
    public String getColor();
    public boolean isTropical();
}

/**
 * The class below is abstract if at least one method
 * in the interface Fruit is not implemented.
 */
abstract class AbstractMango implements Fruit {

}

/**
 * The class below does not have implementation for isTropical
 * and hence must be declared abstract.
 */
abstract class PartialAbstractMango implements Fruit {
    public String getColor() {
        return "reddish yellow";
    }
}

abstract class CompleteMango implements Fruit {
    public abstract String getColor();

    public boolean isTropical() {
        return true;
    }
}

class Mango implements Fruit {
    public String getColor() {
        return "reddish yellow";
    }
    public boolean isTropical() {
        return true;
    }
}

/**
 * Note that getColor() is not implemented, and hence the
 * method must be declared abstract. The class also needs to
 * be declared abstract.
 */
abstract class PartialMango implements Fruit {
    public abstract String getColor();
    public boolean isTropical() { return true; }
}

class MainClass {
    public static void main(String[] args) {
        // Cannot create an instance of an interface, it does not make sense
        //Fruit fruit = new Fruit();

        // Cannot create an instance of an abstract class, it does not make sense
        //AbstractMango abstractMango = new AbstractMango();

        // If you want to prevent creating an instance of a class
        // you can declare it as an abstract class. So the term abstract is
        // largely symbolic.
        //CompleteMango completeMango = new CompleteMango();

        Mango mango = new Mango();
    }
}
