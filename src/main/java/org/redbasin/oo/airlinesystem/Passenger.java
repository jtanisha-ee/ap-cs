/*
 * Copyright (C) Tanisha  - All Rights Reserved.
 * Unauthorized copying of this file, via any medium is strictly prohibited.
 * Proprietary and confidential.
 */

package org.redbasin.oo.airlinesystem;

public class Passenger {

  private String firstName;
  private String lastName;
  FlightInstance flightInstance;
  private Row row;
  private Seat seat;
  private boolean isAdult;

  public Seat getSeat() { return seat; }

  public void setSeat(Seat seat) { this.seat = seat; }
  /**
   * This is constructor for a Terminal.
   */
  public Passenger(
      FlightInstance flightInstance,
      Seat seat,
      String firstName,
      String lastName,
      Row row,
      boolean isAdult
  ) {
    this.flightInstance = flightInstance;
    this.seat = seat;
    this.firstName = firstName;
    this.lastName = lastName;
    this.row = row;
    this.isAdult = isAdult;
  }
}
