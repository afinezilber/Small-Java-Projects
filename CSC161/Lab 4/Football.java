/* Allon Finezilber
   CSC-161 - C1
   Lab 4B */

import java.util.Scanner;        // Needed for the scanner
                                 // class.
import java.io.*;                // Needed for the I/O
                                 // class.

// This program will calculate how many football tickets
// were sold and how much they were sold for

public class Football
{
    public static void main(String[] args) throws IOException
    {

        // Variables for the tickets, their values
        // and the file name
        String filename, ticketPS, ticketSS, ticketAS;
        int box, sideline, premium, general;
        int boxTkts, sidelineTkts, premiumTkts, generalTkts;
        double boxAmt, sidelineAmt, premiumAmt, generalAmt;
        boxTkts = 250;
        sidelineTkts = 100;
        premiumTkts = 50;
        generalTkts = 25;
        ticketPS = "Ticket Price";
        ticketSS = "Tickets Sold";
        ticketAS = "Sale Amount";

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

        boxAmt = box * boxTkts;
        sidelineAmt = sideline * sidelineTkts;
        premiumAmt = premium * premiumTkts;
        generalAmt = general * generalTkts;


        outputFile.printf("%s %s %s\n", ticketPS, ticketSS, ticketAS);
        outputFile.printf("%f %f $%.2f\n", boxTkts, box, boxAmt);
        outputFile.printf("%f %f $%.2f\n", sidelineTkts, sideline, sidelineAmt);
        outputFile.printf("%f %f $%.2f\n", premiumTkts, premium, premiumAmt);
        outputFile.printf("%f %f $%.2f\n", generalTkts, general, generalAmt);

        outputFile.close();

        System.out.println("Data written to the file.");
    }
}









