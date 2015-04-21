/* Allon Finezilber
   CSC-161 - C1
   Lab 3B */

import java.util.Scanner;  // Needed for the scanner
                           // class.

// This program will calculate a cars MPG

public class MilesPerGallon
{
    public static void main(String[] args)
    {

        double gallons, miles, mpg;

        // Scanner Object for the keyboard input
        Scanner keyboard = new Scanner(System.in);

        // Ask for miles driven
        System.out.print("How many miles have you driven? ");
        miles = keyboard.nextDouble();

        // Ask for the gallons spent
        System.out.print("How many gallons did you use? ");
        gallons = keyboard.nextDouble();

        // Calculate the MPG
        mpg = miles / gallons;

        // Display the MPG
        System.out.printf("Your car drives at a "
                          + "rate of %.1f MPG.\n" , mpg);
     }
}
