package org.redbasin.algorithms.digits;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by manojjoshi on 7/9/17.
 */
public class ExtractDigitsList {

    /**
     * We use list to generate numbers in the order
     * they were originally in. Also, list works
     * better than array because we do not know how
     * many digits are in the number x.
     * @param args
     */
    public static void main(String[] args) {
        int z = 3;
        int x = 8138756;
        int counter = 0;
        List<Integer> list = new ArrayList();
        while (x >= 10) {
            if (counter != 0)
                x = x / 10;
            int y = x % 10;
            list.add(0, y);  //works like insert
            //list.add(y);  // works like append
            //System.out.println("Digit = " + y);
            counter++;
        }
        System.out.println(list);
        for (int i = 0; i < list.size(); i++) {
            System.out.print(list.get(i));
        }
    }
}
