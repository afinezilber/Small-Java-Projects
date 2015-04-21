/* Allon Finezilber
   CSC-161 - C1
   Lab 4D */

import java.util.Scanner;        // Needed for the scanner
                                 // class.
import java.io.*;                // Needed for the I/O
                                 // class.

// This program will convert fahrenheit degrees to centigrade

public class Degrees
{
    public static void main(String[] args) throws IOException
    {

        String filename, fahrenheitS, centigradeS;
        double fDegrees, cDegrees;
        char degree = '°';
        fahrenheitS = "The degrees in fahrenheit is: ";
        centigradeS = "The degrees in centigrade is: ";

        // Scanner Object for the keyboard input
        Scanner keyboard = new Scanner(System.in);

        // Asks user to input file name
        System.out.print("Please enter the file name: ");
        filename = keyboard.nextLine();

        // Creates the filename writes the data to the file
        FileWriter fwriter = new FileWriter(filename);
        PrintWriter outputFile = new PrintWriter(fwriter);

        System.out.print("Please enter degrees in fahrenheit: ");
        fDegrees = keyboard.nextDouble();

        // Calculation of fahrenheit to centigrade
        cDegrees = ((5.0/9.0) * (fDegrees - 32.0));

        outputFile.printf("%-30s %.2f %c%n", fahrenheitS, fDegrees, degree);
        outputFile.printf("%-30s %.2f %c%n", centigradeS, cDegrees, degree);
        outputFile.close();
    }
}
