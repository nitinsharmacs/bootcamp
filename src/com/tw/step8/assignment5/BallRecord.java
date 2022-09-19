package com.tw.step8.assignment5;

public class BallRecord {
  private final Ball name;
  private int limit;
  private int count;

  public BallRecord(Ball name, int limit, int count) {
    this.name = name;
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

  public int getCount() {
    return this.count;
  }

  public int getLimit() {
    return this.limit;
  }
}
