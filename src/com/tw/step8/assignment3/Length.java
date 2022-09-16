package com.tw.step8.assignment3;

import com.tw.step8.assignment3.Unit.LengthUnit;

import java.util.Objects;

public class Length {
  private final Measure measure;
  private static final double INCH_IN_UNIT_MM = 0.0394;

  private Length(Measure measure) {
    this.measure = measure;
  }

  public static Length create(double value, LengthUnit unit) {
    return new Length(new Measure(value, unit));
  }

  public int compare(Length otherLength) {
    return Double.compare(this.toMM(), otherLength.toMM());

  }

  public Length add(Length length2) {
    Measure measure = new Measure(this.toInch() + length2.toInch(), LengthUnit.IN);

    return new Length(measure);
  }

  public double toMM() {
    return this.measure.evaluate();
  }

  public double toInch() {
    return this.toMM() * INCH_IN_UNIT_MM;
  }

  @Override
  public String toString() {
    return "Length{" +
      "superMeasure=" + measure +
      '}';
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    Length length = (Length) o;
    return Objects.equals(measure, length.measure);
  }

  @Override
  public int hashCode() {
    return Objects.hash(measure);
  }
}
