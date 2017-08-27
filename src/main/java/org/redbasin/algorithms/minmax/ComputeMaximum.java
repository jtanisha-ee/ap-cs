package org.redbasin.algorithms.minmax;

/**
 * Created by manojjoshi on 6/25/17.
 */
public class ComputeMaximum {

    // Scores are always positive
    public static int getMax(int scores[]) {
        // 0 is my least possible max value
        int max = 0;
        // <initialization> ; termination condition ; increment/decrement
        for (int i = 0; i < scores.length; i++) {
            if (scores[i] > max) {
                max = scores[i];
            }
        }
        return max;
    }

    public static void main(String[] args) {
        int[] scores = {65, 91, 31, 68, 72, 93, 82};
        int max = getMax(scores);
        System.out.println("max = " + max);
    }

}
