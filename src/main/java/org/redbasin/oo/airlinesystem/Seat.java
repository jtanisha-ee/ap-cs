/*
 * Copyright (C) Tanisha  - All Rights Reserved.
 * Unauthorized copying of this file, via any medium is strictly prohibited.
 * Proprietary and confidential.
 */

package org.redbasin.oo.airlinesystem;

public class Seat {

  private int position;
  private Row row;
  private boolean booked = false;
  private Passenger passenger;


  public boolean isBooked() {
    return booked;
  }

  public int getPosition() {
    return position;
  }

  public Row getRow() {
    return row;
  }

  public void setPosition(int position) {
    this.position = position;
  }

  public void setRow(Row row) {
    this.row = row;
  }

  public void setBooked(boolean booked) {
    this.booked = booked;
  }

  public void setPassenger(Passenger passenger) { this.passenger = passenger; }

  public Passenger getPassenger() { return passenger; };

  /**
   * This could seat 9A, or 9B, so the position is A or B etc.
   */
  public Seat(int position, Row row) {
    this.position = position;
    this.row = row;
  }

}
