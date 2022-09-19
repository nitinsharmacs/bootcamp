package com.tw.step8.assignment5;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class BagTest {

  @Test
  void shouldAddABallToBag() {
    Bag bag = new Bag();

    assertTrue(bag.add(new Ball()));
  }
}