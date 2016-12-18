/*
 * Copyright (C) Tanisha - All Rights Reserved.
 * Unauthorized copying of this file, via any medium is strictly prohibited.
 * Proprietary and confidential.
 */

package org.redbasin.oo.airportsched;

/**
 * @author tanisha on 3/20/16.
 */
public class Flight {
  String timeIdentifier;    // a unique identifier to distinguish flights
  Airline airline;   // eg. Swiss Air
  Crew[] crewMembers;    // eg. about 6 crew employees assigned to this flight
  Route route;    // source and destination
  ATerminal sourceTerminal;
  ATerminal destTerminal;
  Passenger[] passengers;
  PlaneSeat[] planeSeats;   // these are all the seats

}
