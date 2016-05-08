package org.redbasin.sort2016;

/**
 * Created by jtanisha-ee on 4/9/16.
 */
public class SelectionSort {

    public static int[] sort(int[] numbers) {
        int count = 0;
        for (int i = 0; i < numbers.length; i++) {
            int min = numbers[i];
            int minIndex = i;
            for (int j = i+1; j < numbers.length; j++) {
                count++;
                if (numbers[j] < min) {
                    min = numbers[j];
                    minIndex = j;
                }
            }
            numbers[minIndex] = numbers[i];
            numbers[i] = min;
        }
        System.out.println("Number of comparisons = " + count);
        return numbers;
    }

    public static void print(int[] numbers) {
        for (int i = 0; i < numbers.length; i++) {
            System.out.print(numbers[i] + ", ");
        }
    }

    public static void main(String[] args) {
        int[] numbers = {1, 2, 3, 4, 5, 6};
        //int[] numbers = new int[7];
        //for (int i = 0; i < 5; i++) {
          //  int r = (int)(Math.random()*100);
            //numbers[i] = r;
        //}

        print(numbers);
        System.out.println();
        print(sort(numbers));
    }
}
