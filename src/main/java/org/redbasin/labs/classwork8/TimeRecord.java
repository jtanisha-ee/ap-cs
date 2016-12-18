/*
 * Copyright (C) Tanisha  - All Rights Reserved.
 * Unauthorized copying of this file, via any medium is strictly prohibited.
 * Proprietary and confidential.
 */

package org.redbasin.labs.classwork8;

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
        // implementation now shown
        return 0;
    }

     /** @return the number of minutes
      * Postcondition: 0 <= minutes < 60
      */
    public int getMinutes() {
        // implementation not shown
        return 0;
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
           /*
             missing code
           */
      }
// Other methods not shown

}