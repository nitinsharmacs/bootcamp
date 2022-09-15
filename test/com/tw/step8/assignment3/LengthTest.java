package com.tw.step8.assignment3;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class LengthTest {
  @Test
  void shouldCompareTwoLengthsInFeetAndInch() {
    Length length1 = Length.create(2, Unit.FT, 1, Unit.IN);
    Length length2 = Length.create(2, Unit.FT, 0, Unit.IN);

    assertEquals(length1.compare(length2), 1);
    assertEquals(length2.compare(length1), -1);
  }

  @Test
  void shouldCompareTwoEqualLengthsFeetAndInch() {
    Length length1 = Length.create(1, Unit.FT, 0, Unit.IN);
    Length length2 = Length.create(1, Unit.FT, 0, Unit.IN);

    assertEquals(length1.compare(length2), 0);
  }

  @Test
  void shouldCompareTwoLengthsInInchAndCentimeter() {
    Length length1 = Length.create(2, Unit.IN, 1, Unit.CM);
    Length length2 = Length.create(1, Unit.IN, 0, Unit.CM);

    assertEquals(length1.compare(length2), 1);
    assertEquals(length2.compare(length1), -1);
  }

  @Test
  void shouldCompareTwoEqualLengthsInInchAndCentimeter() {
    Length length1 = Length.create(1, Unit.IN, 0, Unit.CM);
    Length length2 = Length.create(1, Unit.IN, 0, Unit.CM);

    assertEquals(length1.compare(length2), 0);
  }

  @Test
  void shouldCompareTwoLengthsInCentimeterAndMillimeter() {
    Length length1 = Length.create(2, Unit.CM, 1, Unit.MM);
    Length length2 = Length.create(1, Unit.CM, 0, Unit.MM);

    assertEquals(length1.compare(length2), 1);
    assertEquals(length2.compare(length1), -1);
  }

  @Test
  void shouldCompareTwoEqualLengthsCentimeterAndMillimeter() {
    Length length1 = Length.create(1, Unit.CM, 0, Unit.MM);
    Length length2 = Length.create(1, Unit.CM, 0, Unit.MM);

    assertEquals(length1.compare(length2), 0);
  }

  @Test
  void shouldCompareTwoLengthsInMillimeterAndInch() {
    Length length1 = Length.create(2, Unit.MM, 1, Unit.IN);
    Length length2 = Length.create(1, Unit.MM, 0, Unit.IN);

    assertEquals(length1.compare(length2), 1);
    assertEquals(length2.compare(length1), -1);
  }

  @Test
  void shouldCompareTwoEqualLengthsMillimeterAndInch() {
    Length length1 = Length.create(1, Unit.MM, 0, Unit.IN);
    Length length2 = Length.create(1, Unit.MM, 0, Unit.IN);

    assertEquals(length1.compare(length2), 0);
  }
}