/* Allon Finezilber
   CSC-161 - C1
   Lab 8A */

import java.util.Scanner;  // Needed for the Scanner Class

// This program will ask the user to input two numbers and the program
// will sum up all the numbers between the two

public class Summing
{
    public static void main(String[] args)
    {
        int num1, num2;
        num1 = 1;
        // Scanner Object for the keyboard input
        Scanner keyboard = new Scanner(System.in);

        // Asks user to input a number
        System.out.println("*Inserted number must be a positive, nonzero number*");
        System.out.print("Please insert your desired number: ");
        num2 = keyboard.nextInt();

        // Varifies number isnt a zero or negative
        while(0 >= num2 || num2 <num1)
        {
            System.out.println("\nThe second number input is invalid!.");
            System.out.print("Please insert a new value for the second number: ");
            num2 = keyboard.nextInt();
        }

        // Calculcation for the summing
        int counter = num1;
        int sum = 0;

        while(counter <= num2)
                    {
                         sum = sum + counter;
                         ++counter;
                     }

        System.out.println("\nThe sum of all the numbers between " + num1 + " and " + num2 + " is: " + sum + "\n");
    }
}
