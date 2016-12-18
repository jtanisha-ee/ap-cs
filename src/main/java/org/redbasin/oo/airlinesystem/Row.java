/*
 * Copyright (C) Tanisha  - All Rights Reserved.
 * Unauthorized copying of this file, via any medium is strictly prohibited.
 * Proprietary and confidential.
 */

package org.redbasin.oo.airlinesystem;

public class Row {

  private int rowNo;
  private SeatingClass seatingClass; // first class, business class
  private Plane plane;
  private Seat[] seats;

  public void setSeats(Seat[] seats) {
    this.seats = seats;
  }

  public Seat[] getSeats() {
    return seats;
  }

  public int getRowNo() {
    return rowNo;
  }

  public SeatingClass getSeatingClass() {
    return seatingClass;
  }

  public Plane getPlane() {
    return plane;
  }


  /**
   * This is constructor for a Row.
   */
  public Row(
      int rowNo,
      SeatingClass seatingClass,
      Plane plane) {
    this.rowNo = rowNo;
    this.seatingClass = seatingClass;
    this.plane = plane;
  }
}
