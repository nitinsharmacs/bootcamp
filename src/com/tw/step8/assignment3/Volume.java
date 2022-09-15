package com.tw.step8.assignment3;

import com.tw.step8.assignment3.Unit.VolumeUnit;

import java.util.Objects;

public class Volume {
  private final Measure superMeasure;
  private final Measure subMeasure;

  private Volume(Measure superMeasure, Measure subMeasure) {
    this.superMeasure = superMeasure;
    this.subMeasure = subMeasure;
  }

  public static Volume create(double value1, VolumeUnit unit1, double value2, VolumeUnit unit2) {
    return new Volume(new Measure(value1, unit1), new Measure(value2, unit2));
  }

  public static Volume create(double value, VolumeUnit unit) {
    return new Volume(new Measure(value, unit), new Measure(0, VolumeUnit.GAL));
  }

  public int compare(Volume anotherVolume) {
    return Double.compare(this.toLiter(), anotherVolume.toLiter());
  }

  public double toLiter() {
    return this.superMeasure.evaluate() + this.subMeasure.evaluate();
  }

  public Volume add(Volume volume2) {
    Measure superMeasure = new Measure(this.toLiter() + volume2.toLiter(), VolumeUnit.LT);

    return new Volume(superMeasure, new Measure(0, VolumeUnit.LT));
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    Volume volume = (Volume) o;
    return Objects.equals(superMeasure, volume.superMeasure) && Objects.equals(subMeasure, volume.subMeasure);
  }

  @Override
  public int hashCode() {
    return Objects.hash(superMeasure, subMeasure);
  }
}
