package com.tw.step8.assignment3.Unit;

public class Inch implements Unit {
  private final int value;

  public Inch(int value) {
    this.value = value;
  }


  @Override
  public int toMM() {
    return this.value * 25;
  }
}
