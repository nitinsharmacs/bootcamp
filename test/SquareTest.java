import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SquareTest {
  @Test
  void shouldDetermineSquareArea() {
    Square square = new Square(1);

    assertEquals(1, square.area());
  }

  @Test
  void shouldDetermineSquarePerimeter() {
    Square square = new Square(4);

    assertEquals(16, square.perimeter());
  }
}