/*
 * Copyright (C) Tanisha  - All Rights Reserved.
 * Unauthorized copying of this file, via any medium is strictly prohibited.
 * Proprietary and confidential.
 */

package org.redbasin.classwork8.solution;

public class TimeRecord {
    private int hours;
    private int minutes;  // 0 <= minutes < 60
    /** Constructs a TimeRecord object
     * @param h the number of hours
     *        Precondition: h >= 0
     * @param m the number of minutes
     *        Precondition: 0 <= m < 60
     */
    public TimeRecord(int h, int m) {
        hours = h;
        minutes = m;
    }

     /** @return the number of hours
      */
    public int getHours() {
        return hours;
    }

     /** @return the number of minutes
      * Postcondition: 0 <= minutes < 60
      */
    public int getMinutes() {
        return minutes;
    }

     /** Adds h hours and m minutes to this TimeRecord.
      * @param h the number of hours
      * Precondition: h >= 0
      * @param m the number of minutes
      * Precondition: m >= 0
      */
      public void advance(int h, int m) {
           hours = hours + h;
           minutes = minutes + m;
           hours = hours + minutes / 60;
           minutes = minutes % 60;
      }

      public static void main(String[] args) {
           TimeRecord[] timeCards = new TimeRecord[100];
           /* for (int i = 0; i < timeCards.length; i++) {
               int m = (int)(Math.random() * 59);
               int h = (int)(Math.random() * 50);
               timeCards[i] = new TimeRecord(h, m);
           } */
           TimeRecord total = new TimeRecord(0, 0);
           for (int k = 0; k < timeCards.length; k++) {
               int m = (int)(Math.random() * 59);
               int h = (int)(Math.random() * 50);
               timeCards[k] = new TimeRecord(h, m);
               System.gc();
              total.advance(timeCards[k].getHours(), timeCards[k].getMinutes());
           }
           System.out.println("Total time = " + total.getHours() +
               " hours and " + total.getMinutes() + " minutes" );
      }
}