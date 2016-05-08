package org.redbasin.sort;

/**
 * Created by jtanisha-ee on 4/15/16.
 */
public class InsertionSort {

    public static void sort(int[] a) {
        for (int k = 1; k < a.length; k++) {
            int itemToInsert = a[k];
            int j = k-1;
            boolean keepGoing = true;
            while (j >= 0 && keepGoing) {
                if (itemToInsert < a[j]) {
                   a[j+1] = a[j];
                   j--;
                   if (j == -1) {
                       a[0] = itemToInsert;
                   }
                } else {
                    keepGoing = false;
                    a[j+1] = itemToInsert;
                }
            }
            print(a);
        }
    }

    public static void print(int[] z) {
        for (int i = 0; i < z.length; i++) {
            System.out.print(z[i] + ", ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        int NUM = 10;  // choose NUM random numbers
        int[] x = new int[NUM];
        for (int i = 0; i < NUM; i++) {
            x[i] = (int) (Math.random() * 100);   // rnd no bet 1 and 100
        }

        print(x);
        sort(x);
        print(x);
    }
}
