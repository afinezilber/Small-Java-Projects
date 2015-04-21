/* Allon Finezilber
   CSC-161 - C1
   Lab 4C */

import java.util.Scanner;        // Needed for the scanner
                                 // class.
import java.io.*;                // Needed for the I/O
                                 // class.

// This program will ask the user for assessed value and will
// calculate the property tax and store it in a txt file

public class PropertyTax
{
    public static void main(String[] args) throws IOException
    {

        // Variables
        String filename, assessedS, taxS, taxRateS, propTaxS;
        double assessed, assessedTax, taxRate, propTax, taxValue;
        assessedTax = .92;
        taxRate = 1.05;
        assessedS = "Assessed Value: ";
        taxS = "Taxable Amount: ";
        taxRateS = "Tax Rate for each $100.00: ";
        propTaxS = "Property Tax: ";

        // Scanner Object for the keyboard input
        Scanner keyboard = new Scanner(System.in);

        // Asks user to input file name
        System.out.print("Please enter the file name: ");
        filename = keyboard.nextLine();

        // Creates the filename writes the data to the file
        FileWriter fwriter = new FileWriter(filename);
        PrintWriter outputFile = new PrintWriter(fwriter);

        // Asks the user for the assessed value
        System.out.print("Please insert the assessed value: ");
        assessed = keyboard.nextDouble();

        // Calculation for property tax
        propTax = (assessed * assessedTax);
        // Calculation for the tax value
        taxValue = (propTax / 100) * taxRate;

        outputFile.printf("%-30s $%-,30.2f%n", assessedS, assessed);
        outputFile.printf("%-30s $%-,30.2f%n", taxS, propTax);
        outputFile.printf("%-30s $%-,30.2f%n", taxRateS, taxRate);
        outputFile.printf("%-30s $%-,30.2f%n", propTaxS, taxValue);

        outputFile.close();
    }
}


