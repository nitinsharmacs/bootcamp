package com.tw.step8.assignment4.notifier;

public class EventData {
  public final double value;

  public EventData(double value) {
    this.value = value;
  }

  public EventData() {
    this.value = 0;
  }

  @Override
  public String toString() {
    return "EventData{" +
      "value=" + value +
      '}';
  }
}
