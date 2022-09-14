import com.tw.step8.assignment1.Rectangle;

public class Main {
  public static void main(String[] args) {
    Rectangle rectangle = new Rectangle(2, 3);
    System.out.printf("Area %f\n", rectangle.area());
    System.out.printf("Perimeter %f\n", rectangle.perimeter());
  }
}