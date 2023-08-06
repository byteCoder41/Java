
import javax.swing.JOptionPane;
import java.util.*;

public class Lab1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String shape = args[0];
        double area = 0;
        if (shape.equals("Square")) {
            double s = Double.parseDouble(args[1]);
            area = s * s;
        } else if (shape.equals("Rectangle")) {
            double l = Double.parseDouble(args[1]);
            double w = Double.parseDouble(args[2]);
            area = l * w;
        } else if (shape.equals("Parallelogram")) {
            double b = Double.parseDouble(args[1]);
            double h = Double.parseDouble(args[2]);
            area = b * h;
        } else if (shape.equals("Trapezoid")) {
            double b1 = Double.parseDouble(args[1]);
            double b2 = Double.parseDouble(args[2]);
            double h = Double.parseDouble(args[3]);
            area = ((b1 + b2) / 2) * h;
        } else if (shape.equals("Triangle")) {
            double b = Double.parseDouble(args[1]);
            double h = Double.parseDouble(args[2]);
            area = (b * h) / 2;
        } else if (shape.equals("Circle")) {
            double r = Double.parseDouble(args[1]);
            area = Math.PI * r * r;
        } else if (shape.equals("Ellipse")) {
            double a = Double.parseDouble(args[1]);
            double b = Double.parseDouble(args[2]);
            area = Math.PI * a * b;
        } else {
            System.out.println("Invalid shape");
        }
        //show the output graphically using JOptionPane


        JOptionPane.showMessageDialog(null, "The area of the " + shape + " is " + area);

        input.close();




        // System.out.println("The area of the " + shape + " is " + area);
    }
}






