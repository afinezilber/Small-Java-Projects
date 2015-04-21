/* Allon Finezilber
   CSC-162
   Lab 7D */

import java.io.*;
import java.util.Scanner;

public class FileArrayDemo
{
	public static void main(String args[])
	{

		Scanner keyboard = new Scanner(System.in);
		String filename;
		int[] numbers = new int[]{1, 2, 3, 4, 5, 6, 7, 8};
		int[] test = new int[8];
		System.out.print("Please insert the file name: ");
		filename = keyboard.nextLine();
		System.out.println("Copying Number Array data into " + filename);

		try
		{
			FileArray.writeArray(numbers, filename);
		}

		catch(IOException e)
		{
			e.getMessage();
		}

		System.out.println("Copying data from " + filename +
						   " into Test Array and displaying list:\n");

		try
		{
			FileArray.readArray(test, filename);
		}

		catch(FileNotFoundException e1)
		{
			e1.getMessage();
		}

		System.out.println();
	}
}