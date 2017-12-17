package org.redbasin.algorithms.maps;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by manojjoshi on 9/10/17.
 */
public class EasyMap {

    List<Integer> keyList = new ArrayList<>();
    List<String> valueList = new ArrayList<>();

    public boolean exists(Integer key) {
        for (int i = 0; i < keyList.size(); i++) {
            if (key == keyList.get(i)) {
                return true;
            }
        }
        return false;
    }

    public void put(Integer key, String value) {
        if (!exists(key)) {
            keyList.add(key);
            valueList.add(value);
        }
    }
}

