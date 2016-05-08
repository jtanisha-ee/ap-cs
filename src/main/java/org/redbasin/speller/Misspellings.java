package org.redbasin.speller;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by jtanisha-ee on 4/24/16.
 */
public class Misspellings {

    private Map<String, String[]> spellingMap = new HashMap<>();

    public void initMap() {
        spellingMap.put("p", new String[] {"o", "l", ";", "[", "0"});
        spellingMap.put("r", new String[] {"e", "4", "5", "t", "f"});
        spellingMap.put("i", new String[] {"u", "k", "l"});
        spellingMap.put("z", new String[] {"a", "s", "x"});
        spellingMap.put("e", new String[] {"w", "s", "d", "f", "r"});
    }

    /**
     * Generates a misspelling randomly.
     * @param word
     * @return
     */
    public String generate(String word) {
        int offset = (int)(Math.random()*word.length());
        String c = Character.toString(word.charAt(offset));
        System.out.println("random char is " + c);
        String[] options = spellingMap.get(c);
        int arrayOffset = (int)(Math.random()*options.length);
        String misspellChar = options[arrayOffset];
        String misspelled = word.substring(0, arrayOffset) + misspellChar
                + word.substring(arrayOffset+1, word.length());
        System.out.println("misspelled word = " + misspelled);
        return misspelled;
    }

    public static void main(String[] args) {
        String word = "prize";
        Misspellings misspellings = new Misspellings();
        misspellings.initMap();
        System.out.println(misspellings.generate(word));


    }
}
