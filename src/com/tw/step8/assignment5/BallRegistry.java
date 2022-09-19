package com.tw.step8.assignment5;

import java.util.HashMap;

public class BallRegistry {
  private final HashMap<Ball, BallRecord> registry;
  private int ballsRegistered;
  private static final double YELLOW_BALLS_MAX_OCCUPANCY = 0.4;

  private BallRegistry(HashMap<Ball, BallRecord> registry) {
    this.ballsRegistered = 0;
    this.registry = registry;
  }

  public static BallRegistry createBallRegistry() {
    HashMap<Ball, BallRecord> registry = new HashMap<>();

    registry.put(Ball.GREEN, new BallRecord(Ball.GREEN, 3, 0));
    registry.put(Ball.NORMAL, new BallRecord(Ball.NORMAL, 12, 0));
    registry.put(Ball.RED, new BallRecord(Ball.RED, 0, 0));
    registry.put(Ball.YELLOW, new BallRecord(Ball.YELLOW, 0, 0));
    registry.put(Ball.BLACK, new BallRecord(Ball.BLACK, 1, 0));
    registry.put(Ball.BLUE, new BallRecord(Ball.BLUE, 1, 0));

    return new BallRegistry(registry);
  }

  public boolean register(Ball ball) {
    BallRecord record = this.registry.get(ball);

    if (!record.canAddMore()) {
      return false;
    }

    if (ball == Ball.GREEN) {
      this.increaseRedBallCapacity();
    }

    if (ball == Ball.BLACK || ball == Ball.BLUE) {
      this.registry.get(Ball.BLUE).increaseLimitBy(-1);
      this.registry.get(Ball.BLACK).increaseLimitBy(-1);
      record.increaseLimitBy(12);
    }

    record.add();
    this.ballsRegistered += 1;

    this.updateYellowBallRecord();

    return true;
  }

  private void updateYellowBallRecord() {
    BallRecord yellowRecord = this.registry.get(Ball.YELLOW);

    if (yellowRecord.futureOccupancy(this.ballsRegistered) <= YELLOW_BALLS_MAX_OCCUPANCY) {
      yellowRecord.increaseLimitBy(1);
    }
  }


  private void increaseRedBallCapacity() {
    BallRecord record = this.registry.get(Ball.RED);

    record.increaseLimitBy(2);
  }
}
