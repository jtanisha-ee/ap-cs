package org.redbasin.algorithms.binarysearch;

/**
 * Created by manojjoshi on 7/31/16.
 */
public class BinarySearchAlt {
    public static char[] list = {'a', 'b', 'c', 'd', 'e', 'f', 'g'};

    /**
     * Find the index of an element in an array for a specific character.
     * @param alphabet it can be "Mon", "Tue", etc....
     * @return
     */
    public static int findIndex(char alphabet) {
        int middle = list.length/2;
        int newMiddle;
        int left = 0;
        int right = list.length-1;
        while (true) {
            if (alphabet > list[middle]) {
                left = middle;
                newMiddle = (left + right)/2;
                if (newMiddle == middle) {
                    System.out.println("Did not find " + alphabet);
                    return -1;
                } else
                    middle = newMiddle;
            } else if (alphabet < list[middle]) {
                right = middle;
                newMiddle = (left + right)/2;
                if (newMiddle == middle) {
                    System.out.println("Did not find " + alphabet);
                    return -1;
                } else
                    middle = newMiddle;
            } else { // alphabet is exactly equal to list[middle]
                // if we come here, we found the element!
                return middle;
            }
        }
    }

    public static void main(String[] args) {
         int middle = findIndex('f');
        System.out.println("Index of f is: " + middle);
        middle = findIndex('l');
        System.out.println("Index of l is: " + middle);
    }

}
