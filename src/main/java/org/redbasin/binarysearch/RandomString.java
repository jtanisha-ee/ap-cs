package org.redbasin.binarysearch;

import java.util.UUID;

/**
 * Created by manojjoshi on 10/22/17.
 */
public class RandomString {


    public static void main(String[] args) {
        for (int i = 0; i < 100; i++) {
            UUID idOne = UUID.randomUUID();
            System.out.println(idOne);
        }
    }
}
