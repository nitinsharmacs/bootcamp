package com.tw.step8.assignment5;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class BagTest {

  @Test
  void shouldAddABallToBag() {
    Bag bag = new Bag();

    assertTrue(bag.add(new Ball()));
  }

  @Test
  void shouldNotAddBallToBagIfBagIsFull() {
    Bag bag = new Bag();

    for (int i = 0; i < 12; i++) {
      bag.add(new Ball());
    }

    assertFalse(bag.add(new Ball()));
  }
}