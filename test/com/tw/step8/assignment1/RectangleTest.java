package com.tw.step8.assignment1;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RectangleTest {
  @Test
  void shouldDetermineRectangleArea() {
    Rectangle rectangle = new Rectangle(1, 1);
    double area = rectangle.area();

    assertEquals(1, area);

    Rectangle rectangle2 = new Rectangle(0.5, 2);

    assertEquals(1.0, rectangle2.area());
  }

  @Test
  void shouldDeterminePerimeterOfRectangle() {
    Rectangle rectangle = new Rectangle(1, 1);

    assertEquals(4, rectangle.perimeter());

    Rectangle rectangle2 = new Rectangle(1.5, 0.5);

    assertEquals(4.0, rectangle2.perimeter());
  }
}