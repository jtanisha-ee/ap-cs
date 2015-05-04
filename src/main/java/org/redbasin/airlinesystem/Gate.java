/*
 * Copyright (C) Tanisha  - All Rights Reserved.
 * Unauthorized copying of this file, via any medium is strictly prohibited.
 * Proprietary and confidential.
 */

package org.redbasin.airlinesystem;


public class Gate {

  private String gateName;
  private Terminal terminal;

  /**
   * This is constructor for a Gate.
   */
  public Gate(String gateName, Terminal terminal) {
    this.gateName = gateName;
    this.terminal = terminal;
  }
}
