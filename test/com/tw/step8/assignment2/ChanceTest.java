package com.tw.step8.assignment2;

import com.tw.step8.assignment2.exception.InvalidProbabilityException;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ChanceTest {
  @Test
  void shouldThrowInvalidProbabilityException() {
    assertThrows(InvalidProbabilityException.class, () -> Chance.createChance(100));
  }

  @Test
  void shouldGiveNotOfChance() throws InvalidProbabilityException {
    Chance chance = Chance.createChance(0.3);

    Chance expected = Chance.createChance(0.7);
    Chance actual = chance.not();

    assertEquals(expected, actual);
  }

  @Test
  void shouldGiveChanceForBothProbabilities() throws InvalidProbabilityException {
    Chance chance = Chance.createChance(0.3);

    Chance expected = Chance.createChance(0.12);
    Chance actual = chance.both(Chance.createChance(0.4));

    assertEquals(expected, actual);
  }
}