package org.redbasin.airlinesystem;


/**
 * This is a specific model construction by Boeing, Airbus
 * Example Boeing 777.
 */
public class Plane {

  private String modelNo;
  private String manufacturerName;
  private int numRows;
  private int numSeats;

  public int getNumSeats() {
    return numSeats;
  }

  public String getModelNo() {
    return modelNo;
  }

  public String getManufacturerName() {
    return manufacturerName;
  }

  public int getNumRows() {
    return numRows;
  }

  /**
   * This is constructor for plane.
   */
  public Plane(String manufacturerName, String modelNo, int numRows, int numSeats) {
    this.manufacturerName = manufacturerName;
    this.modelNo = modelNo;
    this.numRows = numRows;
    this.numSeats = numSeats;
  }
}
