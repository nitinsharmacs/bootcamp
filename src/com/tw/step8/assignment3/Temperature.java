package com.tw.step8.assignment3;

import com.tw.step8.assignment3.Unit.TemperatureUnit;

public class Temperature {
  private final Measure measure;

  private Temperature(Measure measure) {
    this.measure = measure;
  }


  public static Temperature create(double temperature, TemperatureUnit unit) {
    return new Temperature(new Measure(temperature, unit));
  }

  public int compare(Temperature anotherTemperature) {
    return Double.compare(this.toFahrenheit(), anotherTemperature.toFahrenheit());
  }

  public double toFahrenheit() {
    return this.measure.evaluate();
  }
}
