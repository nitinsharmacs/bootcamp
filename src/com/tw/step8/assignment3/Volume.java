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

  public Rank compare(Volume anotherVolume) {
    double volume1 = this.toLiter();
    double volume2 = anotherVolume.toLiter();

    if (volume1 == volume2) {
      return Rank.EQUAL;
    }

    if (volume1 > volume2) {
      return Rank.GREATER;
    }

    return Rank.SMALLER;
  }

  public double toLiter() {
    return this.measure.evaluate();
  }

  public Volume add(Volume volume2) {
    double newVolume = this.toLiter() + volume2.toLiter();

    return Volume.create(newVolume, VolumeUnit.LT);
  }
}
