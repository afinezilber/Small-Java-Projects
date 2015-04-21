/* Allon Finezilber
   CSC-161 - C1
   Lab 4A */

import java.util.Scanner;        // Needed for the scanner
                                 // class.
import java.text.DecimalFormat;  // Needed for the Decimal
                                 // Format

// This program will ask the user to input a number
// and it will round it two decimal places

public class TwoDec
{
    public static void main(String[] args)
    {

        // The variable for the inputted number
        double num1;

        // Scanner Object for the keyboard input
        Scanner keyboard = new Scanner(System.in);

        //Asks user to input a number
        System.out.print("Please input a number to be rounded to "
                + "two decimal points: ");
        num1 = keyboard.nextDouble();

        // Create a DecimalFormat object.
        DecimalFormat formatter = new DecimalFormat("0.00");

        // Display the output
        System.out.print("The number you have inputted rounded"
                           + " up to: ");
        System.out.println(formatter.format(num1));

     }
}