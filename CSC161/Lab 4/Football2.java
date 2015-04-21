/* Allon Finezilber
   CSC-161 - C1
   Lab 4B */

import java.util.Scanner;        // Needed for the scanner
                                 // class.
import java.io.*;                // Needed for the I/O
                                 // class.

// This program will calculate how many football tickets
// were sold and how much they were sold for

public class Football2
{
    public static void main(String[] args) throws IOException
    {

        // Variables for the tickets, their values
        // and the file name
        String filename, ticketTS, ticketAS;
        int box, sideline, premium, general;
        int boxTkts, sidelineTkts, premiumTkts, generalTkts;
        int ticketTotal;
        double boxAmt, sidelineAmt, premiumAmt, generalAmt;
        double saleTotal;
        boxTkts = 250;
        sidelineTkts = 100;
        premiumTkts = 50;
        generalTkts = 25;
        ticketTS = "Total amount of tickets sold: ";
        ticketAS = "Total sale of tickets sold: ";

        // Scanner Object for the keyboard input
        Scanner keyboard = new Scanner(System.in);

        // Asks user to input file name
        System.out.print("Please enter the file name: ");
        filename = keyboard.nextLine();

        // Creates the filename writes the data to the file
        FileWriter fwriter = new FileWriter(filename);
        PrintWriter outputFile = new PrintWriter(fwriter);

        // Asks user for how many Box tickets sold
        System.out.print("How many Box tickets were sold? ");
        box = keyboard.nextInt();
        // Asks user for how many Sideline tickets sold
        System.out.print("How many Sideline tickets were sold? ");
        sideline = keyboard.nextInt();
        // Asks user for how many Premium tickets sold
        System.out.print("How many premium tickets were sold? ");
        premium = keyboard.nextInt();
        // Asks user for how many General tickets sold
        System.out.print("How many General tickets were sold? ");
        general = keyboard.nextInt();

        // Calculation for amount of each ticket sold
        boxAmt = (box * boxTkts);
        sidelineAmt = (sideline * sidelineTkts);
        premiumAmt = (premium * premiumTkts);
        generalAmt = (general * generalTkts);
        // Calculation for total tickets sold
        ticketTotal = (box + sideline + premium + general);
        // Calculation for total sale amount
        saleTotal = (boxAmt + sidelineAmt + premiumAmt + generalAmt);



        outputFile.printf("%-30s %-,30d%n", ticketTS, ticketTotal);
        outputFile.printf("%-30s $%-,30.2f%n", ticketAS, saleTotal);


        outputFile.close();

        System.out.print("Data written to the file\n." );
    }
}









