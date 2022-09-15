package com.tw.step8.assignment3;

public class Measure {

  private final double value;
  private final Unit unit;

  public Measure(double value, Unit unit) {
    this.value = value;
    this.unit = unit;
  }

  public double evaluate() {
    return this.value * this.unit.getBaseValue();
  }
}
