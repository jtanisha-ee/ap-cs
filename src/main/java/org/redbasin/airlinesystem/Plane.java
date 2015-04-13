
/**
 * This is a specific model construction by Boeing, Airbus
 * Example Boeing 777.
 */
public class Plane {

   private String modelNo;
   private String manufacturerName;
   private Row[] rows;
   private Seat[] seats;

   /**
    * This is constructor for plane.
    */
   public Plane(String manufacturerName, String modelNo, Row[] rows, Seat[] seats) {
     this.manufacturerName = manufacturerName;
     this.modelNo = modelNo;
     this.rows = rows;
     this.seats = seats;
   }
}
