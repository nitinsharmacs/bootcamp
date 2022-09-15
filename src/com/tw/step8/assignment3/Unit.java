package com.tw.step8.assignment3;

public enum Unit {
  FT(300),
  IN(25),
  CM(10),
  MM(1);


  private final int mmValue;

  Unit(int mmValue) {
    this.mmValue = mmValue;
  }

  public int toMM() {
    return this.mmValue;
  }
}
