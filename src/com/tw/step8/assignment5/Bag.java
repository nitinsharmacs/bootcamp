package com.tw.step8.assignment5;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class Bag {
  private final int capacity;
  private final List<Ball> balls;
  private final BallRegistry ballsRegistry;

  private Bag(BallRegistry registry) {
    this.capacity = 12;
    this.balls = new ArrayList<>();
    this.ballsRegistry = registry;

  }

  public static Bag createBag() {
    return new Bag(BallRegistry.createBallRegistry());
  }

  public boolean add(Ball ball) {
    if (this.isFull()) {
      return false;
    }

    if (!this.ballsRegistry.register(ball)) {
      return false;
    }

    this.balls.add(ball);
    return true;
  }

  private boolean isFull() {
    return this.balls.size() == this.capacity;
  }
}
