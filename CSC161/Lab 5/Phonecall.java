/* Allon Finezilber
   CSC-161 - C1
   Lab 5D */

import java.util.Scanner;        // Needed for the Scanner class.


// This program will ask the user how long was thier phone conversation
// and will determine the bill of the phone call

public class Phonecall
{
    public static void main(String[] args)
    {

        String amountS;
        int minutes;
        double connection, firstThree, addition, minutesOver;
        connection = 1.99;
        firstThree = 2.0;
        addition = 0.45;
        amountS = "-The fee for your conversation from New York to New Dheli was:";

        // Scanner Object for the keyboard input
        Scanner keyboard = new Scanner(System.in);

        // Asks user for amount of minutes the conversation lasted
        System.out.print("How many minute was your phone conversation?: ");
        minutes = keyboard.nextInt();

        // The calculation for additional minutes past 3 minutes
        minutesOver = (minutes - 3.0);

        // The if statement determining the calculation of the bill
        if(minutes<=3)
            System.out.printf("%n%s $%.2f%n%n", amountS, (connection + firstThree));

        else if(minutes>3)
            System.out.printf("%n%s $%.2f%n%n", amountS, ((connection + firstThree)
                                                   + (minutesOver * addition)));

      }
}


