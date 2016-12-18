package org.redbasin.algorithms.sort;

/**
 * Created by jtanisha-ee on 4/16/16.
 */
public class MSort {

    public static void sort(int[] a, int left, int right) {
        if (left == right) return;
        int middle = (left + right)/2;
        sort (a, left, middle);
        sort (a, middle+1, right);
        merge(a, left, middle, right);
    }

    public static void merge(int[] a, int left, int middle, int right) {
        int[] tmpArray = new int[right-left+1];
        int index1 = left;
        int index2 = middle+1;
        int indx = 0;
        while (index1 <= middle && index2 <= right) {
            if (a[index1] < a[index2]) {
                tmpArray[indx] = a[index1];
                index1++;
            } else {
                tmpArray[indx] = a[index2];
                index2++;
            }
            indx++;
        }
        while (index1 <= middle) {
            tmpArray[indx] = a[index1];
            indx++;
            index1++;
        }
        while (index2 <= right) {
            tmpArray[indx] = a[index2];
            indx++;
            index2++;
        }
        for (int ind = 0; ind < right-left+1; ind++) {
            a[left+ind] = tmpArray[ind];
        }

    }

    public static String print(int a[]) {
        StringBuffer sb = new StringBuffer();
        for (int i = 0; i < a.length; i++)
            sb.append(a[i] + " ");
        return sb.toString();
    }

    public static void main(String[] args) {
        int[] a = {9, 5, 1, 4, 3, 7, 2, 6};
        System.out.println("Before sorting: " +  print(a));
        sort(a, 0, a.length-1);
        System.out.println("After sorting: " + print(a));

    }
}
