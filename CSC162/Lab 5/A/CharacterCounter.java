/* Allon Finezilber
   CSC-162
   Lab 3D */

import java.util.Scanner;

public class CharacterCounter
{

   static int counter = 0;

   public static void main(String args[])
   {

	   char[] charArray = {'a', 'b', 'a', 'c', 'd', 'a', 'e',
	   					   'a', 'f', 'g', 'h', 'a', 'i', 'a'};
	   int n = charArray.length;
	   int index;
	   int aCounter;


	   Scanner keyboard = new Scanner(System.in);
	   System.out.println("Please insert a subscript from 0 - 13: ");
	   index = keyboard.nextInt();

	   aCounter = charCount(charArray, index, n);
	   System.out.println("\nThere are " + aCounter + " 'a's in the array.\n");
   }

   public static int charCount(char[] charArray, int index, int n)
   {

	   if(n == index)
		  return counter;

	   else
	   {
		   charCount(charArray, index, n - 1);

		   if(charArray[n - 1] == 'a')
		      {
				  counter++;
				  return counter;
			  }
		   else
			return counter;
	   }

   }
}