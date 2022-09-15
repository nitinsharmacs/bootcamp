package com.tw.step8.assignment3;

public class Volume {
  private final Measure superMeasure;
  private final Measure subMeasure;

  private Volume(Measure superMeasure, Measure subMeasure) {
    this.superMeasure = superMeasure;
    this.subMeasure = subMeasure;
  }

  public static Volume create(double value1, Unit unit1, double value2, Unit unit2) {
    return new Volume(new Measure(value1, unit1), new Measure(value2, unit2));
  }

  public int compare(Volume anotherVolume) {
    return Double.compare(this.toLiter(), anotherVolume.toLiter());
  }

  private double toLiter() {
    return this.superMeasure.evaluate() + this.subMeasure.evaluate();
  }
}
