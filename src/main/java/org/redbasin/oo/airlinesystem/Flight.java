/*
 * Copyright (C) Tanisha  - All Rights Reserved.
 * Unauthorized copying of this file, via any medium is strictly prohibited.
 * Proprietary and confidential.
 */

package org.redbasin.oo.airlinesystem;


/**
 * This is a specific flight operated by an Airline.
 * Example Flight no 002 from Singapore Airlines. It may
 * multiple routes, and it will have multiple schedules.
 * The source and destination airports also can be changed.
 */
public class Flight {

  private String flightNo;
  private String airlineName;
  private Plane plane;

  public String getAirlineName() {
    return airlineName;
  }

  public String getFlightNo() {
    return flightNo;
  }

  public Plane getPlane() {
    return plane;
  }

  /**
   * This is constructor for a flight.
   */
  public Flight(Plane plane, String flightNo, String airlineName) {
    this.airlineName = airlineName;
    this.flightNo = flightNo;
    this.plane = plane;
  }

}
