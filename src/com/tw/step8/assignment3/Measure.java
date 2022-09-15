package com.tw.step8.assignment3;

public class Measure {

  private final int value;
  private final Unit unit;

  public Measure(int value, Unit unit) {
    this.value = value;
    this.unit = unit;
  }

  public int toMM() {
    return this.value * this.unit.toMM();
  }
}
