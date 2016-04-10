package org.redbasin.sort2016;

/**
 * Created by jtanisha-ee on 4/9/16.
 */
public class SelectionSortRandom {

    public static int[] sort(int[] numbers) {
        int count = 0;
        for (int i = 0; i < numbers.length; i++) {
            if (i == numbers.length-1) break;
            int min = numbers[i+1];
            int minIndex = i+1;
            for (int j = i+1; j < numbers.length; j++) {
                count++;
                if (numbers[j] < min) {
                    min = numbers[j];
                    minIndex = j;
                }
            }
            int t = numbers[minIndex];  // swap
            numbers[minIndex] = numbers[i];
            numbers[i] = t;
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
        int[] numbers = new int[7];
        for (int i = 0; i < 7; i++) {
            int r = (int)(Math.random()*100);
            numbers[i] = r;
        }

        print(numbers);
        System.out.println();
        print(sort(numbers));
    }
}
