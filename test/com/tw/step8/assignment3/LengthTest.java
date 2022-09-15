package com.tw.step8.assignment3;

import com.tw.step8.assignment3.Unit.LengthUnit;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class LengthTest {
  @Test
  void shouldCompareTwoLengthsInFeetAndInch() {
    Length length1 = Length.create(2, LengthUnit.FT, 1, LengthUnit.IN);
    Length length2 = Length.create(2, LengthUnit.FT, 0, LengthUnit.IN);

    assertEquals(length1.compare(length2), 1);
    assertEquals(length2.compare(length1), -1);
  }

  @Test
  void shouldCompareTwoEqualLengthsFeetAndInch() {
    Length length1 = Length.create(1, LengthUnit.FT, 0, LengthUnit.IN);
    Length length2 = Length.create(1, LengthUnit.FT, 0, LengthUnit.IN);

    assertEquals(length1.compare(length2), 0);
  }

  @Test
  void shouldCompareTwoLengthsInInchAndCentimeter() {
    Length length1 = Length.create(2, LengthUnit.IN, 1, LengthUnit.CM);
    Length length2 = Length.create(1, LengthUnit.IN, 0, LengthUnit.CM);

    assertEquals(length1.compare(length2), 1);
    assertEquals(length2.compare(length1), -1);
  }

  @Test
  void shouldCompareTwoEqualLengthsInInchAndCentimeter() {
    Length length1 = Length.create(1, LengthUnit.IN, 0, LengthUnit.CM);
    Length length2 = Length.create(1, LengthUnit.IN, 0, LengthUnit.CM);

    assertEquals(length1.compare(length2), 0);
  }

  @Test
  void shouldCompareTwoLengthsInCentimeterAndMillimeter() {
    Length length1 = Length.create(2, LengthUnit.CM, 1, LengthUnit.MM);
    Length length2 = Length.create(1, LengthUnit.CM, 0, LengthUnit.MM);

    assertEquals(length1.compare(length2), 1);
    assertEquals(length2.compare(length1), -1);
  }

  @Test
  void shouldCompareTwoEqualLengthsCentimeterAndMillimeter() {
    Length length1 = Length.create(1, LengthUnit.CM, 0, LengthUnit.MM);
    Length length2 = Length.create(1, LengthUnit.CM, 0, LengthUnit.MM);

    assertEquals(length1.compare(length2), 0);
  }

  @Test
  void shouldCompareTwoLengthsInMillimeterAndInch() {
    Length length1 = Length.create(2, LengthUnit.MM, 1, LengthUnit.IN);
    Length length2 = Length.create(1, LengthUnit.MM, 0, LengthUnit.IN);

    assertEquals(length1.compare(length2), 1);
    assertEquals(length2.compare(length1), -1);
  }

  @Test
  void shouldCompareTwoEqualLengthsMillimeterAndInch() {
    Length length1 = Length.create(1, LengthUnit.MM, 0, LengthUnit.IN);
    Length length2 = Length.create(1, LengthUnit.MM, 0, LengthUnit.IN);

    assertEquals(length1.compare(length2), 0);
  }

  @Test
  void shouldAddTwoLengthsWithSameUnit() {
    Length length1 = Length.create(1, LengthUnit.IN);
    Length length2 = Length.create(1, LengthUnit.IN);

    Length expectedLength = Length.create(2, LengthUnit.IN);

    assertEquals(expectedLength.toInch(), length1.add(length2).toInch(), 0.1);
  }

  @Test
  void shouldAddTwoLengthsOfDifferentUnits() {
    Length length1 = Length.create(2, LengthUnit.IN);
    Length length2 = Length.create(2.5, LengthUnit.CM);

    Length expectedLength = Length.create(3, LengthUnit.IN);

    assertEquals(expectedLength.toInch(), length1.add(length2).toInch(), 0.1);
  }
}