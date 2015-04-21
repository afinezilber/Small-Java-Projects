/* Allon Finezilber
   CSC-161 - C1
   Lab 11E */

import java.util.Scanner;  // Needed for the Scanner Class

// This program will ask the user to input a sentense and determine
// how many vowels are in the string

public class People
{
    static Scanner keyboard = new Scanner(System.in);

    public static void main(String[] args)
    {
        int[] peopleTypes = new int[50];
        inputPeople(peopleTypes, peopleTypes.length);
        getResult(peopleTypes, peopleTypes.length);

    }

    public static void inputPeople(int[] list, int noe)
    {
        int i;
        System.out.println("*1- Infant | 2- Child | 3- Teenager | 4- Adult*");
        System.out.println("Please insert the type of people: ");

        for(i = 0; i < noe; i++)
        {
         list[i] = keyboard.nextInt();

          if(list[i] < 0)
           break;

          while(list[i] < 1 || list[i] > 4)
          {
              System.out.println("That is an invalid number, please insert a new number: ");
              list[i] = keyboard.nextInt();
          }

        }

    }

    public static void getResult(int[] list, int noe)
    {
        int i = 0;

        int sumInf = 0;
        int sumChild = 0;
        int sumTeen = 0;
        int sumAdult = 0;

        for(i = 0; i < noe; i++)
        {
            if(list[i] == 1)
             sumInf = sumInf + 1;
            else if(list[i] == 2)
             sumChild = sumChild + 1;
            else if(list[i] == 3)
             sumTeen = sumTeen + 1;
            else
             sumAdult = sumAdult + 1;

        }

        System.out.println(" ");
        System.out.println("Number of infants: " + sumInf);
        System.out.println("Number of children: " + sumChild);
        System.out.println("Number of teenagers: " + sumTeen);
        System.out.println("Number of adults: " + sumAdult);
    }
}


