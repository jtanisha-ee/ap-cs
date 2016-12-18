/*
 * Copyright (C) Tanisha  - All Rights Reserved.
 * Unauthorized copying of this file, via any medium is strictly prohibited.
 * Proprietary and confidential.
 */

package org.redbasin.oo.inheritance.school;

public class MathTeacher extends Teacher {
  public String mathSubject;

  public void printInfo() {
    System.out.println("school = " + school);
    System.out.println("subject = " + subject);
    System.out.println("mathSubject = " + mathSubject);
  }
}