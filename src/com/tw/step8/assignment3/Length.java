package com.tw.step8.assignment3;

import java.util.Objects;

public class Length {
  private final Measure superMeasure;
  private final Measure subMeasure;

  private Length(Measure superMeasure, Measure subMeasure) {
    this.superMeasure = superMeasure;
    this.subMeasure = subMeasure;
  }

  public static Length create(double value1, Unit unit1, double value2, Unit unit2) {
    return new Length(new Measure(value1, unit1), new Measure(value2, unit2));
  }

  public static Length create(double value, Unit unit) {
    return Length.create(value, unit, 0, unit);
  }

  public int compare(Length otherLength) {
    return Double.compare(this.toMM(), otherLength.toMM());

  }

  public Length add(Length length2) {
    System.out.println(this.toInch() + length2.toInch());
    Measure superMeasure = new Measure(this.toInch() + length2.toInch(), Unit.IN);

    return new Length(superMeasure, new Measure(0, Unit.IN));
  }

  public double toMM() {
    return this.superMeasure.evaluate() + this.subMeasure.evaluate();
  }

  public double toInch() {
    return this.toMM() * 0.0394;
  }

  @Override
  public String toString() {
    return "Length{" +
      "superMeasure=" + superMeasure +
      ", subMeasure=" + subMeasure +
      '}';
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    Length length = (Length) o;
    return Objects.equals(superMeasure, length.superMeasure) && Objects.equals(subMeasure, length.subMeasure);
  }

  @Override
  public int hashCode() {
    return Objects.hash(superMeasure, subMeasure);
  }
}
