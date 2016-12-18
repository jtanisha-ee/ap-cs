/*
 * Copyright (C) Tanisha  - All Rights Reserved.
 * Unauthorized copying of this file, via any medium is strictly prohibited.
 * Proprietary and confidential.
 */

package org.redbasin.oo.inheritance.school;

public class SchoolTest {
   public static void main(String[] args) {
      MathTeacher mteacher = new MathTeacher();
      mteacher.mathSubject = "Calculus";
      mteacher.subject = "Math";
      mteacher.school = "EVHS";

      Educator educator = (Educator)mteacher;
      System.out.println("type of educator = " + educator.getClass().getName());
      System.out.println("educator.school = " + educator.school);

      Teacher teacher = (Teacher)mteacher;
      System.out.println("type of teacher = " + teacher.getClass().getName());
      System.out.println("teacher.school = " + teacher.school);
      System.out.println("teacher.subject = " + teacher.subject);

      MathTeacher m1teacher = (MathTeacher)teacher;
      System.out.println("type of m1teacher = " + m1teacher.getClass().getName());
      System.out.println("m1teacher.school = " + m1teacher.school);
      System.out.println("m1teacher.subject = " + m1teacher.subject);
      System.out.println("m1teacher.mathSubject = " + m1teacher.mathSubject);

      Teacher teacher1 = new Teacher();
      teacher1.school = "EVHS";
      MathTeacher mteacher1 = (MathTeacher)teacher1;   // now allowed
      System.out.println("type of mteacher1 = " + mteacher1.getClass().getName());
      mteacher1.mathSubject = "Precalculus";
      System.out.println("mteacher1.mathSubject = " + mteacher1.mathSubject);
   }
}
