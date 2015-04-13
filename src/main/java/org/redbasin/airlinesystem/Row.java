
public class Row {

   private int rowNo;
   private SeatingClass seatingClass; // first class, business class
   private Plane plane;

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
