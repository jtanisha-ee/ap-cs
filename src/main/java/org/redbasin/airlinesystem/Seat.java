package org.redbasin.airlinesystem;

public class Seat {

   private char position;
   private Row row;

   /**
    * This could seat 9A, or 9B, so the position is A or B etc.
    */
   public Seat(char position, Row row) {
     this.position = position;
     this.row = row;
   }

}
