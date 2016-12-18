/*
 * Copyright (C) Tanisha  - All Rights Reserved.
 * Unauthorized copying of this file, via any medium is strictly prohibited.
 * Proprietary and confidential.
 */

package org.redbasin.oo.airlinesystem;

/**
 * This is for example SFO or San Francisco International Airport.
 */
public class Airport {

  private String airportName;
  private Terminal[] terminals;
  private Runway[] runways;

  /**
   * This is constructor for a airport.
   */
  public Airport(String airportName, Terminal[] terminals, Runway[] runways) {
    this.airportName = airportName;
    this.terminals = terminals;
    this.runways = runways;
  }

}
