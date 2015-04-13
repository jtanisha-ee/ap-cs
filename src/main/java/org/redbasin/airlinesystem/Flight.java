
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

   /**
    * This is constructor for a flight.
    */
   public Flight(Plane plane, String flightNo, String airlineName) {
     this.airlineName = airlineName;
     this.flightNo = flightNo;
     this.plane = plane;
   }

}
