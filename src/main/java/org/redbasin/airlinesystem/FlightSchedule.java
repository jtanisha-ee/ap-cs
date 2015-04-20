package org.redbasin.airlinesystem;


/**
 * Flight schedule could be a flight that starts at 3 PM
 * from gate no 62 from SFO source airport and going to
 * Denver airport.
 */
public class FlightSchedule {

  private Airport sourceAirport;
  private Airport destAirport;
  private String flightTime;
  private String arrivalTime;
  private Flight flight;
  private Gate gate;

  private Row[] rows;

  /**
   * This is constructor for flight schedule.
   */
  public FlightSchedule(
      Flight flight,
      Airport sourceAirport,
      Airport destAirport,
      String arrivalTime,
      String flightTime,
      Gate gate) {
    this.flight = flight;
    this.sourceAirport = sourceAirport;
    this.destAirport = destAirport;
    this.flightTime = flightTime;
    this.arrivalTime = arrivalTime;
    this.gate = gate;
    createSeats();
  }

  public void createSeats() {
    int numRows = flight.getPlane().getNumRows();
    rows = new Row[numRows];
    int numSeats = flight.getPlane().getNumSeats();
    for (int i = 0; i < rows.length; i++) {

      rows[i] = new Row(i, new SeatingClass("Economy"), flight.getPlane());
      Seat[] seats = new Seat[numSeats];
      for (int j = 0; j < seats.length; j++) {
        seats[i] = new Seat(j, rows[i]);
      }
      rows[i].setSeats(seats);
    }
  }


}
