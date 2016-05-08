package org.redbasin.sort;

/**
 * Created by jtanisha-ee on 4/16/16.
 */
public class MergingSort {

    public static void divide(int[] a, int left, int right) {
        if (right == left) return;
        int middle = (left + right)/2;
        divide(a, left, middle);
        divide(a, middle+1, right);
        merge(a, left, middle, right);
    }

    public static void merge(int[] a, int left, int middle, int right) {
        int b = 0b101;
    }
}
