package com.tw.step8.assignment3.Unit;

public class Feet implements Unit {
  private final int value;

  public Feet(int value) {
    this.value = value;
  }

  public int toMM() {
    return this.value * 300;
  }

}
