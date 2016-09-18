package org.redbasin.algorithms;

/**
 * Created by manojjoshi on 9/11/16.
 */
public class MatrixTopTwo {

    public static int[][] createMatrix(int rows, int cols) {
        int[][] m = new int[rows][cols];
        for (int i = 0; i < m.length; i++) {
            m[i] = new int[cols];
            for (int j = 0; j < cols; j++) {
                // generate random no between 10 and 20
                int rand = 10 + (int) (Math.random() * 100);
                m[i][j] = rand;
            }
        }
        return m;
    }

    public static int[] topTwo(int[][] m) {
        int first = Integer.MIN_VALUE;
        int second = Integer.MIN_VALUE;
        int[] rankers = new int[2];
        for (int i = 0; i < m.length; i++) {
            for (int j = 0; j < m[i].length; j++) {
                if (m[i][j] > first) {
                    second = first;
                    first = m[i][j];
                } else {
                    if (m[i][j] > second) {
                        second = m[i][j];
                    }
                }
            }
        }
        rankers[0] = first;
        rankers[1] = second;
        return rankers;
    }

    public static void print(int[][] m) {
        for (int i = 0; i < m.length; i++) {
            for (int j = 0; j < m[i].length; j++) {
                System.out.print(m[i][j] + " ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        int[][] m = createMatrix(10, 10);
        print(m);
        int[] rankers = topTwo(m);
        System.out.println("first = " + rankers[0]);
        System.out.println("second = " + rankers[1]);
    }
}
