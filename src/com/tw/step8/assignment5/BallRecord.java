package com.tw.step8.assignment5;

public class BallRecord {
  private final Ball name;
  private int limit;
  private int current;

  public BallRecord(Ball name, int limit, int current) {
    this.name = name;
    this.limit = limit;
    this.current = current;
  }

  public boolean canAddMore() {
    return this.limit - this.current != 0;
  }

  public void add() {
    this.current++;
  }

  public void increaseLimitBy(int delta) {
    this.limit += delta;
  }
}
