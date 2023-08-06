import java.util.*;

public class First_Attempt {

  public static void square(Double s) {
    System.out.println((s * s));
  }

  public static void rectangle(Double l, Double w) {
    System.out.println((l * w));
  }

  public static void parallelogram(Double b, Double h) {
    System.out.println((b * h));
  }

  public static void trapezoid(Double b1, Double b2, Double h) {
    System.out.println(((b1 + b2) / 2) * h);
  }

  public static void triangle(Double b, Double h) {
    System.out.println((1 / 2) * b * h);
  }

  public static void circle(Double r) {
    System.out.println((3.1416) * (r * r));
  }

  public static void ellipse(Double a, Double b) {
    System.out.println((3.1416) * (a) * (b));
  }

  public static void main(String args[]) {

    Scanner in = new Scanner(System.in);

    if (args[0].equals("Square")) {
      double s = Double.parseDouble(args[1]);
      square(s);

    } else if ((args[0].equals("Rectangle"))) {

      double l = Double.parseDouble(args[1]);

      double w = Double.parseDouble(args[2]);
      rectangle(l, w);

    } else if ((args[0].equals("Parallelogram"))) {

      double b = Double.parseDouble(args[1]);

      double h = Double.parseDouble(args[2]);
      parallelogram(b, h);

    } else if ((args[0].equals("Trapezoid"))) {

      double b1 = Double.parseDouble(args[1]);

      double b2 = in.nextDouble();

      double h = Double.parseDouble(args[2]);
      trapezoid(b1, b2, h);
    } else if ((args[0].equals("Triangle"))) {

      double b = Double.parseDouble(args[1]);

      double h = Double.parseDouble(args[2]);
      triangle(b, h);
    } else if ((args[0].equals("Circle"))) {

      double r = Double.parseDouble(args[1]);
      circle(r);
    } else if ((args[0].equals("Ellipse"))) {

      double a = Double.parseDouble(args[1]);

      double b = Double.parseDouble(args[2]);
      ellipse(a, b);
    }
  in.close();
  }

}
