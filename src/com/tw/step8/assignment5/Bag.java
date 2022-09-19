package com.tw.step8.assignment5;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class Bag {
  private final int capacity;
  private final List<Ball> balls;
  private final HashMap<Ball, Integer> ballsRegistry;

  public Bag() {
    this.capacity = 12;
    this.balls = new ArrayList<>();
    this.ballsRegistry = createBallEntry();

  }

  public HashMap<Ball, Integer> createBallEntry() {
    HashMap<Ball, Integer> ballsRegistry = new HashMap<>();

    ballsRegistry.put(Ball.GREEN, 3);
    ballsRegistry.put(Ball.NORMAL, 12);
    return ballsRegistry;
  }

  public boolean add(Ball ball) {
    if (this.isFull()) {
      return false;
    }

    Integer ballCount = this.ballsRegistry.get(ball);

    if (ballCount == 0) {
      return false;
    }

    this.ballsRegistry.put(ball, --ballCount);

    this.balls.add(ball);
    return true;
  }

  private boolean isFull() {
    return this.balls.size() == this.capacity;
  }
}
