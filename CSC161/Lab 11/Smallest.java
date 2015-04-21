
/* Allon Finezilber
   CSC-161 - C1
   Lab 11B */

import java.util.Scanner;  // Needed for the Scanner Class

// This program will ask the user to input a sentense and determine
// how many vowels are in the string

public class Smallest
{
    static Scanner keyboard = new Scanner(System.in);

    public static void main(String[] args)
    {
        int[] list = new int[15];
        int position;

        inputArray(list, list.length);
        System.out.println(" ");
        System.out.print("The position of the smallest element in" +
                            " the list is: ");
        position = getSmallest(list, list.length) + 1;
        System.out.println(position);
        System.out.println("The smallest elemental in the list is: " +
                           list[getSmallest(list, list.length)]);

    }

    public static void inputArray(int[] list1, int noe)
    {
        int i;
        System.out.println("Please insert numbers for the array:");
        for(i = 0; i < noe; i++)
         list1[i] = keyboard.nextInt();
    }

    public static int getSmallest(int[] list1, int noe)
    {
        int index;
        int minIndex = 0;

        for(index = 1; index < noe; index++)
          if(list1[minIndex] < list1[index])
          minIndex = index;

        return minIndex;

    }
}
