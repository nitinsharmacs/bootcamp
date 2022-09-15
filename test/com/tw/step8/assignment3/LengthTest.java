package com.tw.step8.assignment3;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class LengthTest {
  @Test
  void shouldCompareTwoLengths() {
    Length length1 = Length.create(2, 0);
    Length length2 = Length.create(1, 0);

    assertEquals(length1.compare(length2), 1);
    assertEquals(length2.compare(length1), -1);
  }

  @Test
  void shouldCompareTwoEqualLengths() {
    Length length1 = Length.create(1, 0);
    Length length2 = Length.create(1, 0);

    assertEquals(length1.compare(length2), 0);
  }
}