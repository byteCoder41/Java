import java.util.*;

abstract class TwoDimensionalShape {

  abstract double getArea();

}

class Circle extends TwoDimensionalShape {

  double getArea() {
    Scanner in = new Scanner(System.in);
    System.out.println("Enter the value of r: ");
    double r = in.nextDouble();
    return 3.14 * r * r;

  }

  public String toString() {
    return "I am the instance of Circle.";
  }

}

class Square extends TwoDimensionalShape {

  double getArea() {
    Scanner in = new Scanner(System.in);
    System.out.println("Enter the value of a: ");
    double a = in.nextDouble();
    return a * a;
  }

  public String toString() {
    return "I am the instance of Square.";
  }

}

class Triangle extends TwoDimensionalShape {

  double getArea() {
    Scanner in = new Scanner(System.in);
    System.out.println("Enter the value of base: ");
    double b = in.nextDouble();
    System.out.println("Enter the value of height: ");
    double h = in.nextDouble();
    return 0.5 * b * h;
  }

  public String toString() {
    return "I am the instance of Triangle.";
  }
}

public class Lab2 {
  public static void main(String args[]) {
    TwoDimensionalShape[] T = new TwoDimensionalShape[3];
    T[0] = new Circle();
    T[1] = new Square();
    T[2] = new Triangle();
    for (int i = 0; i < T.length; i++) {
      System.out.println(T[i].getArea());
      System.out.println(T[i].toString());
    }

  }
}