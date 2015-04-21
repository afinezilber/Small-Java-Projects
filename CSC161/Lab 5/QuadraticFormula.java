/* Allon Finezilber
   CSC-161 - C1
   Lab 5F */

import java.util.Scanner;        // Needed for the Scanner class.


// This program will ask the user for the coefficients of the quadratic
// formula and display what kind of root the equation is

public class QuadraticFormula // Extra Credit
{
    public static void main(String[] args)
    {
        String result1, result2, result3;
        double a, b, c, quad;
        result1 = "-The equation has a single repeated root.";
        result2 = "-The equation has two real roots.";
        result3 = "-The equation has two complex roots.";

        // Scanner Object for the keyboard input
        Scanner keyboard = new Scanner(System.in);
        // Input for X^2
        System.out.print("Please insert the value for X^2: ");
        a = keyboard.nextDouble();
        // Input for X
        System.out.print("Please enter the value for X: ");
        b = keyboard.nextDouble();
        // Input for the constant
        System.out.print("Please enter the value for the constant term: ");
        c = keyboard.nextDouble();
        // The discriminant stored into a variable
        quad = (Math.pow(b, 2.0) - (4 * a * c));
        // If else statement to determine the type of root it is
        if (quad == 0)
            System.out.println(result1);
          if (quad < 0)
              System.out.println(result3);
            else
              System.out.println("\n" + result2);
              System.out.printf("%.2f%n", (-b + Math.sqrt(quad)/(2 * a)));
              System.out.printf("%.2f%n%n", (-b - Math.sqrt(quad)/(2 * a)));
          }
      }



