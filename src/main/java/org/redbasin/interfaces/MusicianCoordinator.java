/*
 * Copyright (C) Tanisha - All Rights Reserved.
 * Unauthorized copying of this file, via any medium is strictly prohibited.
 * Proprietary and confidential.
 */

package org.redbasin.interfaces;

/**
 * The MusicianCoordinator sees only the Musician view of the MusicTeacher.
 *
 * @author tanisha on 11/22/15.
 */
public class MusicianCoordinator {
  public void printInstrument(Musician musician) {
    System.out.println(musician.getInstrument());
  }
}
