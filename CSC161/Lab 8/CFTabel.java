/* Allon Finezilber
   CSC-161 - C1
   Lab 8F */

import java.util.Scanner;  // Needed for the Scanner Class
import java.io.*;          // Needed for I/O Class

// This program will

public class CFTabel
{
    public static void main(String[] args) throws IOException
    {
         String celciusS, fahrenheitS, dashsS1, dashsS2;
         double celcius, fahrenheit;
         char degree = 176;
         celciusS = "Degrees in Celcius";
         fahrenheitS = "Degrees in Fahrenheit";
         dashsS1 = "------------------";
         dashsS2 = "---------------------";


         // Varifies the file exists
         File file = new File("Celcius.txt");
         if(!file.exists())
         {
           System.out.println("The file Celcius.txt was not found!");
           System.exit(0);
         }

        // Opens the file to read input
        Scanner inputFile = new Scanner(file);

        System.out.printf("%n%-20s %-20s%n", celciusS, fahrenheitS);
        System.out.printf("%-20s %-20s%n", dashsS1, dashsS2);

        // Calculation for the fahrenheit conversion
        while(inputFile.hasNext())
        {
          celcius = inputFile.nextDouble();
          {
            fahrenheit = (((9.0/5.0) * celcius) + 32.0);
            System.out.printf("%-20.1f %,-20.1f %n", celcius, fahrenheit);
          }
        }
          // Closes the file
          inputFile.close();

          System.out.println(" ");

    }
}



