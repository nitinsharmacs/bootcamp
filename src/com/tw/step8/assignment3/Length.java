package com.tw.step8.assignment3;

public class Length {
  private final int feet;
  private final int inch;

  private Length(int feet, int inch) {
    this.feet = feet;
    this.inch = inch;
  }

  public static Length create(int feet, int inches) {
    return new Length(feet, inches);
  }

  public int compare(Length otherLength) {
    if (this.feet > otherLength.feet) {
      return 1;
    }

    if (this.feet == otherLength.feet && this.inch > otherLength.inch) {
      return 1;
    }

    if (this.feet == otherLength.feet && this.inch == otherLength.inch) {
      return 0;
    }

    return -1;
  }
}
