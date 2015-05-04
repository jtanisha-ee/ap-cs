/*
 * Copyright (C) Tanisha  - All Rights Reserved.
 * Unauthorized copying of this file, via any medium is strictly prohibited.
 * Proprietary and confidential.
 */

package org.redbasin.airlinesystem;

public class Runway {

  private Airport airport;
  private int runwayNo;

  /**
   * This is constructor for a Runway
   */
  public Runway(int runwayNo, Airport airport) {
    this.runwayNo = runwayNo;
    this.airport = airport;
  }

}
