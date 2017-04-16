package org.redbasin.binarysearch;

/**
 * Created by manojjoshi on 4/9/17.
 * Binary search works on pre sorted array/list of elements.
 */
public class BinarySearch {

    public static int findNumber(int[] inArr, int candidate) {
        int startOffset = 0;
        int stopOffset = inArr.length - 1;
        int middleOffset = -1;
        boolean found = false;
        while (!found) {
            middleOffset = (startOffset + stopOffset)/2;
            int middle = inArr[middleOffset];
            if (candidate > middle) {
                startOffset = middleOffset;
            } else if (candidate < middle) {
                stopOffset = middleOffset;
            } else {
                found = true;
            }
            if (!found && (startOffset == (stopOffset -1))) {
                return -1;
            }
        }
        return middleOffset;
    }

    public static void main(String[] args) {
        // one way to define an array
        int[] x = new int[100];

        // another way to define an array
        int[] y = {1, 3, 7, 14, 71, 85, 93, 107, 121, 134, 155, 186, 234, 275};
        int ind = findNumber(y, 156);
        System.out.println("index of 156 is " + ind);

    }
}
