package com.tw.step8.assignment3;

import com.tw.step8.assignment3.Unit.VolumeUnit;

public class Volume {
  private final Measure measure;

  private Volume(Measure measure) {
    this.measure = measure;
  }

  public static Volume create(double value, VolumeUnit unit) {
    return new Volume(new Measure(value, unit));
  }

  public int compare(Volume anotherVolume) {
    return Double.compare(this.toLiter(), anotherVolume.toLiter());
  }

  public double toLiter() {
    return this.measure.evaluate();
  }

  public Volume add(Volume volume2) {
    Measure measure = new Measure(this.toLiter() + volume2.toLiter(), VolumeUnit.LT);

    return new Volume(measure);
  }
}
