package com.tw.step8.assignment2;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CoinTest {
  @Test
  void shouldGiveChanceOfGettingTail() {
    Coin coin = new Coin();

    float chance = coin.chanceOfGettingTail();

    assertEquals(0.5, chance);
  }
}