/* Allon Finezilber
   CSC-161 - C1
   Lab 6B */

import java.util.Scanner;        // Needed for the Scanner class.


// This program will ask the user to input a day month and year
// and determine if its considered a magic month

public class MagicMonth
{
    public static void main(String[] args)
    {
        String magicS, notmagicS;
        int day, month, year;
        magicS = "-This date is magic!";
        notmagicS = "-This date is not magic!";

        // Scanner Object for the keyboard input
        Scanner keyboard = new Scanner(System.in);

        System.out.print("Please insert a month of the year in numeric form: ");
        month = keyboard.nextInt();

        System.out.print("Please insert a day of the month in numeric form: ");
        day = keyboard.nextInt();

        System.out.print("Please insert a two digit year: ");
        year = keyboard.nextInt();

        if((month * day) == year)
           System.out.print("\n" + magicS + "\n");
        else
           System.out.print("\n" + notmagicS + "\n");
       }
   }
