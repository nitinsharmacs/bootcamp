package com.tw.step8.assignment3;

import com.tw.step8.assignment3.Unit.LengthUnit;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class LengthTest {
  @Test
  void shouldCompareTwoLengthsInSameUnits() {
    Length length1 = Length.create(2, LengthUnit.IN);
    Length length2 = Length.create(1, LengthUnit.IN);

    assertEquals(Rank.GREATER, length1.compare(length2));
    assertEquals(Rank.SMALLER, length2.compare(length1));
  }

  @Test
  void shouldCompareTwoLengthsInDifferentUnits() {
    Length length1 = Length.create(2, LengthUnit.FT);
    Length length2 = Length.create(1, LengthUnit.IN);

    assertEquals(Rank.GREATER, length1.compare(length2));
    assertEquals(Rank.SMALLER, length2.compare(length1));
  }

  @Test
  void shouldCompareTwoEqualLengthsInSameUnit() {
    Length length1 = Length.create(1, LengthUnit.FT);
    Length length2 = Length.create(1, LengthUnit.FT);

    assertEquals(Rank.EQUAL, length1.compare(length2));
  }

  @Test
  void shouldCompareTwoEqualLengthsInDifferentUnit() {
    Length length1 = Length.create(1, LengthUnit.FT);
    Length length2 = Length.create(12, LengthUnit.IN);

    assertEquals(Rank.EQUAL, length1.compare(length2));
  }

  @Test
  void shouldCompareTwoLengthsInInchAndCentimeter() {
    Length length1 = Length.create(2, LengthUnit.IN);
    Length length2 = Length.create(1, LengthUnit.CM);

    assertEquals(Rank.GREATER, length1.compare(length2));
    assertEquals(Rank.SMALLER, length2.compare(length1));
  }

  @Test
  void shouldCompareTwoEqualLengthsInInchAndCentimeter() {
    Length length1 = Length.create(2, LengthUnit.IN);
    Length length2 = Length.create(5, LengthUnit.CM);

    assertEquals(Rank.EQUAL, length1.compare(length2));
  }

  @Test
  void shouldCompareTwoLengthsInCentimeterAndMillimeter() {
    Length length1 = Length.create(2, LengthUnit.CM);
    Length length2 = Length.create(1, LengthUnit.MM);

    assertEquals(Rank.GREATER, length1.compare(length2));
    assertEquals(Rank.SMALLER, length2.compare(length1));
  }

  @Test
  void shouldCompareTwoEqualLengthsCentimeterAndMillimeter() {
    Length length1 = Length.create(1, LengthUnit.CM);
    Length length2 = Length.create(10, LengthUnit.MM);

    assertEquals(Rank.EQUAL, length1.compare(length2));
  }

  @Test
  void shouldCompareTwoLengthsInMillimeterAndInch() {
    Length length1 = Length.create(2, LengthUnit.MM);
    Length length2 = Length.create(1, LengthUnit.IN);

    assertEquals(Rank.SMALLER, length1.compare(length2));
    assertEquals(Rank.GREATER, length2.compare(length1));
  }

  @Test
  void shouldCompareTwoEqualLengthsMillimeterAndInch() {
    Length length1 = Length.create(100, LengthUnit.MM);
    Length length2 = Length.create(4, LengthUnit.IN);

    assertEquals(Rank.EQUAL, length1.compare(length2));
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