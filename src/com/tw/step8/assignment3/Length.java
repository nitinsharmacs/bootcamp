package com.tw.step8.assignment3;

public class Length {
  private final Measure superMeasure;
  private final Measure subMeasure;

  private Length(Measure superMeasure, Measure subMeasure) {
    this.superMeasure = superMeasure;
    this.subMeasure = subMeasure;
  }

  public static Length create(int value1, Unit unit1, int value2, Unit unit2) {
    return new Length(new Measure(value1, unit1), new Measure(value2, unit2));
  }

  public int compare(Length otherLength) {
    return Integer.compare(this.toMM(), otherLength.toMM());

  }

  public int toMM() {
    return this.superMeasure.toMM() + this.subMeasure.toMM();
  }
}
