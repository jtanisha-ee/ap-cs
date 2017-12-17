package org.redbasin.algorithms.maps;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by manojjoshi on 8/13/17.
 */
public class StringMap {
    List<String> keys = new ArrayList<String>();
    List<String> values = new ArrayList<String>();

    public boolean exists(String key) {
        for (int i = 0; i < keys.size(); i++) {
            if (key.equals(keys.get(i))) {
                return true;
            }
        }
        return false;
    }

    public void put(String key, String value) {
        if (!exists(key)) {
            keys.add(key);
            values.add(value);
        }
    }

    public int size() {
        return keys.size();
    }

    public String get(String key) {
        int counter = 0;
        while (counter < keys.size()) {
            if (key.equals(keys.get(counter))) {
                return values.get(counter);
            }
            counter++;
        }
        return null;
    }

    public int remove(String key) {
        return 0;  // TODO
    }
}



