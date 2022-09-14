package com.tw.step8.assignment1;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RectangleTest {
  @Test
  void shouldDetermineRectangleArea() {
    Rectangle rectangle = Rectangle.createRectangle(1, 1);

    double area = rectangle.area();

    assertEquals(1, area);
  }

  @Test
  void shouldDetermineRectanglePerimeter() {
    Rectangle rectangle = Rectangle.createRectangle(1, 1);

    double perimeter = rectangle.perimeter();

    assertEquals(4, perimeter);
  }

  @Test
  void shouldDetermineSquareArea() {
    Rectangle square = Rectangle.createSquare(2);

    double area = square.area();

    assertEquals(4, area);
  }

  @Test
  void shouldDetermineSquarePerimeter() {
    Rectangle square = Rectangle.createSquare(2);

    double perimeter = square.perimeter();
    
    assertEquals(8, perimeter);
  }
}