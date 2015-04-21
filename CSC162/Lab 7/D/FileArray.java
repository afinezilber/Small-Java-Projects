/* Allon Finezilber
   CSC-162
   Lab 7D */

import java.io.*;
import java.util.Scanner;

public class FileArray
{

	public static void writeArray(int numbers[], String filename) throws IOException
	{

   	  try
   	  {

     	 FileWriter fwriter = new FileWriter(filename);
   	     PrintWriter outputFile = new PrintWriter(fwriter);

		 for(int i = 0; i < numbers.length; i++)
		 {
			 outputFile.println(numbers[i]);
	     }

	     outputFile.close();
	  }

	  catch(IOException e)
	  {
		 throw e;
	  }
    }

    public static void readArray(int test[], String filename) throws FileNotFoundException
    {

		try
		{
			int j = 0;

		    File file = new File(filename);
		    Scanner inputFile = new Scanner(file);

			System.out.println(" Test Array");
			System.out.println(" ----------");

			while(inputFile.hasNext())
			{
				test[j] = inputFile.nextInt();
				System.out.println("   " + test[j]);
				j++;
			}

			inputFile.close();
		}

		catch(FileNotFoundException e1)
		{
			throw e1;
		}

	}

}