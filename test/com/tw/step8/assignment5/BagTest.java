package com.tw.step8.assignment5;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class BagTest {

  @Test
  void shouldAddABallToBag() {
    Bag bag = new Bag();

    assertTrue(bag.add(Ball.NORMAL));
  }

  @Test
  void shouldNotAddBallToBagIfBagIsFull() {
    Bag bag = new Bag();

    for (int i = 0; i < 12; i++) {
      bag.add(Ball.NORMAL);
    }

    assertFalse(bag.add(Ball.NORMAL));
  }

  @Test
  void shouldAddGreenBall() {
    Bag bag = new Bag();


    assertTrue(bag.add(Ball.GREEN));
  }

  @Test
  void shouldNotAddMoreThanThreeGreenBalls() {
    Bag bag = new Bag();

    bag.add(Ball.GREEN);
    bag.add(Ball.GREEN);
    bag.add(Ball.GREEN);

    assertFalse(bag.add(Ball.GREEN));
  }
}