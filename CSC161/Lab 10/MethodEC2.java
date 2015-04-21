/* Allon Finezilber
   CSC-161 - C1
   Lab 10F */

import java.util.Scanner;  // Needed for the Scanner Class

public class MethodEC2
{
    public static void main(String[] args)
    {
        Double x1, x2, y1, y2;
        Double area1, circumference1, radius1, distance1, diameter1;

        // Scanner Object for the keyboard input
        Scanner keyboard = new Scanner(System.in);

        System.out.println("Please insert two cordinates for the center of the circle: ");
        x1 = keyboard.nextDouble();
        y1 = keyboard.nextDouble();

        System.out.println("\nPlease insert two cordinates for the point on the circle: ");
        x2 = keyboard.nextDouble();
        y2 = keyboard.nextDouble();

        diameter1 = radius(x1, y1, x2, y2) * 2;
        radius1 = radius(x1, y1, x2, y2);
        circumference1 = circumference(radius1);
        area1 = area(radius1);

        System.out.printf("%nThe Radius of the circle is: %.2f%n", radius1);
        System.out.printf("The Diameter of the circle is: %.2f%n" , diameter1);
        System.out.printf("The Circumference of the circle is: %.2f%n", circumference1);
        System.out.printf("The Area of the circle is: %.2f%n%n", area1);


    }

    public static double distance(double xd1, double yd1, double xd2, double yd2)
    {
        Double dd;

        dd = Math.sqrt(Math.pow((xd2 - xd1), 2) + Math.pow((yd2 - yd1), 2));

        return dd;

    }

    public static double radius(double xr1, double yr1, double xr2, double yr2)
    {
        Double dr;

        dr = Math.sqrt(Math.pow((xr2 - xr1), 2) + Math.pow((yr2 - yr1), 2));
        return dr;
    }

    public static double circumference(double cx)
    {
        double circ;

        circ = (2 * Math.PI) * cx;

        return circ;

    }

    public static double area(double ax)
    {
        double a;
        a = (Math.PI * Math.pow(ax, 2));

        return a;
    }
}

