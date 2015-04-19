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
   }

}
