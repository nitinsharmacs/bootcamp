package com.tw.step8.assignment3.Unit;

public class Feet implements Unit {
  private final int value;

  public Feet(int value) {
    this.value = value;
  }

  @Override
  public int getValue() {
    return this.value;
  }

  @Override
  public boolean isGreaterThan(Unit unit) {
    return this.value > unit.getValue();
  }

  @Override
  public boolean isEqual(Unit unit) {
    return this.value == unit.getValue();
  }

}
