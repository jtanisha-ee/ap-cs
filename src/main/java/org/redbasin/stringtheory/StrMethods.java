package org.redbasin.stringtheory;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by manojjoshi on 12/17/17.
 */
public class StrMethods {

    String s = "Democrats on Capitol Hill say they aren't giving up on their fight to preserve Obama-era net neutrality rules, which were eliminated Thursday by Republicans in the FCC." +
            "" +
            "U.S. Sens. Ed Markey of Massachusetts and Brian Schatz of Hawaii are leading more than a dozen senators to introduce a Congressional Review Act resolution aimed at undoing the FCC's actions and fully restoring net neutrality rules. Democratic Senate leader Charles Schumer of New York signed on to the effort Friday.\n" +
            "" +
            "US Sen. Brian Schatz, a Democrat from Hawaii, says his party is ready to fight to keep net neutrality protections in place.\n" +
            "US Sen. Brian Schatz, a Democrat from Hawaii, says his party is ready to fight to keep net neutrality protections in place. \n" +
            "" +
            "Chip Somodevilla/Getty Images\n" +
            "U.S. Rep. Mike Doyle of Pennsylvania's 14th District is leading a similar legislative path in the House.";

    public static List<String> split(String sentence) {
        List<String> myList = new ArrayList<>();
        String word = "";

        for (int ii = 0; ii < sentence.length(); ii++) {
            char c = sentence.charAt(ii);
            if (c != ' ') {
                word = word + c;
            } else {
                myList.add(word);
                word = "";
            }
        }
        myList.add(word);
        return myList;
    }

    public static void main(String[] args) {
        String s = "hello";
        System.out.println(s.length());
        System.out.println(s.charAt(4));
        System.out.println(s.substring(2));
        System.out.println(s.substring(1, 3));

        String sentence = "Quick brown fox jumps over the lazy dog";
        System.out.println(split(sentence));
    }
}
