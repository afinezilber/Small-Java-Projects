/* Allon Finezilber
   CSC-162
   Lab 3E */

import java.util.Scanner;

public class MaxElementDemo
{
   public static void main(String args[])
   {
	   int[] intArray = {2, 12, 1999, 99, 100, 4, 7, 300};
	   int index;
	   int n = intArray.length;
	   int highest;

       Scanner keyboard = new Scanner(System.in);

       System.out.println("Please insert a subscript for the array between 0 - 7:");
       index = keyboard.nextInt();
	   System.out.println();
	   highest = maxElement(intArray, index, n);
	   System.out.println("The largest value in the array is: " + highest +"\n");

   }

   public static int maxElement(int[] intArray, int index, int n)
   {
	   int x;

	   if(n == index)
	       return intArray[index];
	   else
	   {
		   x = maxElement(intArray, index, n - 1);
		   if(intArray[n - 1] > x)
		      return intArray[n - 1];
		   else
		      return x;
	   }
    }
}
