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

        // Asks the user to insert month
        System.out.print("Please insert a month of the year in numeric form: ");
        month = keyboard.nextInt();
        // Asks the user to insert day
        System.out.print("Please insert a day of the month in numeric form: ");
        day = keyboard.nextInt();
        // Asks user to insert year
        System.out.print("Please insert a two digit year: ");
        year = keyboard.nextInt();

        // if else statement to determine if the year is magic or not
        if((month * day) == year)
        {
           System.out.println("\n-The date you inserted is: " + month + "/" + day + "/" + year);
           System.out.println(magicS + "\n");
        }
        else
        {
           System.out.println("\n-The date you inserted is: " + month + "/" + day + "/" + year);
           System.out.println(notmagicS + "\n");
       }
    }
}
