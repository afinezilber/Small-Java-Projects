/*Allon Finezilber
  CSC-236
  Lab 1A*/

import java.io.*;
import java.util.Scanner;


public class Divide
{
	public static void main(String args[]) throws IOException
	{

		// Confirms file exists
        File file = new File("nums.dat");
        if(!file.exists())
        {
          System.out.println("The file nums.dat was not found!");
          System.exit(0);
        }
        Scanner inputFile = new Scanner(file);

		// Reads numbers from file and stores them into x and y and then
		// calls the qoutient and remainder functions
        while(inputFile.hasNext())
        {
			int counter = 0;
			int x = inputFile.nextInt();
			int y = inputFile.nextInt();

			System.out.println(x + " divided by " + y + " is: " + quotient(x, y, counter));
			System.out.println("The remainder is: " + remainder(x, y)) ;
			System.out.println();
		}

	}

	public static int quotient(int dividend, int divisor, int counter)
	{
		// Calculates the quotient of two numbers and returns the value by
		// a recursive calculation of subtracting the divisor by the dividend
		// counting each subtraction until the dividend becomes less than or
		// equal to the divisor
		if(dividend >= divisor)
		{
			counter++;
		    return quotient(dividend - divisor, divisor, counter);
		}
		else
			return counter;
    }

	public static int remainder(int dividend, int divisor)
	{

		// Calculates the remaindor by subtracting the dividend by the divisor
		// using a recursive calculation until the dividend becomes less than or
		// equal to the divisor and then it returns divisor
		if(dividend >= divisor)
		    return remainder(dividend - divisor, divisor);
		else
			return dividend;

	}
}
