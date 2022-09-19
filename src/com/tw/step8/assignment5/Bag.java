package com.tw.step8.assignment5;

import java.util.ArrayList;

public class Bag {
  private final int capacity;
  private final ArrayList<Ball> balls;

  public Bag() {
    this.capacity = 12;
    this.balls = new ArrayList<>();
  }

  public boolean add(Ball ball) {
    if (this.isFull()) {
      return false;
    }

    this.balls.add(ball);
    return true;
  }

  private boolean isFull() {
    return this.balls.size() == this.capacity;
  }
}
