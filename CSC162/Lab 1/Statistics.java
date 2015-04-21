/* Allon Finezilber
   CSC-162
   Lab 1EC */

import java.io.*;
import java.util.Scanner;

// This program determines a companys quartily sales from a file and displays
// growth and averages

public class Statistics
{
    static final int ROWS = 6;
    static final int COLS = 4;

    public static void main(String[] args) throws IOException
    {
         int i, j;
         double[][] sales = new double[ROWS][COLS];


         // Varifies the file exists
         File file = new File("sales.txt");
         if(!file.exists())
         {
           System.out.println("The file sales.txt was not found!");
           System.exit(0);
         }
         // Opens the file to read input
         Scanner inputFile = new Scanner(file);

         for(i = 0; i < sales.length; i++)
           for(j = 0; j < sales[i].length; j++)
           {
             sales[i][j] = inputFile.nextDouble();
           }

         // Method Calls
         displayDivision(sales);
         divisionIncDec(sales);
         totalSale(sales);
         companyIncDec(sales);
         averageSale(sales);
         highestDivision(sales);

         inputFile.close();

     }

     public static void displayDivision(double[][] sales1)
     {
         int i, j;

         for(i = 0; i < sales1.length; i++)
         {
           System.out.println("Division " + (i + 1));
           for(j = 0; j < sales1[i].length; j++)
           {
               System.out.printf("Quarter %d: $%,.2f%n",
               					(j + 1), sales1[i][j]);
           }
           System.out.println();
         }
     }

     public static void divisionIncDec(double [][] sales1)
     {
         int i, j;

         for(i = 0; i < sales1.length; i++)
         {
           System.out.println("Division " + (i + 1) + ":");
           for(j = 1; j < sales1[1].length; j++)
           {
               if(sales1[i][j] > sales1[i][j-1])
                 System.out.printf("There was an increase of $%,.2f"
                 				  + " from Quarter %d to Quarter %d%n",
                                  (sales1[i][j] - sales1[i][j-1])
                                  , j,(j + 1));
               else
                 System.out.printf("There was a decrease of $%,.2f"
                 				  + " from Quarter %d to Quarter %d%n",
                                  (sales1[i][j] - sales1[i][j-1])
                                  , j, (j + 1));
           }
           System.out.println();
         }
     }

     public static void totalSale(double[][] sales1)
     {
          int i, j;
          double q1 = 0, q2 = 0, q3 = 0, q4 = 0;

          for(i = 0, j = 0; i < sales1.length; i++)
            q1 = q1 + sales1[i][j];

          for(i = 0, j = 1; i < sales1.length; i++)
            q2 = q2 + sales1[i][j];

          for(i = 0, j = 2; i < sales1.length; i++)
            q3 = q3 + sales1[i][j];

          for(i = 0, j = 3; i < sales1.length; i++)
            q4 = q4 + sales1[i][j];

         System.out.println("The totals for each quarter" +
         					" sales the company made are: ");
         System.out.printf("Quarter 1: $%,.2f%n", q1);
         System.out.printf("Quarter 1: $%,.2f%n", q2);
         System.out.printf("Quarter 1: $%,.2f%n", q3);
         System.out.printf("Quarter 1: $%,.2f%n", q4);
         System.out.println();

     }

     public static void companyIncDec(double[][] sales1)
     {

          int i, j;
          double q1 = 0, q2 = 0, q3 = 0, q4 = 0;

          for(i = 0, j = 0; i < sales1.length; i++)
            q1 = q1 + sales1[i][j];

          for(i = 0, j = 1; i < sales1.length; i++)
            q2 = q2 + sales1[i][j];

          for(i = 0, j = 2; i < sales1.length; i++)
            q3 = q3 + sales1[i][j];

          for(i = 0, j = 3; i < sales1.length; i++)
            q4 = q4 + sales1[i][j];


         if(q2 > q1)
          System.out.printf("There was an increase of $%,.2f for the" +
                            " company from Quater 1 to Quarter 2%n"
                            , (q2 - q1));
         else
          System.out.printf("There was a decrease of $%,.2f for the" +
                            " company from Quater 1 to Quarter 2%n"
                            , (q1 - q2));

         if(q3 > q2)
          System.out.printf("There was an increase of $%,.2f for the" +
                            " company from Quater 2 to Quarter 3%n"
                            , (q3 - q2));
         else
          System.out.printf("There was a decrease of $%,.2f for the" +
                            " company from Quater 2 to Quarter 3%n"
                            , (q2 - q3));

         if(q4 > q3)
          System.out.printf("There was an increase of $%,.2f for the" +
                            " company from Quater 3 to Quarter 4%n%n"
                            , (q4 - q3));
         else
          System.out.printf("There was a decrease of $%,.2f for the" +
                            " company from Quater 3 to Quarter 4%n%n"
                            , (q3 - q4));



      }

      public static void averageSale(double[][] sales1)
      {
          int i, j;
          double q1 = 0, q2 = 0, q3 = 0, q4 = 0;

          for(i = 0, j = 0; i < sales1.length; i++)
            q1 = q1 + sales1[i][j];

          for(i = 0, j = 1; i < sales1.length; i++)
            q2 = q2 + sales1[i][j];

          for(i = 0, j = 2; i < sales1.length; i++)
            q3 = q3 + sales1[i][j];

          for(i = 0, j = 3; i < sales1.length; i++)
            q4 = q4 + sales1[i][j];

          System.out.printf
          ("The average sales of all divisions for quarter 1 is: $%,.2f%n"
          , q1 / sales1.length);
          System.out.printf
          ("The average sales of all divisions for quarter 2 is: $%,.2f%n"
          , q2 / sales1.length);
          System.out.printf
          ("The average sales of all divisions for quarter 3 is: $%,.2f%n"
          , q3 / sales1.length);
          System.out.printf
          ("The average sales of all divisions for quarter 4 is: $%,.2f%n%n"
          , q4 / sales1.length);
      }

      public static void highestDivision(double[][] sales1)
      {
          int i, j, q1 = 0, q2 = 0, q3 = 0, q4 = 0;


        for(i = 1, j = 0; i < sales1.length; i++)
          if(sales1[0][j] < sales1[i][j])
            q1 = i;

        for(i = 1, j = 1; i < sales1.length; i++)
          if(sales1[0][j] < sales1[i][j])
            q2 = i;

        for(i = 1, j = 2; i < sales1.length; i++)
          if(sales1[0][j] < sales1[i][j])
            q3 = i;

        for(i = 1, j = 3; i < sales1.length; i++)
          if(sales1[0][j] < sales1[i][j])
            q4 = i;

       System.out.printf("The highest sales in quarter" +
       					 " 1 are in division: %d%n", q1);
       System.out.printf("The highest sales in quarter" +
       					 " 2 are in division: %d%n", q2);
       System.out.printf("The highest sales in quarter" +
       					 " 3 are in division: %d%n", q3);
       System.out.printf("The highest sales in quarter" +
       					 " 4 are in division: %d%n%n", q4);
    }





 }

