/*
 * Copyright (C) Tanisha - All Rights Reserved.
 * Unauthorized copying of this file, via any medium is strictly prohibited.
 * Proprietary and confidential.
 */

package org.redbasin.interfaces;

/**
 * The TeacherCoordinator sees only the Teacher view of the MusicTeacher.
 *
 * @author tanisha on 11/22/15.
 */
public class TeacherCoordinator {
  public void printSubject(Teacher teacher) {
    System.out.println(teacher.getSubject());
  }
}
