/* Allon Finezilber
   CSC-161 - C1
   Lab 8D */

import java.util.Scanner;  // Needed for the Scanner Class

// This program will ask the user to input the number of years and
// the program will determine the average rainfall based on the months
// within the years

public class AverageRainfall
{
    public static void main(String[] args)
    {
        int years, months;
        months = 12;

        // Scanner Object for the keyboard input
        Scanner keyboard = new Scanner(System.in);

        // Asks user for number of years
        System.out.println("*Inserted number must be a positive and nonzero number*");
        System.out.print("Please enter the number of years: ");
        years = keyboard.nextInt();

        // Varifies years isnt a zero or negative number
        while(years <= 0)
        {
            System.out.println("\nThe number inserted is invalid!.");
            System.out.print("Please insert a new value for years: ");
            years = keyboard.nextInt();
        }

        int i, j = 1;
        double inches;
        double total = 0;
        double totalAvg;

        // Calculation for rainfall inches for each month of each year inserted2

        for(i = 1; i <= years; i++)
           {
               System.out.println(" ");
           for(j = 1; j <= months; j++)
           {
               System.out.print("How many inches of rainfall were there in year " + i + " month " + j + ": ");
               inches = keyboard.nextDouble();
               total = total + inches;
           }
           }
           totalAvg = total / (((j - 1) * years));
           int monthTotal = ((j - 1) * years);
           System.out.println(" ");
           System.out.println("The total of months calculated for is: " + monthTotal);
           System.out.printf("The total inches calculated for all months is: %.2f%n", total);
           System.out.printf("The average rainfall per month of all months is: %.2f%n", totalAvg);
           System.out.println(" ");
       }
   }