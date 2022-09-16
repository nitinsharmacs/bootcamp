package com.tw.step8.assignment3.Unit;

public enum VolumeUnit implements Unit {
  GAL(3.78),
  LT(1);

  // baseValue in liter
  private final double baseValue;

  VolumeUnit(double baseValue) {
    this.baseValue = baseValue;
  }

  @Override
  public double getBaseValue() {
    return this.baseValue;
  }
}
