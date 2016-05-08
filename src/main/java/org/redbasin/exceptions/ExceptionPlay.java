package org.redbasin.exceptions;

/**
 * Created by jtanisha-ee on 4/17/16.
 */
public class ExceptionPlay {

    static int i;

    public static void main(String[] args) {

        int[] arr = new int[10];
        arr[10] = 4;

        String age = "20";
        try {
            Integer y = new Integer(age);
            System.out.println("age = " + y);
            int x = y/i;
        } catch (NumberFormatException e) {
            System.err.println("Entered invalid age " + age);
        } catch (Exception e) {
            System.err.println("Some other problem occurred");
        } finally {
            System.out.println("It always comes here");
        }

        try {
            int y = 10;
            System.out.println(y / i);
        } catch (ArithmeticException e) {
            System.err.println("Cannot divide by 0 " + e.getMessage());
        }
        System.out.println("Hello world");

    }
}
