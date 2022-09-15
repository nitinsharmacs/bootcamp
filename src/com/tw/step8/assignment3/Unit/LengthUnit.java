package com.tw.step8.assignment3.Unit;

public enum LengthUnit implements Unit {
  FT(300),
  IN(25),
  CM(10),
  MM(1);


  private final double baseValue;

  LengthUnit(double baseValue) {
    this.baseValue = baseValue;
  }

  public double getBaseValue() {
    return this.baseValue;
  }
}
