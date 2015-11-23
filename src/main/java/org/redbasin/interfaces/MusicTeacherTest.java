/*
 * Copyright (C) Tanisha - All Rights Reserved.
 * Unauthorized copying of this file, via any medium is strictly prohibited.
 * Proprietary and confidential.
 */

package org.redbasin.interfaces;

/**
 * Even though we send a MusicTeacher object to printSubject method of the TeacherCoordinator
 * the MusicTeacher gets implicitly casted to a Teacher.
 *
 * Similarly when we send a MusicTeacher object to printInstrument method of the MusicianCoordinator
 * the MusicTeacher gets implicitly casted to a Musician.
 *
 * @author tanisha on 11/22/15.
 */
public class MusicTeacherTest {
  public static void main(String[] args) {
    Instrument clarinet = new Instrument("clarinet");
    Subject biology = new Subject("biology");
    MusicTeacher musicTeacher = new MusicTeacher(clarinet, biology);

    TeacherCoordinator teacherCoordinator = new TeacherCoordinator();
    teacherCoordinator.printSubject(musicTeacher);

    MusicianCoordinator musicianCoordinator = new MusicianCoordinator();
    musicianCoordinator.printInstrument(musicTeacher);
  }
}
