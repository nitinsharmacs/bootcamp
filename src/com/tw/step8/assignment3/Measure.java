package com.tw.step8.assignment3;

import java.util.Objects;

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

  @Override
  public String toString() {
    return "Measure{" +
      "value=" + value +
      ", unit=" + unit +
      '}';
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    Measure measure = (Measure) o;
    return Double.compare(measure.value, value) == 0 && unit == measure.unit;
  }

  @Override
  public int hashCode() {
    return Objects.hash(value, unit);
  }
}
