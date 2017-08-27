package org.redbasin.algorithms.maps;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by manojjoshi on 8/13/17.
 */
class MyMap {
    List<Integer> keys = new ArrayList<Integer>();
    List<String> values = new ArrayList<String>();

    public void put(int key, String value) {
        keys.add(key);
        values.add(value);
    }

    public String get(int key) {
        int counter = 0;
        while (counter < keys.size()) {
            if (key == keys.get(counter)) {
                return values.get(counter);
            }
            counter++;
        }
        return null;
    }

    public int remove(int key) {

    }
}



