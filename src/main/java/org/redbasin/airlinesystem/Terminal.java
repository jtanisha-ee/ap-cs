package org.redbasin.airlinesystem;

/**
 * A terminal instance is a specific terminal in a specific airport.
 */
public class Terminal {

  private String terminalName;
  private Airport airport;
  private Airline[] airlines;
  private Gate[] gates;

  /**
   * This is constructor for a Terminal.
   */
  public Terminal(String terminalName, Airport airport, Airline[] airlines, Gate[] gates) {
    this.terminalName = terminalName;
    this.airport = airport;
    this.airlines = airlines;
    this.gates = gates;
  }
}
