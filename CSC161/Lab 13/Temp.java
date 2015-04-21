/* Allon Finezilber
   CSC-161 - C1
   Lab 13A */

import java.util.*;  // Needed for the Scanner Class

// This program will ask the user to input high and low temps
// of each month of the year and determines the average high, low
// and highest high and lowest low.

public class Temp
{
    static Scanner keyboard = new Scanner(System.in);
    static final int ROWS = 2;
    static final int COLS = 12;

    public static void main(String[] args)
    {

        int[][] tempTable = new int[ROWS][COLS];

        getData(tempTable);
        System.out.println("The average high tempature is: " + averageHigh(tempTable));
        System.out.println("The average low tempature is: " + averageLow(tempTable));
        System.out.println("The index of the highest tempature is: Row 0, Column "
                           + indexHighTemp(tempTable));
        System.out.println("The index of the lowest tempature is: Row 1, Column "
                           + indexLowTemp(tempTable));

    }

    public static void getData(int[][]  tempTable1)
    {
        int i = 0, j = 0;

        System.out.println("*Please insert the 12 highest tempatures for each month*");
        System.out.println("*Followed by the 12 lowest tempatures for each month*");
        for(i = 0; i < tempTable1.length; i++)
           for(j = 0; j < tempTable1[i].length; j++)
             tempTable1[i][j] = keyboard.nextInt();

   }

   public static double averageHigh(int [][] tempTable1)
   {
       int i = 0, j = 0;
       int sum = 0;

       for(j = 0; j < tempTable1[i].length; j++)
         sum = sum + tempTable1[i][j];

       double avgHigh = sum / tempTable1[i].length;

       return avgHigh;
   }


   public static double averageLow(int [][] tempTable1)
   {
       int i = 1, j = 0;
       int sum = 0;

       for(j = 0; j < tempTable1[i].length; j++)
         sum = sum + tempTable1[i][j];

       double avgLow = sum / tempTable1[i].length;

       return avgLow;
   }

   public static int indexHighTemp(int[][] tempTable1)
   {

        int index;
        int highIndex = tempTable1[0][0];
        int highIndex1 = 0;

        for(index = 1; index < tempTable1[0].length; index++)
          if(highIndex < tempTable1[0][index])
          {
            highIndex = tempTable1[0][index];
            highIndex1 = index;
          }


        return highIndex1;
   }

   public static int indexLowTemp(int[][] tempTable1)
   {

        int index;
        int lowIndex = tempTable1[1][0];
        int lowIndex1 = 0;

        for(index = 1; index < tempTable1[1].length; index++)
          if(lowIndex > tempTable1[1][index])
          {
            lowIndex = tempTable1[1][index];
            lowIndex1 = index;
          }


        return lowIndex1;
   }

}