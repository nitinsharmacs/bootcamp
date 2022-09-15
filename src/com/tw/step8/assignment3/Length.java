package com.tw.step8.assignment3;

import com.tw.step8.assignment3.Unit.Feet;
import com.tw.step8.assignment3.Unit.Inch;
import com.tw.step8.assignment3.Unit.Unit;

public class Length {
  private final Unit feet;
  private final Unit inch;

  private Length(Unit feet, Unit inch) {
    this.feet = feet;
    this.inch = inch;
  }

  public static Length create(int feet, int inches) {
    return new Length(new Feet(feet), new Inch(inches));
  }

  public int compare(Length otherLength) {
    if (this.feet.isGreaterThan(otherLength.feet)) {
      return 1;
    }

    if (this.feet.isEqual(otherLength.feet) && this.inch.isGreaterThan(otherLength.inch)) {
      return 1;
    }

    if (this.feet.isEqual(otherLength.feet) && this.inch.isEqual(otherLength.inch)) {
      return 0;
    }

    return -1;
  }
}
