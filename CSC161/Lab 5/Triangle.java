/* Allon Finezilber
   CSC-161 - C1
   Lab 5E */

import java.util.Scanner;        // Needed for the Scanner class.


// This program will ask for the length of each side of a triangle
// and determine if its a right triangle

public class Triangle
{
    public static void main(String[] args)
    {

        String triS1, triS2;
        double length1, length2, length3;
        triS1 = "-The triangle you input is a right triangle!";
        triS2 = "-The triangle you input is not a right triangle!";

        // Scanner Object for the keyboard input
        Scanner keyboard = new Scanner(System.in);

        // Asks user for the first length
        System.out.print("Please insert the first length of the triangle: ");
        length1 = keyboard.nextDouble();
        // Asks user for the second length
        System.out.print("Please insert the second length of the triangle: ");
        length2 = keyboard.nextDouble();
        // Asks user for the third length
        System.out.print("Please insert the third length of the triangle: ");
        length3 = keyboard.nextDouble();
        // The calculation to varify if the triangle is a right triangle
        if(length1 == Math.sqrt(length2 + length3)
        || length2 == Math.sqrt(length1 + length3)
        || length3 == Math.sqrt(length1 + length2))
           System.out.println("\n" + triS1 + "\n");
        else
           System.out.println("\n" + triS2 + "\n");
        }
    }
