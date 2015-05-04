/*
 * Copyright (C) Tanisha  - All Rights Reserved.
 * Unauthorized copying of this file, via any medium is strictly prohibited.
 * Proprietary and confidential.
 */

package org.redbasin.sort;

import java.util.Arrays;
import java.util.ArrayList;

public class Sort {

   public static void main(String[] args) {
     int[] a = {9, 5, 1, 4, 3, 7, 2, 6};
     System.out.println("Before sorting: " +  print(a));
     sort(a, 0, a.length-1);
     System.out.println("After sorting: " + print(a));
   }

   public static String print(int a[]) {
     StringBuffer sb = new StringBuffer(); 
     for (int i = 0; i < a.length; i++)
       sb.append(a[i] + " ");
     return sb.toString();
   }

   public static void sort(int a[], int left, int right) {
    if (right == left) return;
    int middle = (left+right)/2;
    sort(a, left, middle);
    sort(a, middle+1, right);
    System.out.println("Current state: " + print(a));
    merge (a, left, middle, right);
   }

   // Loop until one of the sublists is finished, adding the
// smaller of the first elements of each list to merged list
  public static void merge(int a[], int left, int middle, int right) {
   int tmpArray[] = new int[right - left + 1];
   int index1 = left;
   int index2 = middle + 1;
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
     // copy merged list from tmpArray to a array
     for (indx = 0; indx < tmpArray.length; indx++) {
           a[left+indx] = tmpArray[indx];
     }    
   }
}
