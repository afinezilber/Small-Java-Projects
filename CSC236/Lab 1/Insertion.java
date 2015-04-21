/*Allon Finezilber
  CSC-236
  Lab 1B*/

import java.io.*;
import java.util.Scanner;

 public class Insertion
 {
	 public static void main(String args[]) throws IOException
	 {
		 Scanner keyboard = new Scanner(System.in);
		 int n, i;
		 String str;

		 // Asks user for the file name
		 System.out.print("Please enter a file name: ");
		 str = keyboard.nextLine();
		 System.out.println();

		 // Confirms existance of file
		 File file = new File(str);
         if(!file.exists())
         {
           System.out.println("The file " + str + " was not found!");
           System.exit(0);
         }
         Scanner inputFile = new Scanner(file);
		 System.out.println("Reading the first ten numbers from " + str + "\nSorting...\n");

		 // Reads and intializes the array with numbers from file
	     int[] array = new int[10];
		  for(i = 0; i < array.length; i++)
		    array[i] = inputFile.nextInt();

		 // Calls the insertionSort function
		 insertionSort(array, array.length);

		 // Displays the sorted numbers
		 System.out.println("\nNumbers Sorted");
		 System.out.println("--------------");
		 for(i = 0; i < array.length; i++)
 		   System.out.print(array[i] + "  ");

 		 System.out.println("\n\n");
	 }


	 public static void insertionSort(int arr[], int n)
     {
		 // Recursive calculation that sorts the array
         if(n > 1)
          insertionSort(arr, n - 1);

      	 insert(arr, n - 1);
     }

     public static void insert(int arr[], int m)
     {
         int i, token;
         token = arr[m];
         i = m - 1;

         while(i >= 0 && arr[i] > token)
         {
           arr[i + 1] = arr[i];
           i--;
         }
         arr[i + 1] = token;
     }
 }


