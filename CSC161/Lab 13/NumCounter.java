/* Allon Finezilber
   CSC-161 - C1
   Lab 13B */

import java.util.Scanner;  // Needed for the Scanner Class

// This program will ask the user to input numbers and it will
// counter the number of same numbers

public class NumCounter
{
    static Scanner keyboard = new Scanner(System.in);

    public static void main(String[] args)
    {
        int[][] numList = new int [1][100];
        getData(numList);

    }

    public static void getData(int[][] numList1)
    {
        int i = 0, j = 0;
        int checkNum = 0;
        int arraySize = 0;

        System.out.println("Please insert numbers to see how many are the same:");
        System.out.println("Insert a negative number to end the array.");

        for(j = 0; j < 100; j++)
        {
          checkNum = keyboard.nextInt();
          if(checkNum >= 0)
            numList1[0][j] = checkNum;
          else
            break;

          arraySize = j;
        }
        getSame(numList1, arraySize);

    }

    public static void getSame(int[][] numList2, int arraySize1)
    {
       int[][] arrayCounter = new int[arraySize1 + 1][2];
       int j = 0, k = 0;

       for(j = 0; j < arraySize1 + 1; j++)
       {
          int counter = 0;
          for(k = 0; k < arraySize1 + 1; k++)
          {
              if(numList2[0][j] == numList2[0][k])
                counter++;
          }

          for(int l = 0; l < arraySize1 + 1; l++)
          {
                arrayCounter[l][0] = numList2[0][j];
                arrayCounter[l][1] = counter;
          }


       }



    }
}



