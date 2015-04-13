
/**
 * This is for example SFO or San Francisco International Airport.
 */
public class Airport {

   private String airportName;
   private Terminal[] terminals;
   private Runway[] runways;

   /**
    * This is constructor for a airport.
    */
   public Airport(String airportName, Terminal[] terminals, Runway[] runways) {
     this.airportName = airportName;
     this.terminals = terminals;
     this.runways = runways;
   }

}
