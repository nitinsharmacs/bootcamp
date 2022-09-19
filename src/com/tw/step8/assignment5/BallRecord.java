package com.tw.step8.assignment5;

public class BallRecord {
  private final Ball color;
  private int limit;
  private int count;

  public BallRecord(Ball color, int limit, int count) {
    this.color = color;
    this.limit = limit;
    this.count = count;
  }

  public boolean canAddMore() {
    return this.limit - this.count != 0;
  }

  public void add() {
    this.count++;
  }

  public void increaseLimitBy(int delta) {
    this.limit += delta;
  }

  public double futureOccupancy(int totalBalls) {
    return (this.count + this.limit + 1.0) / (totalBalls + 1);
  }
}
