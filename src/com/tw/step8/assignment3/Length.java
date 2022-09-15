package com.tw.step8.assignment3;

import com.tw.step8.assignment3.Unit.Feet;
import com.tw.step8.assignment3.Unit.Inch;
import com.tw.step8.assignment3.Unit.Unit;

public class Length {
  private final Unit superUnit;
  private final Unit subUnit;

  private Length(Unit superUnitValue, Unit subUnitValue) {
    this.superUnit = superUnitValue;
    this.subUnit = subUnitValue;
  }

  public static Length create(int superUnitValue, int subUnitValue) {
    return new Length(new Feet(superUnitValue), new Inch(subUnitValue));
  }

  public int compare(Length otherLength) {
    if (this.toMM() > otherLength.toMM()) {
      return 1;
    }

    if (this.toMM() == otherLength.toMM()) {
      return 0;
    }

    return -1;
  }

  public int toMM() {
    return this.superUnit.toMM() + this.subUnit.toMM();
  }
}
