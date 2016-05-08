package org.redbasin.sort;

/**
 * Created by jtanisha-ee on 4/10/16.
 */
public class MySelectionSort {

    public static void sort(int[] z) {
        for (int i = 0; i < z.length; i++) {
            int min = z[i];
            int minIndex = i;
            for (int j = i+1; j < z.length; j++) {
                if (z[j] < min) {
                    min = z[j];
                    minIndex = j;
                }
            }
            z[minIndex] = z[i];
            z[i] = min;
        }
    }

    public static void print(int[] z) {
       for (int i = 0; i < z.length; i++) {
           System.out.print(z[i] + ", ");
       }
    }

    public static void main(String[] args) {
        int NUM = 10;  // choose NUM random numbers
        /*int[] x = new int[NUM];
        for (int i = 0; i < NUM; i++) {
            x[i] = (int)(Math.random()*100);   // rnd no bet 1 and 100
        }*/
        int[] x = {1, 2, 3, 4, 5, 6};

        print(x);
        sort(x);
        System.out.println();
        print(x);

    }
}
