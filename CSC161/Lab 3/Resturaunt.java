/* Allon Finezilber
   CSC-161 - C1
   Lab 3F */

import java.util.Scanner;  // Needed for the scanner
                           // class.

// This program will calculate the  price
// tip and tax of a resturaunt bill and
// display it

public class Resturaunt
{
    public static void main(String[] args)
    {

                double tax, tip, bill;

                tax = 0.0675;
                tip = 0.15;


                // Asks user price of bill
                System.out.print("How much was the bill for"
                                  + " the meal? $");
                Scanner keyboard = new Scanner(System.in);
                bill = keyboard.nextDouble();

                // Display the bill cost
                System.out.printf("The bill amount is: $" +
                                    "%.2f\n", bill);

                // Display the bill tax
                double tax1 = bill * tax;
                System.out.printf("The tax on the food " +
                                 "is: $%.2f\n"
                                 , tax1);

                // Display tip needed to leave
                double tip1 = bill * tip;
                System.out.printf("The amount of tip" +
                                  " needed to leave is: $%.2f\n"
                                , tip1);

                // Display the total of bill including
                // tax and tip
                System.out.printf("The bill total including" +
                                  " tax and tip is: $%.2f\n"
                                 , ((tip1 + tax1) + bill));
     }
}

