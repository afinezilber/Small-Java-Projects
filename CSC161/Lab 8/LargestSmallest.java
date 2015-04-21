/* Allon Finezilber
   CSC-161 - C1
   Lab 8E */

import java.util.Scanner;  // Needed for the Scanner Class

// This program will ask the user integers with a sentinel of -99
// to determine which one is the largest and smallest numbers

public class LargestSmallest
{
    public static void main(String[] args)
    {
        int num1, max, min;

        // Scanner Object for the keyboard input
        Scanner keyboard = new Scanner(System.in);

        // Asks user to input numbers and use -99 as sentinel
        System.out.println("*Enter -99 to end your inputs*");
        System.out.print("Please insert the first number: ");
        num1 = keyboard.nextInt();

        min = num1;
        max = num1;

        // Calculation to determine the max and min number
        while(num1 != -99)
            {
             if(num1>max)
               max = num1;
             else if(num1<min)
                min = num1;

             System.out.print("Please insert your next number: ");
             num1 = keyboard.nextInt();
            }
       System.out.println("\nThe maximum number is: " + max);
       System.out.println("The minimum number is: " + min);
       System.out.println(" ");
   }
}
