package com.tw.step8.assignment3;

public class Volume {
  private final Measure measure;

  private Volume(Measure measure) {
    this.measure = measure;
  }

  public static Volume createVolume(double value, Unit unit) {
    return new Volume(new Measure(value, unit));
  }


}
