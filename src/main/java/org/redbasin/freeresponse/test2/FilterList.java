/*
 * Copyright (C) Tanisha (aceso1999@gmail.com) - All Rights Reserved.
 * Unauthorized copying of this file, via any medium is strictly prohibited.
 * Proprietary and confidential.
 */

package org.redbasin.freeresponse.test2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import org.redbasin.sort.Sort;

/**
 * @author tanisha on 4/26/15.
 */
public class FilterList {

  public static List<Integer> filterList(List<Integer>  a, List<Integer> b) {
    Collections.sort(a);   // you can also use the merge sort method
    Collections.sort(b);
    Integer[] arr_a = a.toArray(new Integer[a.size()]);
    Integer[] arr_b = b.toArray(new Integer[b.size()]);
    sort(arr_a, 0, a.size()-1);
    for (int i = a.size()-1; i >= 0; i--) {
      if (b.contains(a.get(i))) a.remove(i);
    }
    return a;
  }

  public static void main(String[] args) {
    List<Integer> a = new ArrayList<Integer>();
    a.add(4);
    a.add(2);
    a.add(19);
    a.add(11);
    a.add(6);
    a.add(14);
    a.add(10);
    a.add(1);
    a.add(8);
    List<Integer> b = new ArrayList<Integer>();
    b.add(7);
    b.add(8);
    b.add(3);
    b.add(9);
    b.add(11);
    filterList(a, b);
    System.out.println(a.toString());
  }

  public static String print(Integer a[]) {
    StringBuffer sb = new StringBuffer();
    for (int i = 0; i < a.length; i++)
      sb.append(a[i] + " ");
    return sb.toString();
  }

  public static void sort(Integer a[], int left, int right) {
    if (right == left) return;
    int middle = (left+right)/2;
    sort(a, left, middle);
    sort(a, middle+1, right);
    System.out.println("Current state: " + print(a));
    merge (a, left, middle, right);
  }

  // Loop until one of the sublists is finished, adding the
// smaller of the first elements of each list to merged list
  public static void merge(Integer a[], int left, int middle, int right) {
    Integer tmpArray[] = new Integer[right - left + 1];
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
