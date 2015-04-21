/* Allon Finezilber
   CSC-162
   Lab 1A */

import java.util.Scanner;

// This program will ask the user to choose an internet package
// and it will display the charges based on hours used

public class InternetService1
{
    public static void main(String[] args)
    {
        int hours;
        String pack;
        char pack1;

        // Scanner Object for the keyboard input
        Scanner keyboard = new Scanner(System.in);

        // Describes the packages to the user
        System.out.println("*Please insert your desired package A, B or C*\n");
        System.out.println("Package A) $9.95 per month 10 hours access with "
                           + "$2.00 addition per hour");
        System.out.println("Package B) $13.95 per month 20 hour access with "
                           + "$1.00 addition per hour");
        System.out.println("Package C) $19.95 per month with"
        				   + " unlimited access");
        pack = keyboard.nextLine();
        pack1 = pack.charAt(0);


        switch(pack1)
        {
            case 'A':
                System.out.println("\nPlease insert amount of hours used: ");
                hours = keyboard.nextInt();
                if(hours > 10)
                  System.out.println("Your bill comes up to: $" +
                  					((hours - 10) * 2 + 9.95) + "\n");
                else
                  System.out.println("Your bill comes up to: $9.95\n");
                break;

            case 'B':
                System.out.println("\nPlease insert amount of hours used: ");
                hours = keyboard.nextInt();
                if(hours > 15)
                  System.out.println("Your bill comes up to: $"
                  					+ ((hours - 15) + 13.95) + "\n");
                else
                  System.out.println("Your bill comes up to: $13.95\n");
                break;

            case 'C':
                System.out.println("\nPlease insert amount of hours used: ");
                hours = keyboard.nextInt();
                System.out.println("\nYour bill comes up to: $19.95\n");
                break;
       }
   }
}