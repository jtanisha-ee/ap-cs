package org.redbasin.stringtheory;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by manojjoshi on 2/4/18.
 */
public class StringComparison {
    public static void main(String[] args) {
        String s = "hello";
        String s1 = new String("hello");
        String s2 = new String("hello");
        if (s1 == s2) {
            System.out.println("Strings are equal");
        } else {
            System.out.println("String not equal");
        }
        if (s1.equals(s2)) {

            System.out.println("String equal");
        }

        List<String> l1 = new ArrayList<>();
        l1.add("hello");
        System.out.println(l1.get(0));
        if (s1 == l1.get(0)) {
            System.out.println("Strings from list are equal");
        } else {
            System.out.println("String from list not equal");
        }

        l1.add("hello");
        if (l1.get(0) == l1.get(1)) {
            System.out.println("Strings from list are equal");
        } else {
            System.out.println("String from list not equal");
        }
    }
}

