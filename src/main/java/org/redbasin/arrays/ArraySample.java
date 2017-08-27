package org.redbasin.arrays;

/**
 * Created by manojjoshi on 6/11/17.
 */
public class ArraySample {


    public static void main(String[] args) {
        // 1d arrays, of primitives, int literals
        int[] scores = {0, 2, 3, 4, 2, 6, 7};

        // 1d array of doubles, 5 is converted to double
        double[] avgs = {2.3, 1.2, 5, 7.01};

        Student student1 = new Student();
        Student student2 = new Student();
        Student student3 = new Student();
        Student student4 = new Student();
        Student student5 = new Student();
        Student student6 = new Student();
        Student student7 = new Student();
        Student student8 = new Student();
        Student student9 = new Student();

        // 1d array of students
        Student[] students = {student1, student2, student3};

        Student[] studentArr = new Student[9];
        // Using a for loop
        for (int i = 0; i < 9; i++) {
            studentArr[i] = new Student();
        }

        // 2d array of classroom
        Student[][] students1 = {
                {student1, student2, student3},
                {student4, student5, student6},
                {student7, student8, student9}
        };
    }
}

class Student {
    String name;
    boolean gender;  // 0 is male, 1 is female
}
