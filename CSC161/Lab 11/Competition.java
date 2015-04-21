/* Allon Finezilber
   CSC-161 - C1
   Lab 11C */

import java.util.Scanner;  // Needed for the Scanner Class

// This program will ask the user to input a sentense and determine
// how many vowels are in the string

public class Competition
{
    static Scanner keyboard = new Scanner(System.in);

    public static void main(String[] args)
    {
        double[]list = new double[8];
        inputScore(list, list.length);
        double largest = list[(getLargest(list, list.length))];
        double smallest = list[(getSmallest(list, list.length))];
        double sum = getSum(list, list.length);
        System.out.println(" ");
        System.out.printf("The total judge score is: %.2f%n%n", (sum - largest - smallest));

    }

    public static void inputScore(double[] list1, int noe)
    {
        int i;
        System.out.println("Please insert the judge scores:\n");
        for(i = 0; i < noe; i++)
        {
        list1[i] = keyboard.nextDouble();
          if(list1[i] < 1 || list1[i] > 10)
          {
              System.out.println("That is an invalid score, please insert a new score: ");
              list1[i] = keyboard.nextDouble();
          }
        }

    }

    public static int getLargest(double[] list1, int noe)
    {
        int index;
        int maxIndex = 0;

        for(index = 1; index < noe; index++)
          if(list1[maxIndex] < list1[index])
          maxIndex = index;

        return maxIndex;

    }

    public static int getSmallest(double[] list1, int noe)
    {
        int index;
        int minIndex = 0;

        for(index = 1; index < noe; index++)
          if(list1[minIndex] > list1[index])
          minIndex = index;

        return minIndex;

    }

    public static double getSum(double[] list1, int noe)
    {
        int index;
        double sum = 0;

        for(index = 0; index < noe; index++)
          sum = sum + list1[index];

        return sum;
    }



}
