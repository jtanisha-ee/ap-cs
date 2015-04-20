package org.redbasin.airlinesystem;

/**
 * For example the Singapore Airlines is an Airline object.
 */
public class Airline {

  private String airlineName;
  private Flight[] flights;

  /**
   * This is constructor for a Airline.
   */
  public Airline(String airlineName, Flight[] flights) {
    this.airlineName = airlineName;
    this.flights = flights;
  }
}
