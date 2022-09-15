package com.tw.step8.assignment3.Unit;

public enum TemperatureUnit implements Unit {
  C(2.12),
  F(1);


  private final double fahrenheit;

  TemperatureUnit(double fahrenheit) {
    this.fahrenheit = fahrenheit;
  }


  @Override
  public double getBaseValue() {
    return this.fahrenheit;
  }
}
