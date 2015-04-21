/* Allon Finezilber
   CSC-161 - C1
   Lab 3D */

import java.util.Scanner;  // Needed for the scanner
                           // class.

// This program will calculate the profit
// the retailer makes from their circuit
// boards

public class CircuitBoard
{
    public static void main(String[] args)
    {
        // The variables for price and profit
        double price, profit;

        // Scanner Object for the keyboard input
        Scanner keyboard = new Scanner(System.in);

        // Ask user for price of item
        System.out.print("What is the retail price of the "
                         + "circuit board?  $");
        price = keyboard.nextDouble();

        // The calculation of the profit
        profit = price * 0.4;

        // Displaying the results
        System.out.printf("The retail price of the circuit"
                            + " is: $%.2f\n", price);
        System.out.printf("The profit the company makes is: "
                           + "$%.2f\n", profit);
    }
}


