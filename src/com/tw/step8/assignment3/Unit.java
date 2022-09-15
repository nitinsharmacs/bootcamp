package com.tw.step8.assignment3;

public enum Unit {
  FT(300),
  IN(25),
  CM(10),
  MM(1),
  GAL(3.78);


  private final double baseValue;

  Unit(double baseValue) {
    this.baseValue = baseValue;
  }

  public double getBaseValue() {
    return this.baseValue;
  }
}
