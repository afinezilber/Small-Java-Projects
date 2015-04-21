/* Allon Finezilber
   CSC-161 - C1
   Lab 5A */

import java.util.Scanner;        // Needed for the Scanner class.


// This program will determine if the number inputted is a
// Positive, negative or a zero and then tell the user
// what type of number it is.

public class PosNegZero
{
    public static void main(String[] args)
    {

        String positiveS, negativeS, zeroS, numS;
        double num;
        numS = "-The number you have inserted is: ";
        positiveS = " it's a positive!";
        negativeS = " it's a negative!";
        zeroS = " it's a zero!";

        // Scanner Object for the keyboard input
        Scanner keyboard = new Scanner(System.in);

        // Asks the user to input their number
        System.out.print("Please insert a positive, negative or zero number: ");
        num = keyboard.nextDouble();
        // If else statement to determine the if number is + - or zero
        if(num > 0.0)
         System.out.println("\n" + numS + num + positiveS + "\n");

          else if(num == 0.0)
             System.out.println("\n" + numS + num + zeroS + "\n");

              if(num < 0.0)
                  System.out.println("\n" + numS + num + negativeS + "\n");


     }
 }