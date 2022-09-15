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
  void shouldComplementChance() throws InvalidProbabilityException {
    Chance chance = Chance.createChance(0.3);

    Chance expected = Chance.createChance(0.7);
    Chance actual = chance.not();

    assertEquals(expected, actual);
  }

  @Test
  void shouldANDChances() throws InvalidProbabilityException {
    Chance chance = Chance.createChance(0.3);

    Chance expected = Chance.createChance(0.12);
    Chance actual = chance.and(Chance.createChance(0.4));

    assertEquals(expected, actual);
  }

  @Test
  void shouldORChances() throws InvalidProbabilityException {
    Chance chance1 = Chance.createChance(0.3);
    Chance chance2 = Chance.createChance(0.2);

    Chance expected = Chance.createChance(0.44);
    Chance actual = chance1.or(chance2);

    assertTrue(expected.isWithin(actual, 0.01));
  }
}
