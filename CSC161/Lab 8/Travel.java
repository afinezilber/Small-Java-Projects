/* Allon Finezilber
   CSC-161 - C1
   Lab 8B */

import java.util.Scanner;  // Needed for the Scanner Class

// This program will ask the user for the mph and hours of a vehicle
// and display its distance per hour

public class Travel
{
    public static void main(String[] args)
    {
        String speedS, hoursS, dashS1, dashS2;
        int hours, speed;
        double distance;
        speedS = "Distance Traveled (Miles)";
        hoursS = "Hours Driven";
        dashS1 = "-------------";
        dashS2 = "-------------------------";


        // Scanner Object for the keyboard input
        Scanner keyboard = new Scanner(System.in);

        // Asks the user for miles and speed
        System.out.print("Please insert speed in miles the vehicle has travelled: ");
        speed = keyboard.nextInt();

        System.out.print("Please insert the amount of hours the vehicle has travelled: ");
        hours = keyboard.nextInt();

        // Calculation for the distance traveled and time
        int i;
        int j = hours;

        System.out.printf("%n%-15s %-15s%n", hoursS, speedS);
        System.out.printf("%-15s %-15s%n", dashS1, dashS2);

        for(i = 1; i <= j; i++)
           {
            distance = i * speed;
           System.out.printf("%-15d %,-15.2f%n", i, distance);
            ++hours;
           }
        System.out.println(" ");

       }
   }

