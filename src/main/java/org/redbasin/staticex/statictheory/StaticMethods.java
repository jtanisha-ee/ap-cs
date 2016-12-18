/*
 * Copyright (C) Tanisha  - All Rights Reserved.
 * Unauthorized copying of this file, via any medium is strictly prohibited.
 * Proprietary and confidential.
 */

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package org.redbasin.staticex.statictheory;

/**
 * static variables are variables that are shared across all instances of a class.
 * These variables are available, before an instance of the class is created.
 *
 * @author redbasin
 */
 public class StaticMethods {

    static int age = 10;

    /**
     * This method is static, as we want to call it without creating an instance of
 the object StaticMethods.
     *
     * @return
     */
    public static int getAge() {
        return age;
    }

    /**
     * We can call getAge() without creating an instance of StaticMethods, as getAge()
 is a static method.
     *
     * The main is a special method. It always must be called "main", and must take the
     * argument of type String[], as it is designed to take multiple String arguments
     * when a program is executed. The main is an entry point into the program.
     * The main method is always static. THis means that the main() method can be
     * called without creating an instance of the object it contains. This is because
     * the JVM should not need to know how to create an instance of an object before
     * it starts the program.
     *
     * There should only be a unique main method in each program. Two main methods can
     * create ambiguity. The main() method always returns void or nothing. Also the
     * main method is always public so that outsiders can call this method.
     *
     * @param args
     */
    public static void main(String[] args) {
        int myage = getAge();
        System.out.println(myage);

        // certain conditions like divide by zero are not allowed
        // and throw exceptions.
        double d = 1/0;  // demonstrating divide by zero!
    }

}
