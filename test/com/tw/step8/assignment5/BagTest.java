package com.tw.step8.assignment5;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class BagTest {

  @Test
  void shouldAddABallToBag() {
    Bag bag = Bag.createBag();

    assertTrue(bag.add(Ball.NORMAL));
  }

  @Test
  void shouldNotAddBallToBagIfBagIsFull() {
    Bag bag = Bag.createBag();

    for (int i = 0; i < 12; i++) {
      bag.add(Ball.NORMAL);
    }

    assertFalse(bag.add(Ball.NORMAL));
  }

  @Test
  void shouldAddGreenBall() {
    Bag bag = Bag.createBag();


    assertTrue(bag.add(Ball.GREEN));
  }

  @Test
  void shouldNotAddMoreThanThreeGreenBalls() {
    Bag bag = Bag.createBag();

    bag.add(Ball.GREEN);
    bag.add(Ball.GREEN);
    bag.add(Ball.GREEN);

    assertFalse(bag.add(Ball.GREEN));
  }

  @Test
  void shouldNotAddRedBallsIfNoGreenBallsAdded() {
    Bag bag = Bag.createBag();

    assertFalse(bag.add(Ball.RED));
  }

  @Test
  void shouldAddRedBallIfGreenAdded() {
    Bag bag = Bag.createBag();

    bag.add(Ball.GREEN);

    assertTrue(bag.add(Ball.RED));
  }

  @Test
  void shouldAddOnlyTwiceRedBallsOfGreenBalls() {
    Bag bag = Bag.createBag();

    bag.add(Ball.GREEN);

    bag.add(Ball.RED);
    bag.add(Ball.RED);

    assertFalse(bag.add(Ball.RED));
  }

  @Test
  void shouldNotAddYellowBall() {
    Bag bag = Bag.createBag();


    assertFalse(bag.add(Ball.YELLOW));
  }

  @Test
  void shouldAddYellowBall() {
    Bag bag = Bag.createBag();

    bag.add(Ball.GREEN);
    bag.add(Ball.GREEN);

    assertTrue(bag.add(Ball.YELLOW));
  }
}