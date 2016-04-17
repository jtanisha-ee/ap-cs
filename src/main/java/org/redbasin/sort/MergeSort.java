package org.redbasin.sort;

/**
 * Created by jtanisha-ee on 4/15/16.
 */
public class MergeSort {

    static int cnt = 0;

    public static void sort(int a[], int left, int right) {
        System.out.println("Enter sort: " + (++cnt) + ", left = " + left + ", right = " + right);
        if (right == left) return;
        int middle = (left + right) / 2;
        sort(a, left, middle);
        sort(a, middle + 1, right);
        System.out.println("Calling merge: " + (++cnt) + ", left = " + left + ", middle = " + middle + ", right = " + right);
        merge(a, left, middle, right);
    }

    // Loop until one of the sublists is finished, adding the
// smaller of the first elements of each list to merged list
    public static void merge(int a[], int left, int middle, int right) {
        int tmpArray[] = new int[right - left + 1];
        int index1 = left;
        int index2 = middle + 1;
        int indx = 0; // index into tmpArray
        while (index1 <= middle && index2 <= right) {
            if (a[index1] < a[index2]) {
                tmpArray[indx] = a[index1];
                index1++;  // advance the left pointer
            } else {
                tmpArray[indx] = a[index2];
                index2++;  // advance the middle pointer
            }
            indx++;  // advance tmpArray index
        }
// add to the merged list, the remaining elements of whichever // sublist is not yet finished
        while (index1 <= middle) {
            tmpArray[indx] = a[index1];
            index1++;
            indx++;
        }
        while (index2 <= right) {
            tmpArray[indx] = a[index2];
            index2++;
            indx++;
        }
        // copy merged list from tmpArray to array a
        for (int ind = 0; ind < tmpArray.length; ind++) {
            a[left + ind] = tmpArray[ind];
        }
        print(a);
    }

    public static void main(String[] args) {
        int[] x = {9, 5, 1, 4, 3, 7, 2, 6};
        print(x);
        sort(x, 0, x.length - 1);
        print(x);
    }

    public static void print(int[] z) {
        for (int i = 0; i < z.length; i++) {
            System.out.print(z[i] + ",");
        }
        System.out.println();
    }


}
