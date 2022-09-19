package com.tw.step8.assignment5;

import java.util.HashMap;

public class BallRegistry {
  private final HashMap<Ball, Integer> registry;

  private BallRegistry(HashMap<Ball, Integer> registry) {

    this.registry = registry;
  }

  public static BallRegistry createBallRegistry() {
    HashMap<Ball, Integer> registry = new HashMap<>();

    registry.put(Ball.GREEN, 3);
    registry.put(Ball.NORMAL, 12);
    registry.put(Ball.RED, 0);

    return new BallRegistry(registry);
  }

  public boolean register(Ball ball) {
    Integer ballCount = this.registry.get(ball);

    if (ballCount == 0) {
      return false;
    }

    if (ball == Ball.GREEN) {
      this.increaseRedBallCapacity();
    }

    this.registry.put(ball, --ballCount);
    return true;
  }

  private void increaseRedBallCapacity() {
    Integer ballCount = this.registry.get(Ball.RED) + 2;

    this.registry.put(Ball.RED, ballCount);

  }
}
