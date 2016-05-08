package org.redbasin.keyboard;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by jtanisha-ee on 4/17/16.
 */
public class Misspeller {
    public static Map<String, String[]> map = new HashMap<>();

    public static void main(String[] args) {
        map.put("a", new String[] {"q", "w", "s", "z"});
        map.put("b", new String[] {"v", "g", "h", "n"});
        map.put("c", new String[] {"x", "d", "f", "v"});
        map.put("d", new String[] {"s", "e", "r", "f", "c", "x"});
        map.put("e", new String[] {"w", "3", "4", "r", "d", "s"});
        map.put("f", new String[] {"d", "r", "t", "g", "v", "c"});
        map.put("g", new String[] {"f", "t", "y", "h", "b", "v"});
        map.put("h", new String[] {"g", "y", "u", "j", "n", "b"});

        String word = "bead";

        // Step 1: pick a random letter from "bag"
        int x = (int)(Math.random()*word.length());
        char c = word.charAt(x);
        System.out.println("c = " + c);

        // Step 2: pick a random misspelling for that letter

        String[] chars = map.get(String.valueOf(c));
        print(chars);

        int y = (int)(Math.random()*chars.length);
        String z = chars[y];

        String misspelling = word.substring(0, x) + z + word.substring(x+1, word.length());
        System.out.println("misspelling = " + misspelling);

        String s = "bag";  // lets run the test for third char
        System.out.println(s.substring(0, 2) + "t" + s.substring(3, 3));
    }

    public static void print(String[] chars) {
        for (int i = 0; i < chars.length; i++) {
            System.out.print(chars[i] + ",");
        }
        System.out.println();
    }
}
