
public class Passenger {

   private String firstName;
   private String lastName;
   FlightSchedule flightSchedule;
   private Row row;
   private Seat seat;
   private boolean isAdult;

   /**
    * This is constructor for a Terminal.
    */
   public Passenger(
	FlightSchedule flightSchedule,
	Seat seat,
        String firstName,
        String lastName,
        Row row,
        boolean isAdult
	) {
        this.flightSchedule = flightSchedule;
        this.seat = seat;
        this.firstName = firstName;
        this.lastName = lastName;
        this.row = row;
        this.isAdult = isAdult;
   }
}
