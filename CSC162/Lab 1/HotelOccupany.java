/* Allon Finezilber
   CSC-162
   Lab 1B */

import java.util.Scanner;

// This program will determine the amount of rooms that are in a hotel
// and how many of them are being used and how many are vacant.

public class HotelOccupany
{
    public static void main(String[] args)
    {
        double floors, rooms, occupied;
        double roomsTotal = 0, occupiedTotal = 0, vacant = 0;

        // Scanner Object for the keyboard input
        Scanner keyboard = new Scanner(System.in);

        System.out.println("Please insert the number of floors"
        				   + " in the hotel: ");
        floors = keyboard.nextDouble();
        while(floors < 1)
         {
             System.out.println("That is an invalid amount of floors,"
             			        + " please insert new number of floors: ");
             floors = keyboard.nextDouble();
         }
        System.out.println();

         int i;

         for(i = 1; i <= floors; i++)
         {
             System.out.println("How many rooms are on floor " + i + "?");
             rooms = keyboard.nextDouble();
             while(rooms < 10)
             {
                 System.out.println("That is an invalid amount of rooms,"
                 				+ " please insert a new number of rooms: ");
                 rooms = keyboard.nextDouble();
             }
             roomsTotal = roomsTotal + rooms;
             System.out.println("How many rooms are occupied on floor "
             					+ i + "?");
             occupied = keyboard.nextInt();
             occupiedTotal = occupiedTotal + occupied;
             vacant = vacant + rooms - occupied;
             System.out.println();
         }

         double rate = occupiedTotal / roomsTotal;

         System.out.printf("The number of rooms in the hotel"
         				   + " is: %.0f %n", roomsTotal);
         System.out.printf("The number of occupied rooms in the"
         				   + " hotel is: %.0f %n", occupiedTotal);
         System.out.printf("The number of vacant rooms in the hotel"
         				   + " is: %.0f %n", vacant);
         System.out.printf("The occupancy rate is: %.5f %n", rate);

     }
 }