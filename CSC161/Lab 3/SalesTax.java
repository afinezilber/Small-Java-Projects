/* Allon Finezilber
   CSC-161 - C1
   Lab 3A */

import java.util.Scanner;  // Needed for the scanner
                           // class.

// This program will ask the user for a price
// and compute the state and county tax with it

public class SalesTax
{
    public static void main(String[] args)
    {


        double price, stateTax, countyTax, totalTax,
               saleTotal;

        stateTax = 0.04;
        countyTax = 0.02;
        totalTax = (stateTax + countyTax);


        // Scanner Object for the keyboard input
        Scanner keyboard = new Scanner(System.in);

        // Asks user for item cost
        System.out.print("What was the cost of" +
                         " your item? $");
        price = keyboard.nextDouble();

        // Displaying the item cost
        System.out.printf("The cost of your item is: $" +
                            "%.2f\n", price);

        // Displaying the state tax
        System.out.printf("The state tax of" +
                         " the item is: $%.2f\n"
                         , (stateTax * price));

        // Display the county tax
        System.out.printf("The county tax of" +
                          " the item is: $%.2f\n"
                        , (countyTax * price));

        // Displays the total tax sale
        System.out.printf("The total amount of" +
                          " tax due is: $%.2f\n"
                         , (totalTax * price));

        // Display the total of the item + tax
        saleTotal = (price * totalTax + price);
        System.out.printf("The total of the item" +
                          " including the tax is: $%.2f\n"
                          , saleTotal);

     }
}


